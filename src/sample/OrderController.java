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
        FileWriter writer = new FileWriter(new File("Order.txt"),true);

        BufferedWriter buffer = new BufferedWriter(writer);
        if (DuoiKhungLong.isSelected()){
            buffer.write("Đuôi khủng long \n");
        }

        if (VayCaMap.isSelected()){
            buffer.write("Vây cá mập \n");
        }

        if (MongGioVoi.isSelected()){
            buffer.write("Móng giò voi \n");
        }

        if (LongSuTu.isSelected()){
            buffer.write("Lòng sư tử \n");
        }

        if (NuocKhoang.isSelected()){
            buffer.write("Nước khoáng \n");
        }

        if (TraTranh.isSelected()){
            buffer.write("Trà tranh \n");
        }

        if (TraSua.isSelected()){
            buffer.write("Trà sữa \n");
        }

        if (Bia.isSelected()){
            buffer.write("Bia \n");
        }

        if (RuouNoi.isSelected()){
            buffer.write("Rượu nội \n");
        }

        if (RuouNgoai.isSelected()){
            buffer.write("Rượu ngoại \n");
        }
        buffer.write("--------------------------\n");
        buffer.close();
    }
}
