package co.edu.uniquindio.clinicaveterinaria.ViewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class MenuHistorialViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button_AtrasMenuInicio;

    @FXML
    private Button Button_SalirHistorial;

    @FXML
    private ListView<?> ListView_Historial;

    @FXML
    void OnClick_AtrasMenuInicio(ActionEvent event) {

    }

    @FXML
    void OnClick_SalirHistorial(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Button_AtrasMenuInicio != null : "fx:id=\"Button_AtrasMenuInicio\" was not injected: check your FXML file 'MenuHistorial.fxml'.";
        assert Button_SalirHistorial != null : "fx:id=\"Button_SalirHistorial\" was not injected: check your FXML file 'MenuHistorial.fxml'.";
        assert ListView_Historial != null : "fx:id=\"ListView_Historial\" was not injected: check your FXML file 'MenuHistorial.fxml'.";

    }

}
