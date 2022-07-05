package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LogInController {
    public AnchorPane page;
    public JFXTextField txtUsername;
    public JFXPasswordField txtPassword;
    public Label wrongLogin;



    public void backToMainForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) page.getScene().getWindow();
        window.setScene(new Scene(load));



    }

    public void openInParking(ActionEvent actionEvent) throws IOException {
        if((txtUsername.getText()).equals("")){
            new Alert(Alert.AlertType.WARNING, "Please Enter Valid Username.", ButtonType.CLOSE).show();
            return;
        }
        if((txtPassword.getText()).equals("")){
            new Alert(Alert.AlertType.WARNING, "Please Enter Valid Password.", ButtonType.CLOSE).show();
            return;
        }

        URL resource = getClass().getResource("../view/InParking.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) page.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
