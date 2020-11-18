/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btlon;

import com.nhp.pojo.DocGia;
import com.nhp.services.DocGiaServices;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author dell
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML private TextField txtMaDocGia;
    @FXML private TextField txtTenDocGia;
    @FXML private TextField txtGioiTinh;
    @FXML private TextField txtNgaySinh;
    @FXML private TextField txtDoiTuong;
    @FXML private TextField txtBoPhan;
    @FXML private TextField txtHanThe;
    @FXML private TextField txtHanThe2;
    @FXML private TextField txtEmail;
    @FXML private TextField txtDiaChi;
    @FXML private TextField txtSDT;
    
    
    @FXML
    private void addDocGiaHandler(ActionEvent event) throws SQLException, ParseException {
        DocGia d = new DocGia(txtMaDocGia.getText(),txtTenDocGia.getText(),
                txtGioiTinh.getText(),txtNgaySinh.getText()
                ,txtDoiTuong.getText(),txtBoPhan.getText(),txtHanThe.getText()
                ,txtHanThe2.getText(),txtEmail.getText(),txtDiaChi.getText(),txtSDT.getText());
        DocGiaServices.addDocGia(d);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if(DocGiaServices.addDocGia(d)==true)
        {
            alert.setContentText("THANH CONG");
        }
        else
        {
            alert.setContentText("THAT BAT");
        }
        alert.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
