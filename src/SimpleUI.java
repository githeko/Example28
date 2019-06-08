import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
     Button btn1 = new Button(); //**
      Button btn2 = new Button("Exit"); //**
        //Event handler - Lambda Expression

        //Lambda expressions failed so I reverted to anonymous classes for handlers...
      /* btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("I am translating!");
            }
        });

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("I am Clearing!");
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("I am Clearing!");
            }
        }); */
/
          btn1.setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent e) {
                  System.out.println("I am Translating!");
              }
          });
          btn1.setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent e) {
                  System.out.println("I am Clearing!");
              }
          });
          btn2.setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent e) {
                  System.out.println("I am Exiting!");
              }
          });





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
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    }




