package landmeasurement;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ShapeStageController implements Initializable {

    @FXML
    private javafx.scene.control.Label result1, result2, result3, result4, result5;
    private double inputValue;
    DecimalFormat decFormat = new DecimalFormat("#0.00");
    @FXML private TextField value;
    private ObservableList<String> unitList = FXCollections.observableArrayList("Sq. feet");
    @FXML
    private javafx.scene.layout.AnchorPane rootPane;
    @FXML
    ComboBox<String> unitBox;

    @FXML
    public void closeShape() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("UnitMeasure.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    
    
    public void convertUnit() {
        //get value
        if(value.getText().equals("")){
            inputValue = 0;
        }
        else{
            inputValue = Double.valueOf(value.getText());
        }

        //change result
        System.out.println(""+unitBox.getSelectionModel().getSelectedIndex());
        
        if(unitBox.getSelectionModel().getSelectedIndex() == 0){
            //sq. feet to all
            
            result1.setText(""+decFormat.format(inputValue));
            result2.setText(""+decFormat.format((inputValue/435.6)));
            result3.setText(""+decFormat.format((inputValue/653.4)));
            result4.setText(""+decFormat.format((inputValue/2613.6)));
            result5.setText(""+decFormat.format((inputValue/52272)));
        }
        if(unitBox.getSelectionModel().getSelectedIndex() == 1){
            //Decim  to all
            
            result1.setText(""+decFormat.format((inputValue*435.6)));
            result2.setText(""+decFormat.format((inputValue)));
            result3.setText(""+decFormat.format((inputValue/1.5)));
            result4.setText(""+decFormat.format((inputValue/6)));
            result5.setText(""+decFormat.format((inputValue/120)));
        }
        if(unitBox.getSelectionModel().getSelectedIndex() == 2){
            //Kora to all
            
            result1.setText(""+decFormat.format((inputValue*653.4)));
            result2.setText(""+decFormat.format((inputValue*1.5)));
            result3.setText(""+decFormat.format((inputValue)));
            result4.setText(""+decFormat.format((inputValue/4)));
            result5.setText(""+decFormat.format((inputValue/80)));
        }
        if(unitBox.getSelectionModel().getSelectedIndex() == 3){
            //Gonda to all
            
            result1.setText(""+decFormat.format((inputValue*2613.6)));
            result2.setText(""+decFormat.format((inputValue*6)));
            result3.setText(""+decFormat.format((inputValue*4)));
            result4.setText(""+decFormat.format((inputValue)));
            result5.setText(""+decFormat.format((inputValue/20)));
        }
        if(unitBox.getSelectionModel().getSelectedIndex() == 4){
            //Kani to all
            
            result1.setText(""+decFormat.format((inputValue*52272)));
            result2.setText(""+decFormat.format((inputValue*120)));
            result3.setText(""+decFormat.format((inputValue*80)));
            result4.setText(""+decFormat.format((inputValue*20)));
            result5.setText(""+decFormat.format((inputValue)));
        }
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        unitList.add("Decim");
        unitList.add("Kora");
        unitList.add("Gonda");
        unitList.add("Kani");
        unitBox.setItems(unitList);
        
        unitBox.getSelectionModel().selectFirst();
       
    }

}
