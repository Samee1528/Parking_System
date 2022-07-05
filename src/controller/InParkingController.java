package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class InParkingController {
    public TableView tblInParking;
    public TableColumn colVehicleNumber;
    public TableColumn colVehicleType;
    public TableColumn colParkingSlot;
    public TableColumn colParkedTime;
    public AnchorPane inParkingContext;
    public ComboBox cmbParking;

    public void addVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddVehicle.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void initialize () {
        ObservableList<String> cmbdata = FXCollections.observableArrayList(
                "In Parking",
                "On Delivery"
        );
        cmbParking.setValue("In Parking");
        cmbParking.setItems(cmbdata);

        cmbParking.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            if ((cmbParking.getValue()).equals("On Delivery")) {
                URL resource = getClass().getResource("../view/OnParking.fxml");
                Parent load = null;
                try {
                    load = FXMLLoader.load(resource);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage window = (Stage) inParkingContext.getScene().getWindow();
                window.setScene(new Scene(load));
            }
        });

    }

    public void logOutOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LogIn.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) inParkingContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void addDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDriver.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }


    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) inParkingContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
