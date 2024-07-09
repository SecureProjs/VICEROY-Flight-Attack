package Hello;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class World extends Application {

    Label HelloText;

    //The first method that should be called
    public static void main(String[] args) {
        launch(args);
    }

    //The first actual method called after launch
    @Override
    public void start(Stage primaryStage) {

        primaryStage = CreateControllerWindow();
        
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }

    //Creates a basic window
    private Stage CreateControllerWindow()
    {
    	
    	Stage controllerStage = new Stage();
        controllerStage.setTitle("HELLO WORLD");

        HelloText = new Label("Hello world!");
        //Scene can take in a "pane" which is basically any node type
        Scene debugWindow = new Scene(HelloText, 600, 500);
        controllerStage.setScene(debugWindow);

        return controllerStage;
    }
    
    //Simulate keypress (I hope)
    {  	
   
    	  Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_A);
          robot.keyRelease(KeyEvent.VK_A);   
}
    //Simulate multiple keypresses at once (i hope)
    {
    	Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_WINDOWS);
    	robot.keyPress(KeyEvent.VK_S);  // earlier key still pressed
    	robot.keyRelease(KeyEvent.VK_S);
    	robot.keyRelease(KeyEvent.VK_WINDOWS);
    	
    }
}
