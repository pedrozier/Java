/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
/**
 *
 * @author zier
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblText;
    private Button btnBt;
    
    @FXML
    private void aBt(ActionEvent event) {
    lblText.setText("Ola, Mundo");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

}
