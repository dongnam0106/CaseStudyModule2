package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label lblStatus;

    @FXML
    private  txtUserName;

    @FXML
    private Label txtPassword;

    public void Login(ActionEvent event) throws IOException {
        if (txtUserName.getText().equals("user") && txtPassword.getText().equals("password")) {
            lblStatus.setText("Login Success");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Kính chào quý khách!");
            alert.show();
        } else {
            lblStatus.setText("Login Failed");
        }
    }

//    public void Create(ActionEvent event) throws IOException {
//        Stage primaryStage = new Stage();
//        Parent root = FXMLLoader.load(getClass().getResource("create.fxml"));
//        Scene scene = new Scene(root);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

}
