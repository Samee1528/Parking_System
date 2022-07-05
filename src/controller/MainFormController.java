package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainFormController {

    public AnchorPane mainFormContext;
    public JFXTextField txtType;
    public JFXComboBox cmbVehicle;
    public JFXComboBox cmbDriver;
    public JFXTextField dateTime;
    public JFXTextField txtSlotNumber;
    String[] vehicle = new String[14];

    int count = 0;
    int c = 0;


    public void openParkVehicle(ActionEvent actionEvent) throws IOException {

        for(int i=0;i<vehicle.length;i++) {
            if ((cmbVehicle.getValue()).equals(vehicle[i])) {
                new Alert(Alert.AlertType.WARNING, "This already Parked.", ButtonType.CLOSE).show();
                return;
            }
        }
        vehicle[count]= String.valueOf((cmbVehicle.getValue()));
        txtSlotNumber.setText((""));
        txtType.setText("");

        new Alert(Alert.AlertType.CONFIRMATION, "Vehicle Parked.", ButtonType.CLOSE).show();

    }

    public void openLogIn(ActionEvent actionEvent) throws IOException {
//        URL resource = getClass().getResource("../view/LogIn.fxml");
//        Parent load = FXMLLoader.load(resource);
//        Scene scene = new Scene(load);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();

        URL resource = getClass().getResource("../view/LogIn.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mainFormContext.getScene().getWindow();
        window.setScene(new Scene(load));


    }

    public void openOnDilivery(ActionEvent actionEvent) {
        for(int i=0;i<vehicle.length;i++) {
            if ((cmbVehicle.getValue())!=(vehicle[i])) {
                c++;
            }
        }

        if(c==14){
            new Alert(Alert.AlertType.WARNING, "This isn't Parked.", ButtonType.CLOSE).show();
            c=0;
            return;
        }
        for(int i=0;i<vehicle.length;i++){
            if((cmbVehicle.getValue()).equals(vehicle[i])){
                vehicle[i]=null;

            }
            txtSlotNumber.setText((""));
            txtType.setText("");
        }
        new Alert(Alert.AlertType.CONFIRMATION, "Vehicle Delivered.", ButtonType.CLOSE).show();
        c=0;



    }

    public void initialize() {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        dateTime.setText(formatter.format(date));

        ObservableList<String> obvehicles = FXCollections.observableArrayList(
                "NA-3434",
                "KA-4563",
                "58-3567",
                "GF-4358",
                "CCB-3568",
                "LM-6679",
                "QA-3369",
                "KB-3668 ",
                "JJ-9878",
                "GH-5772",
                "XY-4456",
                "YQ-3536 ",
                "CBB-3566",
                "QH-3444"
        );
        cmbVehicle.setItems(obvehicles);

        cmbVehicle.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            for (int x = 0; x < vehicle.length; x++) {
                if ((cmbVehicle.getValue()).equals(vehicle[x])) {
                    txtType.setText("");
                    txtSlotNumber.setText(("Invalid Vehicle."));
                    return;
                }
            }


            if ((cmbVehicle.getValue()).equals("NA-3434")) {
                txtType.setText("Bus");
                count = 13;
                txtSlotNumber.setText(("14"));
            } else {
                if ((cmbVehicle.getValue()).equals("KA-4563")) {
                    txtType.setText("Van");
                    for (int i = 0; i < 4; i++) {
                        if (vehicle[i] == null) {
                            count = i;
                            txtSlotNumber.setText((String.valueOf(i + 1)));
                            return;
                        }
                    }
                    for (int i = 11; i < 13; i++) {
                        if (vehicle[i] == null) {
                            count = i;
                            txtSlotNumber.setText((String.valueOf(i + 1)));
                            break;
                        }
                    }
                } else {
                    if ((cmbVehicle.getValue()).equals("58-3567")) {
                        txtType.setText("Van");
                        for (int i = 0; i < 4; i++) {
                            if (vehicle[i] == null) {
                                count = i;
                                txtSlotNumber.setText((String.valueOf(i + 1)));
                                return;
                            }
                        }
                        for (int i = 11; i < 13; i++) {
                            if (vehicle[i] == null) {
                                count = i;
                                txtSlotNumber.setText((String.valueOf(i + 1)));
                                break;
                            }
                        }
                    } else {
                        if ((cmbVehicle.getValue()).equals("GF-4358")) {
                            txtType.setText("Van");
                            for (int i = 0; i < 4; i++) {
                                if (vehicle[i] == null) {
                                    count = i;
                                    txtSlotNumber.setText((String.valueOf(i + 1)));
                                    return;
                                }
                            }
                            for (int i = 11; i < 13; i++) {
                                if (vehicle[i] == null) {
                                    count = i;
                                    txtSlotNumber.setText((String.valueOf(i + 1)));
                                    break;
                                }
                            }
                        } else {
                            if ((cmbVehicle.getValue()).equals("CCB-3568")) {
                                txtType.setText("Van");
                                for (int i = 0; i < 4; i++) {
                                    if (vehicle[i] == null) {
                                        count = i;
                                        txtSlotNumber.setText((String.valueOf(i + 1)));
                                        return;
                                    }
                                }
                                for (int i = 11; i < 13; i++) {
                                    if (vehicle[i] == null) {
                                        count = i;
                                        txtSlotNumber.setText((String.valueOf(i + 1)));
                                        break;
                                    }
                                }
                            } else {
                                if ((cmbVehicle.getValue()).equals("LM-6679")) {
                                    txtType.setText("Van");
                                    for (int i = 0; i < 4; i++) {
                                        if (vehicle[i] == null) {
                                            count = i;
                                            txtSlotNumber.setText((String.valueOf(i + 1)));
                                            return;
                                        }
                                    }
                                    for (int i = 11; i < 13; i++) {
                                        if (vehicle[i] == null) {
                                            count = i;
                                            txtSlotNumber.setText((String.valueOf(i + 1)));
                                            break;
                                        }
                                    }
                                } else {
                                    if ((cmbVehicle.getValue()).equals("QA-3369")) {
                                        txtType.setText("Van");
                                        for (int i = 0; i < 4; i++) {
                                            if (vehicle[i] == null) {
                                                count = i;
                                                txtSlotNumber.setText((String.valueOf(i + 1)));
                                                return;
                                            }
                                        }
                                        for (int i = 11; i < 13; i++) {
                                            if (vehicle[i] == null) {
                                                count = i;
                                                txtSlotNumber.setText((String.valueOf(i + 1)));
                                                break;
                                            }
                                        }
                                    } else {
                                        txtType.setText("Cargo Lorry");
                                        for (int i = 4; i < 12; i++) {
                                            if (vehicle[i] == null) {
                                                count = i;
                                                txtSlotNumber.setText((String.valueOf(i + 1)));
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            // }
        });
        ObservableList<String> obdrivers = FXCollections.observableArrayList(
                "Sumith Kumara",
                "Amila Pathirana",
                "Jithmal Perera",
                "Sumith Dissanayaka",
                "Sumanasiri Herath",
                "Awantha Fernando",
                "Charith Sudara",
                "Prashan Dineth",
                "Chethiya Dilan",
                "Dushantha Perera",
                "Sumith Udayanga",
                "Dinesh Udara",
                "Udana Chathuranga",
                "Mohommad Riaz",
                "Sandun Kumara",
                "Priyanga Perera"
        );
        cmbDriver.setItems(obdrivers);
    }
}