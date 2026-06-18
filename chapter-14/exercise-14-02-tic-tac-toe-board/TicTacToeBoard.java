import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeBoard extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);

        pane.setPadding(new Insets(10, 10, 10, 10));

        pane.setAlignment(Pos.CENTER);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ImageView image = null;
                int random = (int) (Math.random() * 3);

                if (random == 0) {
                    image = new ImageView("images/o.png");

                } else if (random == 1) {
                    image = new ImageView("images/x.png");
                } else {
                    image = new ImageView();
                }

                image.setFitHeight(100);
                image.setFitWidth(100);

                pane.add(image, j, i);

            }
        }

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("TicTacToeBoard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}