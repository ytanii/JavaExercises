import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.LinkedList;

public class StoreNumbers extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hBoxTop = new HBox();
        HBox hBoxButtons = new HBox();
        TextField textField = new TextField();
        Button sortButton = new Button("Sort");
        Button shuffleButton = new Button("Shuffle");
        Button reverseButton = new Button("Reverse");
        BorderPane borderPane = new BorderPane();
        NumbersPane numbersPane = new NumbersPane();
        ScrollPane scrollPane = new ScrollPane(numbersPane);


        HBox.setHgrow(textField, Priority.ALWAYS);
        hBoxTop.getChildren().add(new Text("Enter a number:"));
        hBoxTop.getChildren().add(textField);
        hBoxTop.setAlignment(Pos.CENTER_LEFT);
        hBoxTop.setSpacing(5);
        hBoxTop.setPadding(new Insets(5));

        hBoxButtons.getChildren().addAll(sortButton, shuffleButton, reverseButton);
        hBoxButtons.setAlignment(Pos.CENTER);
        hBoxButtons.setSpacing(10);
        hBoxButtons.setPadding(new Insets(5));


        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);


        borderPane.setCenter(numbersPane);
        borderPane.setTop(hBoxTop);
        borderPane.setBottom(hBoxButtons);
        borderPane.setCenter(scrollPane);


        sortButton.setOnAction(e -> numbersPane.sort());
        shuffleButton.setOnAction(e -> numbersPane.shuffle());
        reverseButton.setOnAction(e -> numbersPane.reverse());
        textField.setOnAction(e -> {
            String text = textField.getText().trim();
            if (!text.isEmpty()) {
                numbersPane.add(Integer.valueOf(text));
                textField.clear();
            }
        });


        Scene scene = new Scene(borderPane, 450, 200);
        primaryStage.setTitle("StoreNumbers");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private class NumbersPane extends Pane {

        LinkedList<Integer> list = new LinkedList<>();

        Text text = new Text();


        public NumbersPane() {
            text.setX(5);
            text.setY(20);
            getChildren().add(text);
        }


        public void add(Integer integer) {
            if (!list.contains(integer)) {
                list.add(integer);
            }
            update();

        }

        public void shuffle() {
            Collections.shuffle(list);
            update();
        }

        public void sort() {
            Collections.sort(list);
            update();
        }

        public void reverse() {
            list.sort(Collections.reverseOrder());
            update();
        }


        public void update() {
            text.setText(list.toString().replaceAll("[\\[\\],]", ""));
        }
    }

}
