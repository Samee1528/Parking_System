package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;

public class AddVehicleController {
    public JFXTextField txtVehicleNumber;
    public JFXTextField txtMaximumWight;
    public JFXTextField txtNoOfPassenger;
    public JFXTextField txtVehicleType;
    public AnchorPane vehicle;

    public void addVehicleUpdateOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION, "Successfully Added.", ButtonType.CLOSE).show();

    }
}
