
package landmeasurement;

import com.sun.javafx.application.LauncherImpl;
import java.io.IOException;
import javafx.application.Application;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author rafid
 */
public class LandMeasurement extends Application {

    private static final int COUNT_LIMIT = 5;

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UnitMeasure.fxml"));

        Scene scene = new Scene(root, Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setTitle("Land Measurement(HK's Lab)");
        primaryStage.show();

    }

    
 
          @Override
    public void init() throws Exception {       
        
        // Perform some heavy lifting (i.e. database start, check for application updates, etc. )
        for (int i = 1; i <= COUNT_LIMIT; i++) {
            double progress =(double) i/COUNT_LIMIT;
            System.out.println("progress: " +  progress);            
            LauncherImpl.notifyPreloader(this, new Preloader.ProgressNotification(progress));
            Thread.sleep(2000);
        }
        
    }
    
    
    public static void main(String[] args) {
        System.out.println("Main fun is called");
        LauncherImpl.launchApplication(LandMeasurement.class, MyPreloader.class, args);
    }

}
