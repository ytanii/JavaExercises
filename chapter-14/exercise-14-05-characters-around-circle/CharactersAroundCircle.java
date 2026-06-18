import javafx.application.Application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CharactersAroundCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        StackPane pane1 = new StackPane();
        String str = "WELCOME TO JAVA ";
        pane1.setAlignment(Pos.CENTER);

        DoubleProperty centerX = new SimpleDoubleProperty();
        centerX.bind(pane1.widthProperty().divide(2));
        DoubleProperty centerY = new SimpleDoubleProperty();
        centerY.bind(pane1.heightProperty().divide(2));


        for (int i = 0; i < str.length(); i++) {
            Text text = new Text(Character.toString(str.charAt(i)));
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 22));
            text.xProperty().bind(centerX.add(50 * (Math.cos(Math.toRadians(22.5 * i)))));
            text.yProperty().bind(centerY.add(50 * (Math.sin(Math.toRadians(22.5 * i)))));
            text.setRotate(90 + (22.5 * i));
            pane.getChildren().add(text);
        }

        pane1.getChildren().add(pane);
        Scene scene = new Scene(pane1, 300, 300);
        primaryStage.setTitle("TextCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}