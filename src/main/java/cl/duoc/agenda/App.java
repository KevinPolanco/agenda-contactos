package cl.duoc.agenda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void init() {
        System.out.println("1. init()");
    }

    @Override
    public void start(Stage stage) {
        System.out.println("2. start()");
        StackPane raiz = new StackPane(new Label("Agenda de Contactos"));
        stage.setTitle("Agenda de Contactos");
        stage.setScene(new Scene(raiz, 640, 400));
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println("3. stop()");
    }

    public static void main(String[] args) {
        launch(args);
    }
}