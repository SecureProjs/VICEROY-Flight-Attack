package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
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

    Label NewText;
    Label NewText2;
    Label NewText3;
    Label Emory;
    Label Eterneti;
    Label Indiya;

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
        
        Stage EmorysStage = new Stage();
        EmorysStage.setTitle("Emory");
        
        Stage EternetisStage = new Stage();
        EternetisStage.setTitle("Eterneti");
        
        Stage IndiyasStage = new Stage();
        IndiyasStage.setTitle("Indiya");

        NewText = new Label("Hello");
        NewText2 = new Label("");
        NewText3 = new Label("");
        Emory = new Label("");
        Eterneti = new Label("");
        Indiya = new Label("");
        
        //Scene can take in a "pane" which is basically any node type
        Scene debugWindow2 = new Scene(NewText, 600, 500);
        EmorysStage.setScene(debugWindow2);
        EmorysStage.setX(900);
        EmorysStage.setY(10);
        EmorysStage.initStyle(StageStyle.UNDECORATED);
        Scene EmoryW = new Scene(Emory, 600, 500);
        Emory.setStyle("-fx-background-color: black;");
        EmorysStage.setScene(EmoryW);
        
        Scene debugWindow3 = new Scene(NewText2, 600, 500);
        EternetisStage.setScene(debugWindow3);
        EternetisStage.setX(100);
        EternetisStage.setY(100);
        EternetisStage.initStyle(StageStyle.UNDECORATED);
        Scene EternetiH = new Scene(Eterneti, 600, 500);
        Eterneti.setStyle("-fx-background-color: black;");
        EternetisStage.setScene(EternetiH);
        
        Scene debugWindow4 = new Scene(NewText3, 600, 500);
        IndiyasStage.setScene(debugWindow4);
        IndiyasStage.setX(800);
        IndiyasStage.setY(400);
        IndiyasStage.initStyle(StageStyle.UNDECORATED);
        Scene IndiyaJ = new Scene(Indiya, 600, 500);
        Indiya.setStyle("-fx-background-color: black;");
        IndiyasStage.setScene(IndiyaJ);
        
        
        EmorysStage.show();
        EternetisStage.show();
        IndiyasStage.show();
        return EmorysStage;
    }
}
