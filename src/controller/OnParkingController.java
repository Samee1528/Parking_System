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

public class OnParkingController {
    public TableView tblInParking;
    public TableColumn colVehicleNumber;
    public TableColumn colVehicleType;
    public TableColumn colDriverName;
    public TableColumn colLeftTime;
    public AnchorPane onParkingContext;
    public ComboBox cmbOnPark;

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
        cmbOnPark.setValue("On Delivery");
        cmbOnPark.setItems(cmbdata);

        cmbOnPark.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            if ((cmbOnPark.getValue()).equals("In Parking")) {
                URL resource = getClass().getResource("../view/InParking.fxml");
                Parent load = null;
                try {
                    load = FXMLLoader.load(resource);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage window = (Stage) onParkingContext.getScene().getWindow();
                window.setScene(new Scene(load));
            }
        });

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
        Stage window = (Stage) onParkingContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}


