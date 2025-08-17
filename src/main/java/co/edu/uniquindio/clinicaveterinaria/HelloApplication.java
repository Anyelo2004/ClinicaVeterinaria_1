package co.edu.uniquindio.clinicaveterinaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/co/edu/uniquindio/clinicaveterinaria/MenuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 400);
        stage.setTitle("Mundo Huellitas - Menú Principal");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

    }
}
