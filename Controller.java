package sample.Controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField textField;


    SimpleStringProperty signinError =new SimpleStringProperty();

   @FXML
    public void initialize(){
       textField.textProperty().bind(signinError);

    }

    public void signInClicked0(ActionEvent actionEvent) {
        System.out.println("Вы нажали 0");
    }

    public void signInClicked1(ActionEvent actionEvent) {
        System.out.println("Вы нажали 1");
    }

    public void signInClicked2(ActionEvent actionEvent) {
        System.out.println("Вы нажали 2");
    }

    public void signInClicked3(ActionEvent actionEvent) {
        System.out.println("Вы нажали 3");
    }

    public void signInClicked4(ActionEvent actionEvent) {
        System.out.println("Вы нажали 4");
    }

    public void signInClicked5(ActionEvent actionEvent) {
        System.out.println("Вы нажали 5");
    }

    public void signInClicked6(ActionEvent actionEvent) {
        System.out.println("Вы нажали 6");
    }

    public void signInClicked7(ActionEvent actionEvent) {
        System.out.println("Вы нажали 7");
    }

    public void signInClicked8(ActionEvent actionEvent) {
        System.out.println("Вы нажали 8");
    }

    public void signInClicked9(ActionEvent actionEvent) {
        System.out.println("Вы нажали 9");
    }

    public void signInClickedPlus(ActionEvent actionEvent) {
        System.out.println("Вы нажали +");
    }

    public void signInClickedMinus(ActionEvent actionEvent) {
        System.out.println("Вы нажали -");
    }

    public void signInClicked1Multiply(ActionEvent actionEvent) {
        System.out.println("Вы нажали *");
    }

    public void signInClicked1Split(ActionEvent actionEvent) {
        System.out.println("Вы нажали /");
    }

    public void signInClickedReset(ActionEvent actionEvent) {
        System.out.println("Вы нажали C");
    }

    public void signInClickedPoint(ActionEvent actionEvent) {
        System.out.println("Вы нажали .");
    }
    public void signInClickedEqually(ActionEvent actionEvent) {
        System.out.println("Вы нажали =");
    }
}
