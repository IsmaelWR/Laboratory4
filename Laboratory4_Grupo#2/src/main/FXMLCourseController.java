/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Course;
import domain.ListException;
import domain.Student;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author sofia
 */
public class FXMLCourseController implements Initializable {

    private DoubleLinkedList coursesList;
    @FXML
    private BorderPane bp;
    @FXML
    private Button btnAdd;
    @FXML
    private TableView<Course> coursesTableView;
    @FXML
    private TableColumn<Course, String> idTableColumn;
    @FXML
    private TableColumn<Course, String> nameTableColumn;
    @FXML
    private TableColumn<Course, String> creditsTableColumn;
      
    //private DoubleLinkedList courseList;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        this.coursesList = util.Utility.getDoubleLinkedList(); //cargo la lista
//        idTableColumn.setCellValueFactory(new PropertyValueFactory<>("Id"));
//        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
//        creditsTableColumn.setCellValueFactory(new PropertyValueFactory<>("Credits"));
//        try{
//            if(coursesList!=null && !coursesList.isEmpty()){
//                for(int i=1; i<=coursesList.size(); i++) {
//                    coursesTableView.getItems().add((Courses)coursesList.getNode(i).data);
//                }
//            }
//        }catch(ListException ex){
//            //Mostrar la excepción: Student list is empty
//        }
    }    

    @FXML
    private void btnAddOnAction(ActionEvent event) {
        FXMLMainMenuController.loadPage(getClass().getResource("FXMLAddCourses.fxml"), bp);
    }
    
}
