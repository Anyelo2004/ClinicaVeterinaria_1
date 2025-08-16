package co.edu.uniquindio.clinicaveterinaria.ViewController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MenuAgendaViewController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button_AtrasMenuInicio;

    @FXML
    private Button Button_RegistrarAgenda;

    @FXML
    private Button Button_Salir;

    @FXML
    private TextField Text_registroFecha;

    @FXML
    private TextField Text_registroHora;

    @FXML
    void OnClick_AtrasMenuInicio(ActionEvent event) {

    }

    @FXML
    void OnClick_Salir(ActionEvent event) {

    }

    @FXML
    void Onclick_RegistrarAgenda(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Button_AtrasMenuInicio != null : "fx:id=\"Button_AtrasMenuInicio\" was not injected: check your FXML file 'MenuAgenda.fxml'.";
        assert Button_RegistrarAgenda != null : "fx:id=\"Button_RegistrarAgenda\" was not injected: check your FXML file 'MenuAgenda.fxml'.";
        assert Button_Salir != null : "fx:id=\"Button_Salir\" was not injected: check your FXML file 'MenuAgenda.fxml'.";
        assert Text_registroFecha != null : "fx:id=\"Text_registroFecha\" was not injected: check your FXML file 'MenuAgenda.fxml'.";
        assert Text_registroHora != null : "fx:id=\"Text_registroHora\" was not injected: check your FXML file 'MenuAgenda.fxml'.";

    }
}
