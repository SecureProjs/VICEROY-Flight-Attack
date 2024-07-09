package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
import java.util.concurrent.TimeUnit;

public class Main extends Application {

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
//Emory Wilkinson Window
    private Stage CreateControllerWindow1()
    {
    	
    	Stage controllerStage = new Stage();
        controllerStage.setTitle("HELLO WORLD");

        HelloText = new Label("Hello world!");
	Label Root = new Label("");
        //Scene can take in a "pane" which is basically any node type
        Scene debugWindow = new Scene(HelloText, 600, 500);
        controllerStage.setScene(debugWindow);
	 //Changes the coordinates of the scene
        controllerStage.setX(60);
        controllerStage.setY(100);
        //Takes away the title bar of the scene
        controllerStage.initStyle(StageStyle.UNDECORATED);
        //Creates a new scene
        Scene ColoredWindow = new Scene(Root, 600, 500);
        //Sets the background color of the new scene to black
        Root.setStyle("-fx-background-color: black;");
        //Adds scene to stage
        controllerStage.setScene(ColoredWindow);
        controllerStage.show();
        return controllerStage;
    }


}
