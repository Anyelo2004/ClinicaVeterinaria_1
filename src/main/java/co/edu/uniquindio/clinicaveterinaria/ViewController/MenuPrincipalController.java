package co.edu.uniquindio.clinicaveterinaria.ViewController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuPrincipalController {

    @FXML
    private void abrirMascota() {
        cargarVentana("Mascota.fxml", "Gestión de Mascotas");
    }

    @FXML
    private void abrirVeterinario() {
        cargarVentana("Veterinario.fxml", "Gestión de Veterinarios");
    }

    @FXML
    private void abrirAgenda() {
        cargarVentana("Agenda.fxml", "Agenda");
    }

    @FXML
    private void abrirConsulta() {
        cargarVentana("Consulta.fxml", "Consulta");
    }

    @FXML
    private void abrirHistorial() {
        cargarVentana("Historial.fxml", "Historial Médico");
    }

    private void cargarVentana(String fxml, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/co/edu/uniquindio/clinicaveterinaria/" + fxml));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
