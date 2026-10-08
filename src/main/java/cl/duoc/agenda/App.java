package cl.duoc.agenda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class App extends Application {

    @Override
    public void init() {
        System.out.println("1. init()");
    }

    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("2. start()");

        FXMLLoader loader = new FXMLLoader(App.class.getResource("principal.fxml"));
        Scene escena = new Scene(loader.load(), 640, 400);

        stage.setTitle("Agenda de Contactos");
        stage.setScene(escena);
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