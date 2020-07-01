/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landmeasurement;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CalculateStageController implements Initializable {

    double output;
    DecimalFormat decFormat = new DecimalFormat("#0.00");
    
    @FXML
    private AnchorPane rPane3;
    @FXML
    private javafx.scene.control.TextField l1, l2, w1, w2;
    @FXML
    private javafx.scene.control.Label result1, result2, result3, result4, result5;
    @FXML
    private javafx.scene.image.ImageView backImg;

    public void calculate() {
        if (l1.getText().equals("") || l2.getText().equals("") || w1.getText().equals("") || w2.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setContentText("Field must not be empty!");
            alert.showAndWait();
            return;
        }
        output = (((Double.valueOf(l1.getText()) + Double.valueOf(l2.getText())) / 2) * ((Double.valueOf(w1.getText()) + Double.valueOf(w2.getText())) / 2));
        result1.setText("" + decFormat.format(output));
        
        
        result2.setText(""+decFormat.format(output/435.6));
        result3.setText(""+decFormat.format(output/653.4));
        result4.setText(""+decFormat.format(output/2613.6));
        result5.setText(""+decFormat.format(output/52272));
        
    }

    public void goBack() throws IOException {
//        Stage stage = (Stage) backImg.getScene().getWindow();
//        stage.close(); //close current stage
//
//        Parent root = FXMLLoader.load(getClass().getResource("UnitMeasure.fxml"));
//        Stage primaryStage = new Stage();
//        Scene scene = new Scene(root, Color.TRANSPARENT);
//        scene.getStylesheets().add("/landmeasurement/unitmeasure.css");
//        primaryStage.setScene(scene);
//        primaryStage.initStyle(StageStyle.UTILITY);
//        primaryStage.show();

        AnchorPane pane = FXMLLoader.load(getClass().getResource("UnitMeasure.fxml"));
        rPane3.getChildren().setAll(pane);

    }

    public void clearField() {
        l1.setText("");
        l2.setText("");
        w1.setText("");
        w2.setText("");

        result1.setText("");
        result2.setText("");
        result3.setText("");
        result4.setText("");
        result5.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
