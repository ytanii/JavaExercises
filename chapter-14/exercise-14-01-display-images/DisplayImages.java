import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayImages extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();

        ImageView image1 = new ImageView("images/ger_flag.png");
        ImageView image2 = new ImageView("images/chn_flag.png");
        ImageView image3 = new ImageView("images/fra_flag.png");
        ImageView image4 = new ImageView("images/usa_flag.png");

        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setAlignment(Pos.CENTER);

        pane.addRow(0, image1);
        pane.addRow(0, image2);
        pane.addRow(1, image3);
        pane.addRow(1, image4);

        Scene scene = new Scene(pane, 400, 250);

        primaryStage.setTitle("GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}