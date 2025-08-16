package co.edu.uniquindio.clinicaveterinaria.ViewController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MenuInicioViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button_MenuConsulta;

    @FXML
    private Button Button_MenuHistorial;

    @FXML
    private Button Button_MenuVeterinario;

    @FXML
    private Button Button_menuAgenda;

    @FXML
    private Button Button_menuMascota;

    @FXML
    private Pane Menu_Inicio;

    @FXML
    void OnClick_Consulta(ActionEvent event) {

    }

    @FXML
    void OnClick_Historial(ActionEvent event) {

    }

    @FXML
    void OnClick_Mascota(ActionEvent event) {

    }

    @FXML
    void OnClick_Veterinario(ActionEvent event) {

    }

    @FXML
    void OnClick_agenda(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Button_MenuConsulta != null : "fx:id=\"Button_MenuConsulta\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Button_MenuHistorial != null : "fx:id=\"Button_MenuHistorial\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Button_MenuVeterinario != null : "fx:id=\"Button_MenuVeterinario\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Button_menuAgenda != null : "fx:id=\"Button_menuAgenda\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Button_menuMascota != null : "fx:id=\"Button_menuMascota\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Menu_Inicio != null : "fx:id=\"Menu_Inicio\" was not injected: check your FXML file 'hello-view.fxml'.";

    }
}
