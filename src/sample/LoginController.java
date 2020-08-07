package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginController {
    @FXML
    private Label lblStatus;

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    String user = "";
    String pass = "";
    public LoginController() throws IOException {
//        FileReader reader = new FileReader("Account.txt");
//        BufferedReader test1 = new BufferedReader(reader);
//        String ahihi = test1.readLine();
//        String[] abc = ahihi.split(",");
//        user = abc[0];
//        pass = abc[1];
    }

    public void Login(ActionEvent event) throws IOException {
        if (txtUserName.getText().equals(user) && txtPassword.getText().equals(pass)) {
//            lblStatus.setText("Login Success");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("book.fxml"));
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

    public void Create(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("create.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
