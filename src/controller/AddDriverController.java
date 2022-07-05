package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class AddDriverController {
    public JFXTextField txtDriverName;
    public JFXTextField txtNic;
    public JFXTextField txtDriverLicenseNo;
    public JFXTextField txtAddress;
    public JFXTextField txtContactNo;


    public void addDriverUpdateOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION, "Successfully Added.", ButtonType.CLOSE).show();

    }
}
