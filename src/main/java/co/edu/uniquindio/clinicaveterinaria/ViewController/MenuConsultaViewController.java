package co.edu.uniquindio.clinicaveterinaria.ViewController;

import co.edu.uniquindio.clinicaveterinaria.Model.Agenda;
import co.edu.uniquindio.clinicaveterinaria.Model.Consulta;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class MenuConsultaViewController {

    @FXML
    private Button Button_AtrasMenuInicio, Button_GuardarConsulta;

    @FXML
    private TextField TextFiel_MotivoConsulta, TextField_Diagnostico, TextField_Tratamiento;

    @FXML
    private ComboBox<Agenda> cmbCitas;

    @FXML
    void initialize() {
        // citas registradas en Agenda al ComboBox
        cmbCitas.setItems(FXCollections.observableArrayList(Agenda.listaAgenda));

        // texto resumido de cada cita
        cmbCitas.setCellFactory(lv -> new ListCell<>() {
            @Override
            protected void updateItem(Agenda item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty || item == null ? "" :
                        item.getFecha() + " " + item.getHora() + " - " + item.getMascota().getNombre());
            }
        });
        cmbCitas.setButtonCell(new ListCell<>() {
            @Override
            protected void updateItem(Agenda item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty || item == null ? "" :
                        item.getFecha() + " " + item.getHora() + " - " + item.getMascota().getNombre());
            }
        });
    }

    @FXML
    void OnClick_AtrasMenuInicio(ActionEvent event) {
        Stage stageActual = (Stage) Button_AtrasMenuInicio.getScene().getWindow();
        stageActual.close();
    }

    @FXML
    void OnClick_GuardarConsulta(ActionEvent event) {
        Agenda citaSeleccionada = cmbCitas.getValue();
        if (citaSeleccionada == null) {
            System.out.println("Selecciona una cita para guardar la consulta");
            return;
        }

        String motivo = TextFiel_MotivoConsulta.getText();
        String diagnostico = TextField_Diagnostico.getText();
        String tratamiento = TextField_Tratamiento.getText();

        if (motivo.isEmpty() || diagnostico.isEmpty() || tratamiento.isEmpty()) {
            System.out.println("Completa todos los campos de la consulta");
            return;
        }

        // Crear la consulta y guardarla
        Consulta consulta = new Consulta(citaSeleccionada, motivo, diagnostico, tratamiento);
        System.out.println("Consulta guardada para la cita de " + citaSeleccionada.getMascota().getNombre());

        // Limpiar campos
        TextFiel_MotivoConsulta.clear();
        TextField_Diagnostico.clear();
        TextField_Tratamiento.clear();
        cmbCitas.getSelectionModel().clearSelection();
    }
}
