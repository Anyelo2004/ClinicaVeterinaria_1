package co.edu.uniquindio.clinicaveterinaria.ViewController;

import co.edu.uniquindio.clinicaveterinaria.Model.Agenda;
import co.edu.uniquindio.clinicaveterinaria.Model.Mascota;
import co.edu.uniquindio.clinicaveterinaria.Model.Veterinario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.util.StringConverter;

import java.time.LocalDate;

public class MenuAgendaViewController {

    @FXML
    private Button Button_AtrasMenuInicio;

    @FXML
    private TextField Text_registroHora;

    @FXML
    private DatePicker datePickerFecha;

    @FXML
    private ComboBox<Mascota> cmbMascota;

    @FXML
    private ComboBox<Veterinario> cmbVeterinario;

    @FXML
    void initialize() {
        // Llenar ComboBox de mascotas
        cmbMascota.getItems().addAll(Mascota.listaMascotas);
        cmbMascota.setConverter(new StringConverter<Mascota>() {
            @Override
            public String toString(Mascota mascota) {
                return mascota != null ? mascota.getNombre() : "";
            }

            @Override
            public Mascota fromString(String string) {
                return null;
            }
        });

        // Llenar ComboBox de veterinarios
        cmbVeterinario.getItems().addAll(Veterinario.listaVeterinarios);
        cmbVeterinario.setConverter(new StringConverter<Veterinario>() {
            @Override
            public String toString(Veterinario veterinario) {
                return veterinario != null ? veterinario.getNombre() : "";
            }

            @Override
            public Veterinario fromString(String string) {
                return null;
            }
        });
    }

    // Botón Atrás
    @FXML
    void OnClick_AtrasMenuInicio(ActionEvent event) {
        Stage stageActual = (Stage) Button_AtrasMenuInicio.getScene().getWindow();
        stageActual.close();
    }

    // Botón Registrar Agenda
    @FXML
    void Onclick_RegistrarAgenda(ActionEvent event) {
        LocalDate fecha = datePickerFecha.getValue();
        String hora = Text_registroHora.getText();
        Mascota mascota = cmbMascota.getValue();
        Veterinario veterinario = cmbVeterinario.getValue();

        // Validaciones
        if (fecha == null) {
            System.out.println("Selecciona una fecha");
            return;
        }
        if (hora.isEmpty()) {
            System.out.println("Ingresa la hora");
            return;
        }
        if (mascota == null) {
            System.out.println("Selecciona una mascota");
            return;
        }
        if (veterinario == null) {
            System.out.println("Selecciona un veterinario");
            return;
        }

        // Crear objeto Agenda
        String fechaString = fecha.toString(); // Formato yyyy-MM-dd
        Agenda agenda = new Agenda(hora, fechaString, mascota, veterinario);

        // Puedes guardar en lista estática si quieres
        System.out.println("Agenda registrada: " + mascota.getNombre() +
                " con " + veterinario.getNombre() + " a las " + hora + " del " + fechaString);

        // Limpiar campos
        datePickerFecha.setValue(null);
        Text_registroHora.clear();
        cmbMascota.getSelectionModel().clearSelection();
        cmbVeterinario.getSelectionModel().clearSelection();
    }
}
