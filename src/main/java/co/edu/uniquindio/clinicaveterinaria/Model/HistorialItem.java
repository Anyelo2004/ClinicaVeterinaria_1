package co.edu.uniquindio.clinicaveterinaria.Model;

/**
 * La clase {@code HistorialItem} representa un registro dentro del historial clínico
 * de una mascota en la clínica veterinaria.
 *
 * <p>Cada ítem del historial almacena información sobre el tipo de evento (consulta, vacunación, etc.),
 * la fecha y hora, la mascota involucrada, el veterinario responsable, así como el motivo,
 * diagnóstico y tratamiento aplicados.</p>
 *
 * <p>Esta clase se utiliza como unidad básica de información para construir
 * el historial médico de una mascota.</p>
 *
 * @author
 * @version 1.0
 */
public class HistorialItem {

    /** Tipo de evento registrado (ejemplo: "Consulta", "Vacunación"). */
    private String tipo;

    /** Fecha en la que ocurrió el evento. */
    private String fecha;

    /** Hora en la que ocurrió el evento. */
    private String hora;

    /** Nombre de la mascota asociada al evento. */
    private String mascota;

    /** Nombre del veterinario responsable del evento. */
    private String veterinario;

    /** Motivo del evento (ejemplo: síntoma o necesidad). */
    private String motivo;

    /** Diagnóstico realizado durante el evento. */
    private String diagnostico;

    /** Tratamiento aplicado o recomendado. */
    private String tratamiento;

    /**
     * Constructor de la clase {@code HistorialItem}.
     *
     * @param tipo        tipo de evento (consulta, vacunación, etc.)
     * @param fecha       fecha del evento
     * @param hora        hora del evento
     * @param mascota     nombre de la mascota involucrada
     * @param veterinario nombre del veterinario responsable
     * @param motivo      motivo del evento
     * @param diagnostico diagnóstico realizado
     * @param tratamiento tratamiento aplicado o recomendado
     */
    public HistorialItem(String tipo, String fecha, String hora, String mascota, String veterinario,
                         String motivo, String diagnostico, String tratamiento) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    /** @return tipo de evento registrado */
    public String getTipo() { return tipo; }

    /** @return fecha del evento */
    public String getFecha() { return fecha; }

    /** @return hora del evento */
    public String getHora() { return hora; }

    /** @return nombre de la mascota asociada */
    public String getMascota() { return mascota; }

    /** @return nombre del veterinario responsable */
    public String getVeterinario() { return veterinario; }

    /** @return motivo del evento */
    public String getMotivo() { return motivo; }

    /** @return diagnóstico del evento */
    public String getDiagnostico() { return diagnostico; }

    /** @return tratamiento aplicado o recomendado */
    public String getTratamiento() { return tratamiento; }
}
