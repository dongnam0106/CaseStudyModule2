package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

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

    public void Submit (ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        FileWriter writer = new FileWriter(new File("File.txt"), true);
        String name = Name.getText();
        String phone = Phone.getText();
        String people = People.getText();
        String idTable = IdTable.getText();
        String date = Date.getText();

        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Tên khách hàng: "+name + "\n");
        buffer.write("Số điện thoại: "+phone + "\n");
        buffer.write("Số người: "+people + "\n");
        buffer.write("Bàn muốn đặt: "+idTable+ "\n");
        buffer.write("Ngày đặt: "+date + "\n");
        buffer.write("------------------------------------\n");
        buffer.close();

        alert.setContentText("Cảm ơn quý khánh đã sử dụng dịch vụ!");
        alert.show();
    }

    public void Reset (ActionEvent event) {
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}
