/**
 *
 * @author J M Githeko
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author githeko@egerton.ac.ke
 */
public class SimpleUI extends Application {

    @Override
    public void start(Stage primaryStage) {

//Declare controls
        Label pw = new Label("Enter word to translate"); //**
        TextField pwBox = new TextField(); //**
        //Create Buttons
        Button btn = new Button("Translate"); //**
        Button btn1 = new Button("Clear"); //**
        Button btn2 = new Button("Exit"); //**
        //Event handler - Lambda Expression
        btn.setOnAction(event -> handler1());
        btn1.setOnAction(event -> handler2());
        btn2.setOnAction(event -> handler3());
//Add layouts
        //Create a Grid layout - read about Grid layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        //Define an HBox (Horizontal Box layout)
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);

//Adding controls to Layouts
        grid.add(pw, 0, 2); //Add Label to grid in Column 0, row 2)
        grid.add(pwBox, 1, 2); //Add TextField to grid in Column 1, row 2)

        hbBtn.getChildren().add(btn); //**
        hbBtn.getChildren().add(btn1); //**
        hbBtn.getChildren().add(btn2); //**

        grid.add(hbBtn, 1, 4); //Add HBox to grid in Column 1, row 4)

//Set the Scene size
        Scene scene = new Scene(grid, 400, 150); //**
//Set up primary Stage
        primaryStage.setScene(scene); //Attach the Scene to the Stage
        primaryStage.setTitle("Translate!");
        primaryStage.show(); //**



    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void handler1()
    {
        System.out.println("I am translating!");
    }
    public void handler2()
    {
        System.out.println("I am clear!");
    }
    public void handler3()
    {
        System.out.println("I am exitinng!");
    }
}
