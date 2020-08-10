package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BookController {
    @FXML
    private TextField Name;
    public TextField Phone;
    public TextField People;
    public TextField IdTable;
    public TextField Date;
    public RadioButton OrderYes;
    public RadioButton OrderNo;

    public void Submit (ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        FileWriter writer = new FileWriter(new File("Book.txt"), true);
        String name = Name.getText();
        String phone = Phone.getText();
        String people = People.getText();
        String idTable = IdTable.getText();
        String date = Date.getText();

        if (name.equals("") || name.length()== 0
        || phone.equals("") || phone.length()==0
        || people.equals("") || people.length()==0
        || idTable.equals("") || idTable.length()==0
        || date.equals("") || date.length() == 0){
            alert.setContentText("Không để trống thông tin");
            alert.show();
        } else {
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Tên khách hàng: "+name + "\n");
            buffer.write("Số điện thoại: "+phone + "\n");
            buffer.write("Số người: "+people + "\n");
            buffer.write("Bàn muốn đặt: "+idTable+ "\n");
            buffer.write("Ngày đặt: "+date + "\n");
            buffer.write("------------------------------------\n");
            buffer.close();

            if (OrderYes.isSelected()){
                Stage primaryStage = new Stage();
                primaryStage.setTitle("Demon Restaurant");
                Parent root = FXMLLoader.load(getClass().getResource("order.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
            } else {
                ((Node) (event.getSource())).getScene().getWindow().hide();
            }
        }

    }

    public void Reset (ActionEvent event) {
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}
