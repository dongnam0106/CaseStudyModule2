package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateController {

    @FXML
    public TextField NewUserName;
    public PasswordField NewPassword;
    public TextField NewPhoneNum;

    public void NewAcc (ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        FileWriter writer = new FileWriter(new File("Account.txt"), true);
        String newUserName = NewUserName.getText();
        String newPassword = NewPassword.getText();
        String newPhoneNum = NewPhoneNum.getText();

        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write(newUserName + "," + newPassword + "," + newPhoneNum + ",");
        buffer.close();

        if (newUserName == null){
            alert.setContentText("Nhập user name!");
            alert.show();
        }

//        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    public void Login(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

}
