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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author rafid
 */
public class UnitStageController implements Initializable {

    @FXML
    private javafx.scene.image.ImageView backImage;
    @FXML
    private javafx.scene.layout.AnchorPane rPane2;

    /**
     * Initializes the controller class.
     */

    @FXML
    public void closeUnit() throws IOException {
//        Stage stage = (Stage) backImage.getScene().getWindow();
//        stage.close(); //close current stage
//        
//        
//         Parent root = FXMLLoader.load(getClass().getResource("UnitMeasure.fxml"));
//        Stage primaryStage = new Stage();
//        Scene scene = new Scene(root,Color.TRANSPARENT);
//        scene.getStylesheets().add("/landmeasurement/unitmeasure.css");
//        primaryStage.setScene(scene);
//        primaryStage.initStyle(StageStyle.UTILITY);
//        primaryStage.show();

AnchorPane pane = FXMLLoader.load(getClass().getResource("UnitMeasure.fxml"));
        rPane2.getChildren().setAll(pane);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
