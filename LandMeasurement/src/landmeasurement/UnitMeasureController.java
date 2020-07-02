/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landmeasurement;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author rafid
 */
public class UnitMeasureController implements Initializable {

    @FXML
    private javafx.scene.layout.AnchorPane rootPane;
    @FXML
    private javafx.scene.layout.AnchorPane unitLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    public void unitStage() throws IOException {
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setContentText("Measure Unit");
//        alert.showAndWait();
        System.out.println("Working");
//        Stage stage = (Stage) unitLabel.getScene().getWindow();
//        stage.close(); //close current stage
//
//        Parent root = FXMLLoader.load(getClass().getResource("UnitStage.fxml"));
//        Stage primaryStage = new Stage();
//        Scene scene = new Scene(root, Color.TRANSPARENT);
//        scene.getStylesheets().add("/landmeasurement/unitmeasure.css");
//        primaryStage.setScene(scene);
//        primaryStage.initStyle(StageStyle.UTILITY);
//        primaryStage.show();

        AnchorPane pane = FXMLLoader.load(getClass().getResource("UnitStage.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void calculateStage() throws IOException {
//        Stage stage = (Stage) unitLabel.getScene().getWindow();
//        stage.close(); //close current stage
//
//        Parent root = FXMLLoader.load(getClass().getResource("CalculateStage.fxml"));
//        Stage primaryStage = new Stage();
//        Scene scene = new Scene(root, Color.TRANSPARENT);
//        scene.getStylesheets().add("/landmeasurement/unitmeasure.css");
//        primaryStage.setScene(scene);
//        primaryStage.initStyle(StageStyle.UTILITY);
//        primaryStage.show();

        AnchorPane pane = FXMLLoader.load(getClass().getResource("CalculateStage.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void convertUnit() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("ShapeStage.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void formulaView() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("FormulaStage.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void unknownShape() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("UnknownShapeStage.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    public void changeArrow() {

        unitLabel.setCursor(Cursor.HAND);
        String style = "-fx-background-color: #000000;";
        unitLabel.setStyle(style);
    }

}
