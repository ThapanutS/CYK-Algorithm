package GUI;
/*
"Producer"
Thapanut Saripat
Trisinchai Kamjamnong
Piyabute Chairiboon
Sirapop Promrit
Kanittee Rodpuek
#Made when 25/03/2021
 */
import CYKAlgorithm.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class DetailCellController implements Initializable {

    @FXML
    public TextArea detail_cell;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(CYK.backUptable.get(CYK.page).getInfo(CYK.getRow(),CYK.getCol()) + "ปริ้นออก");
        detail_cell.setText(CYK.backUptable.get(CYK.page).getInfo(CYK.getRow(),CYK.getCol()));
    }
}
