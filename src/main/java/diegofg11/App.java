package diegofg11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hola Mundo JavaFX!");
        Scene scene = new Scene(label, 400, 200);
        stage.setScene(scene);
        stage.setTitle("Hola JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
