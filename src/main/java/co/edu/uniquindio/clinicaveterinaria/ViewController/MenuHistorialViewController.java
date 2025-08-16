package co.edu.uniquindio.clinicaveterinaria.ViewController;

import co.edu.uniquindio.clinicaveterinaria.Model.Agenda;
import co.edu.uniquindio.clinicaveterinaria.Model.Consulta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import co.edu.uniquindio.clinicaveterinaria.Model.HistorialItem;

public class MenuHistorialViewController {

    @FXML
    private Button Button_AtrasMenuInicio;

    @FXML
    private TableView<HistorialItem> tablaHistorial;

    @FXML
    private TableColumn<HistorialItem, String> colTipo;
    @FXML
    private TableColumn<HistorialItem, String> colFecha;
    @FXML
    private TableColumn<HistorialItem, String> colHora;
    @FXML
    private TableColumn<HistorialItem, String> colMascota;
    @FXML
    private TableColumn<HistorialItem, String> colVeterinario;
    @FXML
    private TableColumn<HistorialItem, String> colMotivo;
    @FXML
    private TableColumn<HistorialItem, String> colDiagnostico;
    @FXML
    private TableColumn<HistorialItem, String> colTratamiento;

    @FXML
    private TextField txtBuscarFecha;

    // Botón Atrás
    @FXML
    void OnClick_AtrasMenuInicio(ActionEvent event) {
        Stage stageActual = (Stage) Button_AtrasMenuInicio.getScene().getWindow();
        stageActual.close();
    }

    // Inicialización
    @FXML
    void initialize() {
        // Configurar las columnas
        colTipo.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getTipo()));
        colFecha.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getFecha()));
        colHora.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getHora()));
        colMascota.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getMascota()));
        colVeterinario.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getVeterinario()));
        colMotivo.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getMotivo()));
        colDiagnostico.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getDiagnostico()));
        colTratamiento.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getTratamiento()));

        mostrarTodos();
    }

    // registros
    private void mostrarTodos() {
        ObservableList<HistorialItem> datos = FXCollections.observableArrayList();

        for (Agenda a : Agenda.listaAgenda) {
            datos.add(new HistorialItem("Cita", a.getFecha(), a.getHora(),
                    a.getMascota().getNombre(),
                    a.getVeterinario().getNombre(),
                    "", "", ""));
        }

        for (Consulta c : Consulta.listaConsultas) {
            Agenda a = c.getCita();
            datos.add(new HistorialItem("Consulta", a.getFecha(), a.getHora(),
                    a.getMascota().getNombre(),
                    a.getVeterinario().getNombre(),
                    c.getMotivo(),
                    c.getDiagnostico(),
                    c.getTratamiento()));
        }

        tablaHistorial.setItems(datos);
    }

    // fecha
    @FXML
    void OnClick_BuscarPorFecha(ActionEvent event) {
        String fechaBuscada = txtBuscarFecha.getText().trim();
        if (fechaBuscada.isEmpty()) return;

        ObservableList<HistorialItem> datos = FXCollections.observableArrayList();

        for (Agenda a : Agenda.listaAgenda) {
            if (a.getFecha().equals(fechaBuscada)) {
                datos.add(new HistorialItem("Cita", a.getFecha(), a.getHora(),
                        a.getMascota().getNombre(),
                        a.getVeterinario().getNombre(),
                        "", "", ""));
            }
        }

        for (Consulta c : Consulta.listaConsultas) {
            if (c.getCita().getFecha().equals(fechaBuscada)) {
                Agenda a = c.getCita();
                datos.add(new HistorialItem("Consulta", a.getFecha(), a.getHora(),
                        a.getMascota().getNombre(),
                        a.getVeterinario().getNombre(),
                        c.getMotivo(),
                        c.getDiagnostico(),
                        c.getTratamiento()));
            }
        }

        tablaHistorial.setItems(datos);
    }

    // Botón mostrar todo nuevamente
    @FXML
    void OnClick_MostrarTodo(ActionEvent event) {
        mostrarTodos();
    }
}
