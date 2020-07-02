/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landmeasurement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author rafid
 */
public class UnknownShapeStageController implements Initializable {
@FXML AnchorPane r4Pane;

 @FXML
    public void closeShape() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("UnitMeasure.fxml"));
        r4Pane.getChildren().setAll(pane);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
