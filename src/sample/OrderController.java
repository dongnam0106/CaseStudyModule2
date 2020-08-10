package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.io.*;

public class OrderController {
    BookController bookController = new BookController();
    @FXML
    public CheckBox DuoiKhungLong;
    public CheckBox VayCaMap;
    public CheckBox MongGioVoi;
    public CheckBox LongSuTu;
    public CheckBox NuocKhoang;
    public CheckBox TraTranh;
    public CheckBox TraSua;
    public CheckBox Bia;
    public CheckBox RuouNoi;
    public CheckBox RuouNgoai;


    public void Order (ActionEvent event) throws IOException {
        FileWriter writer = new FileWriter(new File("Order.txt"));

        BufferedWriter buffer = new BufferedWriter(writer);
        if (DuoiKhungLong.isSelected()){
            buffer.write("Đuôi khủng long");
            buffer.close();
        }

        if (VayCaMap.isSelected()){
            buffer.write("Vây cá mập");
            buffer.close();
        }

        if (MongGioVoi.isSelected()){
            buffer.write("Móng giò voi");
            buffer.close();
        }

        if (LongSuTu.isSelected()){
            buffer.write("Lòng sư tử");
            buffer.close();
        }

        if (NuocKhoang.isSelected()){
            buffer.write("Nước khoáng");
            buffer.close();
        }

        if (TraTranh.isSelected()){
            buffer.write("Trà tranh");
            buffer.close();
        }

        if (TraSua.isSelected()){
            buffer.write("Trà sữa");
            buffer.close();
        }

        if (Bia.isSelected()){
            buffer.write("Bia");
            buffer.close();
        }

        if (RuouNoi.isSelected()){
            buffer.write("Rượu nội");
            buffer.close();
        }

        if (RuouNgoai.isSelected()){
            buffer.write("Rượu ngoại");
            buffer.close();
        }
    }
}
