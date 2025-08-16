package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private Agenda cita; // Cita asociada
    private String motivo;
    private String diagnostico;
    private String tratamiento;

    public static List<Consulta> listaConsultas = new ArrayList<>();

    public Consulta(Agenda cita, String motivo, String diagnostico, String tratamiento) {
        this.cita = cita;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        listaConsultas.add(this); // Se guarda automáticamente
    }

    public Agenda getCita() { return cita; }
    public String getMotivo() { return motivo; }
    public String getDiagnostico() { return diagnostico; }
    public String getTratamiento() { return tratamiento; }
}
