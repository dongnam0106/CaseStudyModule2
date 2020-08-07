package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class KhachHangController {
    @FXML
    Label nameLabel;
    @FXML
    Label sdtLabel;
    @FXML
    Label tableIdLabel;

    public void setKhachHang(KhachHang khachHang){
        nameLabel.setText(khachHang.getName());
        sdtLabel.setText(String.valueOf(khachHang.getSdt()));
        tableIdLabel.setText(String.valueOf(khachHang.getTableId()));
    }
}
