/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class Student implements Person {

    private String id;
    private String name;
    private int age;
    private String address;

    public Student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student(Student student){
        this.id =  student.id;
        this.name = student.name;
        this.age = student.age;
        this.address = student.address;
    }
    
   

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getAddress() {
        return address;
    }
    
    public String getId() {
        return id;
    }
    
    public double studyHours() {
        return age / 2;
    }
    
     @Override
    public boolean equals(Person other) {
        if (!(other instanceof Person)) {
           return false; 
        }
        Student s = (Student)other;
        return id.equals(s.id);
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + '}';
    }
}//end class
