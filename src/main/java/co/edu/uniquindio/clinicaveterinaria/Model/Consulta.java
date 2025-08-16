package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Consulta} representa una consulta veterinaria realizada en la clínica.
 * Cada consulta está asociada a una {@link Agenda} (cita) y contiene información
 * sobre el motivo, diagnóstico y tratamiento.
 *
 * <p>Las consultas registradas se almacenan automáticamente en la lista estática
 * {@link #listaConsultas} al momento de crearse.</p>
 *
 * @author
 * @version 1.0
 */
public class Consulta {

    /** Cita asociada a la consulta (agenda). */
    private Agenda cita;

    /** Motivo por el cual se realiza la consulta. */
    private String motivo;

    /** Diagnóstico realizado por el veterinario. */
    private String diagnostico;

    /** Tratamiento recomendado para la mascota. */
    private String tratamiento;

    /** Lista estática que almacena todas las consultas realizadas en la clínica. */
    public static List<Consulta> listaConsultas = new ArrayList<>();

    /**
     * Constructor de la clase {@code Consulta}.
     *
     * @param cita        cita agendada asociada a la consulta
     * @param motivo      motivo de la consulta
     * @param diagnostico diagnóstico realizado en la consulta
     * @param tratamiento tratamiento recomendado
     */
    public Consulta(Agenda cita, String motivo, String diagnostico, String tratamiento) {
        this.cita = cita;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        listaConsultas.add(this); // Se guarda automáticamente
    }

    /**
     * Obtiene la cita asociada a la consulta.
     *
     * @return cita de la consulta
     */
    public Agenda getCita() {
        return cita;
    }

    /**
     * Obtiene el motivo de la consulta.
     *
     * @return motivo de la consulta
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Obtiene el diagnóstico de la consulta.
     *
     * @return diagnóstico de la consulta
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * Obtiene el tratamiento recomendado en la consulta.
     *
     * @return tratamiento de la consulta
     */
    public String getTratamiento() {
        return tratamiento;
    }
}
