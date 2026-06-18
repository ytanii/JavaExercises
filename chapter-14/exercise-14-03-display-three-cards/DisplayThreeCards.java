import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Random;

public class DisplayThreeCards extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();

        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);

        int[] cards = new int[52];
        for (int i = 0; i < 52; i++) {
            cards[i] = i + 1;
        }
        shuffle(cards);

        for (int i = 0; i < 3; i++) {
            hBox.getChildren().add(new ImageView("images/" + Integer.toString(cards[i]) + ".png"));
        }

        Scene scene = new Scene(hBox);
        primaryStage.setTitle("Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static void shuffle(int[] cards) {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }

    }
}