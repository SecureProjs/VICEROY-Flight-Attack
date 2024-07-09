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
	Label Root = new Label("");
        //Scene can take in a "pane" which is basically any node type
        Scene debugWindow = new Scene(HelloText, 600, 500);
        controllerStage.setScene(debugWindow);
	controllerStage.setX(800);
        controllerStage.setY(100);
	controllerStage.initStyle(StageStyle.UNDECORATED);
        Scene ColoredWindow = new Scene(Root, 600, 500);
        Root.setStyle("-fx-background-color: black;");
        controllerStage.setScene(ColoredWindow);
        controllerStage.show();
        return controllerStage;
    }
//Emory Wilkinson Window
    private Stage CreateControllerWindow1()
    {
	Stage controllerStage1 = new Stage();
        controllerStage1.setTitle("New Stage");
        Label EW = new Label("");
        //Scene can take in a "pane" which is basically any node type
        Scene debugWindow = new Scene(EW, 600, 500);
        controllerStage1.setScene(debugWindow);
	 //Changes the coordinates of the scene
        controllerStage1.setX(60);
        controllerStage1.setY(100);
        //Takes away the title bar of the scene
        controllerStage1.initStyle(StageStyle.UNDECORATED);
        //Creates a new scene
        Scene ColoredWindow2 = new Scene(EW, 600, 500);
        EW.setStyle("-fx-background-color: black;");
        controllerStage1.setScene(ColoredWindow2);
        controllerStage1.show();
        return controllerStage1;
    }


}
