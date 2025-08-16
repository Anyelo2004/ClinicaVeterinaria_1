package co.edu.uniquindio.clinicaveterinaria.ViewController;

import co.edu.uniquindio.clinicaveterinaria.Model.Veterinario;
import co.edu.uniquindio.clinicaveterinaria.Model.Especialidad; // Este debe ser enum
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class MenuVeterinarioViewController {

    @FXML
    private TextField txtId, txtNombre, txtTelefono, txtLicencia, txtEspecialidad;

    @FXML
    private Button Button_AtrasMenuInicio, Button_Guardar;

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
            String telefono = txtTelefono.getText();
            String licencia = txtLicencia.getText();
            String especialidadNombre = txtEspecialidad.getText();

            if (id.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || licencia.isEmpty() || especialidadNombre.isEmpty()) {
                System.out.println("Completa todos los campos");
                return;
            }

            // Convertir texto a enum Especialidad
            Especialidad especialidad = Especialidad.valueOf(especialidadNombre.toUpperCase());

            // Crear objeto Veterinario
            Veterinario veterinario = new Veterinario(nombre, id, telefono, licencia, especialidad);

            // Guardamos en la lista
            Veterinario.listaVeterinarios.add(veterinario);

            System.out.println("Veterinario guardado: " + veterinario.getNombre() + ", especialidad: " + especialidad);

            // Limpiar campos
            txtId.clear();
            txtNombre.clear();
            txtTelefono.clear();
            txtLicencia.clear();
            txtEspecialidad.clear();

        } catch (IllegalArgumentException e) {
            // Error si el nombre de la especialidad no coincide con el enum
            System.out.println("Especialidad no válida. Asegúrate de escribirla correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
