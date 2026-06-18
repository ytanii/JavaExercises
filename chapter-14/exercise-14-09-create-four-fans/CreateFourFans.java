import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CreateFourFans extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();

        pane.setPadding(new Insets(0, 35, 20, 0));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                pane.add(getFan(), j, i);
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setTitle("FourFans");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private Pane getFan() {
        Pane pane = new Pane();

        Circle circle = new Circle(100, 100, 70);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        pane.getChildren().add(circle);

        for (int i = 0; i < 4; i++) {
            Arc arc = new Arc();
            arc.setFill(Color.RED);
            arc.setType(ArcType.ROUND);
            arc.setCenterX(100);
            arc.setCenterY(100);
            arc.setRadiusX(65);
            arc.setRadiusY(65);
            arc.setStartAngle(25 + (90 * i));
            arc.setLength(40);
            pane.getChildren().add(arc);
        }

        return pane;
    }

}


