package signin.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignInController {
    @FXML
    private TextField id;
    @FXML
    private PasswordField pwd;
    @FXML
    private Label errMsg;

    SimpleStringProperty signinError = new SimpleStringProperty();

    /*@FXML
    public void initialize(){
        System.out.println("SignInController's ready.Let's bind some components");
        errMsg.textProperty().bind(signinError);
    }*/

    public void signInClicked() {
        System.out.println("dgadfkihjspouhb");
    }

}
