import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Display54Cards extends Application {
    @Override
    public void start(Stage primaryStage) {

        GridPane pane = getFullCardsImages();
        StackPane pane1 = new StackPane();

        pane.setHgap(5);
        pane.setVgap(5);


        Scene scene = new Scene(pane);
        primaryStage.setTitle("Display54Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private GridPane getFullCardsImages() {
        GridPane pane = new GridPane();
        int cardNumber = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                ImageView image = new ImageView("images/" + (cardNumber++) + ".png");
                image.setFitWidth(80);
                image.setFitHeight(150);
                image.setPreserveRatio(true);
                pane.add(image, j, i);
            }
        }

        return pane;
    }
}