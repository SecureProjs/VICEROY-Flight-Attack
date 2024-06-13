package application;
	
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
import java.util.concurrent.TimeUnit;

public class Main extends Application {

    int x = 0;
    int y = 0;
    Button Leftbutton;
    Button Downbutton;
    Label XPos;
    Label YPos;

    //The first method that should be called
    public static void main(String[] args) {
        launch(args);
    }

    //The first actual method called after launch
    @Override
    public void start(Stage primaryStage) {

        //Simplfy createtion process by splitting things into functions.
        //CreateXWindw() - sets a transparent fill around window, then calls CreateXInfo for info inside the window itself. Returns a basic window to show.
        //CreateXInfo() - creates the groups of nodes inside the window. Ideally will r+eturn some kind of collection variable IE a VBox or Hbox with all the nodes in tow
        

        primaryStage = CreateControllerWindow();
        
        try {
        	  Thread.sleep(2000);
        	} catch (InterruptedException e) {
        	  Thread.currentThread().interrupt();
        	}
        
        
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
        
        //Now create the fake trim window
        //Stage trimStage = CreateTrimWindow();
        //trimStage.show();
    }

    //Creates a basic window
    private Stage CreateControllerWindow()
    {
        Stage controllerStage = new Stage();
        controllerStage.setTitle("DEBUG MENU");

        //Scene can take in a "pane" which is basically any node type
        Scene debugWindow = new Scene(CreateDebugInfo(controllerStage), 600, 500);
        debugWindow.setFill(Color.TRANSPARENT);
        controllerStage.setScene(debugWindow);

        //Uncomment me to make the window transparent!
        //primaryStage.initStyle(StageStyle.TRANSPARENT);

        controllerStage.setX(x);
        controllerStage.setY(y);
        return controllerStage;
    }

    //Creates all the data inside of the actual controller window.
    //Params: Stage WindowToMove: what window will be moved by the left/right buttons
    //Returns: VBox buttonStack - a collection of the movement buttons and the x/y pos labels
    //Note: Returns pane, since all the nodes inherit fron that class. So it can be stuck in any scene
    private Pane CreateDebugInfo(Stage WindowToMove)
    {
        String workspaceFolder = System.getProperty("workspaceFolder");
        XPos = new Label("X position: " + x);
        //XPos.setTextFill(Color.WHITE);
        YPos = new Label("Y position: " + y);
        //YPos.setTextFill(Color.WHITE);

        Leftbutton = new Button();
        Leftbutton.setOnAction(e -> moveWindowLeft(WindowToMove,XPos) );
        Leftbutton.setText("Move Left");

        Downbutton = new Button();
        Downbutton.setOnAction(e -> moveWindowDown(WindowToMove,YPos) );
        Downbutton.setText("Move Down");
        
        VBox buttonStack = new VBox(30); //A vertical box that speces element 30 pixels apart
        buttonStack.getChildren().addAll(XPos, YPos, Leftbutton, Downbutton);
        buttonStack.setStyle("-fx-background-color: transparent;");

        return buttonStack;
    }


    private Stage CreateTrimWindow()
    {
        Stage trimStage = new Stage();
        trimStage.setTitle("TRIM");
        Scene trimWindow = new Scene(CreateTrimInfo(), 252, 361);
        trimStage.setScene(trimWindow);
        return trimStage;
    }

    private Pane CreateTrimInfo()
    {
        //creating the image object
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("Assets/Trim/EmptyTrim.png")));
        VBox root = new VBox(image);
        return root;
    }
 
    private void moveWindowLeft(Stage stage, Label XPosLabel) 
    {
        // Get the current x position of the stage
        double currentX = stage.getX();
        
        // Shift the window one pixel to the left
        stage.setX(currentX - 1);
        XPosLabel.setText("X position: " + Double.toString(stage.getX()));
    }

    private void moveWindowDown(Stage stage, Label YPosLabel) 
    {
        // Get the current x position of the stage
        double currentY = stage.getY();
        
        // Shift the window one pixel to the left
        stage.setY(currentY + 1);
        YPosLabel.setText("Y position:" + Double.toString(stage.getY()));
    }


}
