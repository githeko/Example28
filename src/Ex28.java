import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ex28 extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        // Create the Text
        Text text = new Text("A Scrolling Text!");
        // Set the Font of the Text
        text.setFont(Font.font(36));

        // Create the VBox
        VBox root = new VBox(text);
        // Set the Size of the Pane
        root.setPrefSize(400, 100);
        // Set the Style-properties of the Pane
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        // Create the Scene
        Scene scene = new Scene(root);
        // Add the Scene to the Stage
        stage.setScene(scene);
        // Set the Title of the Stage
        stage.setTitle("A simple JavaFX Animation Example");
        // Display the Stage
        stage.show();

        // Get the Width of the Scene and the Text
        double sceneWidth = scene.getWidth();
        double textWidth = text.getLayoutBounds().getWidth();

        // Define the Durations
        Duration startDuration = Duration.ZERO;
        Duration endDuration = Duration.seconds(10);

        // Create the start and end Key Frames
        KeyValue startKeyValue = new KeyValue(text.translateXProperty(), sceneWidth);
        KeyFrame startKeyFrame = new KeyFrame(startDuration, startKeyValue);
        KeyValue endKeyValue = new KeyValue(text.translateXProperty(), -1.0 * textWidth);
        KeyFrame endKeyFrame = new KeyFrame(endDuration, endKeyValue);

        // Create a Timeline
        Timeline timeline = new Timeline(startKeyFrame, endKeyFrame);
        // Let the animation run forever
        timeline.setCycleCount(Timeline.INDEFINITE);
        // Run the animation
        timeline.play();
    }
}