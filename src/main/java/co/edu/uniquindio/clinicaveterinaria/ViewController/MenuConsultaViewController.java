package co.edu.uniquindio.clinicaveterinaria.ViewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MenuConsultaViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button_AtrasMenuInicio;

    @FXML
    private Button Button_Salir;

    @FXML
    private TextField TextFiel_MotivoConsulta;

    @FXML
    private TextField TextField_Diagnostico;

    @FXML
    private TextField TextField_Tratamiento;

    @FXML
    void OnClick_Salir(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Button_AtrasMenuInicio != null : "fx:id=\"Button_AtrasMenuInicio\" was not injected: check your FXML file 'MenuConsulta.fxml'.";
        assert Button_Salir != null : "fx:id=\"Button_Salir\" was not injected: check your FXML file 'MenuConsulta.fxml'.";
        assert TextFiel_MotivoConsulta != null : "fx:id=\"TextFiel_MotivoConsulta\" was not injected: check your FXML file 'MenuConsulta.fxml'.";
        assert TextField_Diagnostico != null : "fx:id=\"TextField_Diagnostico\" was not injected: check your FXML file 'MenuConsulta.fxml'.";
        assert TextField_Tratamiento != null : "fx:id=\"TextField_Tratamiento\" was not injected: check your FXML file 'MenuConsulta.fxml'.";

    }
}
