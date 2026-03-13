import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayRandom0or1 extends Application {
    @Override
    public void start(Stage primaryStage) {

        GridPane gridPane = get10by10TextFieldMatrix();

        Scene scene = new Scene(gridPane, 300, 260);
        primaryStage.setTitle("Matrix");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private GridPane get10by10TextFieldMatrix() {
        GridPane pane = new GridPane();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TextField textField = new TextField();
                textField.setAlignment(Pos.CENTER);
                textField.setText(Integer.toString((int) (Math.random() * 2)));
                pane.add(textField, j, i);
            }
        }
        return pane;
    }

}