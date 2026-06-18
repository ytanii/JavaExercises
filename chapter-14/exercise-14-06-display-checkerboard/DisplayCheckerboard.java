import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DisplayCheckerboard extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        StackPane pane1 = new StackPane();

        pane1.getChildren().add(pane);

        int square_number = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle();
                rectangle.widthProperty().bind(pane1.widthProperty().divide(8));
                rectangle.heightProperty().bind(pane1.heightProperty().divide(8));
                if (i % 2 == 0) {
                    if (square_number % 2 == 0) {
                        rectangle.setFill(Color.WHITE);
                    } else {
                        rectangle.setFill(Color.BLACK);
                    }

                } else {
                    if (square_number % 2 == 0) {
                        rectangle.setFill(Color.BLACK);
                    } else {
                        rectangle.setFill(Color.WHITE);
                    }

                }
                pane.addRow(i, rectangle);
                square_number++;
            }
        }

        Scene scene = new Scene(pane1, 250, 250);
        primaryStage.setTitle("DisplayCheckerboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}