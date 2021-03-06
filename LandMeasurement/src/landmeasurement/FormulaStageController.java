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
public class FormulaStageController implements Initializable {

    @FXML
    private javafx.scene.image.ImageView backImage;
    @FXML
    private javafx.scene.layout.AnchorPane rPane3;
    public void closeShape() throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("UnitMeasure.fxml"));
        rPane3.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
