package co.edu.uniquindio.clinicaveterinaria.ViewController;

import co.edu.uniquindio.clinicaveterinaria.Model.Mascota;
import co.edu.uniquindio.clinicaveterinaria.Model.Especie; 
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class MenuMascotaViewController {

    @FXML
    private TextField txtId, txtNombre, txtEdad, txtRaza;

    @FXML
    private ComboBox<String> cbSexo;

    @FXML
    private Button Button_AtrasMenuInicio, Button_Guardar;

    @FXML
    public void initialize() {
        cbSexo.getItems().addAll("Macho", "Hembra");
    }

    // Botón Atrás
    @FXML
    void OnClick_AtrasMenuInicio(ActionEvent event) {
        Stage stageActual = (Stage) Button_AtrasMenuInicio.getScene().getWindow();
        stageActual.close();
    }

    // Botón Guardar
    @FXML
    void OnClick_Guardar(ActionEvent event) {
        try {
            String id = txtId.getText();
            String nombre = txtNombre.getText();
            String edad = txtEdad.getText();
            String raza = txtRaza.getText();
            String sexoSeleccionado = cbSexo.getValue();

            if (sexoSeleccionado == null || sexoSeleccionado.isEmpty()) {
                System.out.println("Selecciona un sexo para la mascota");
                return;
            }

            char sexo = sexoSeleccionado.equals("Macho") ? 'M' : 'F';
            Especie especie = null; // Puedes asignar la especie aquí si la tienes

            Mascota mascota = new Mascota(nombre, edad, raza, sexo, id, especie);

            // mascota en la lista
            Mascota.listaMascotas.add(mascota);

            System.out.println("Mascota guardada: " + mascota.getNombre());

            // Limpiar campos
            txtId.clear();
            txtNombre.clear();
            txtEdad.clear();
            txtRaza.clear();
            cbSexo.getSelectionModel().clearSelection();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
