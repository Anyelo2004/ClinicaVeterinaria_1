package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Agenda} representa una cita dentro de la clínica veterinaria.
 * Contiene información sobre la fecha y hora de la cita, la mascota atendida
 * y el veterinario asignado. Además, mantiene una lista estática con todas
 * las agendas registradas.
 *
 * <p>Cada vez que se crea una instancia de {@code Agenda}, esta se agrega
 * automáticamente a la lista estática {@code listaAgenda}.</p>
 *
 * @author
 * @version 1.0
 */
public class Agenda {

    /** Hora de la cita en formato HH:mm. */
    private String hora;

    /** Fecha de la cita en formato YYYY-MM-DD. */
    private String fecha;

    /** Mascota a la cual pertenece la cita. */
    private Mascota mascota;

    /** Veterinario encargado de la cita. */
    private Veterinario veterinario;

    /** Lista estática que almacena todas las agendas creadas. */
    public static List<Agenda> listaAgenda = new ArrayList<>();

    /**
     * Constructor de la clase {@code Agenda}.
     * Crea una nueva cita y la agrega automáticamente a la lista estática {@code listaAgenda}.
     *
     * @param hora       hora de la cita en formato HH:mm
     * @param fecha      fecha de la cita en formato YYYY-MM-DD
     * @param mascota    mascota que será atendida
     * @param veterinario veterinario asignado a la cita
     */
    public Agenda(String hora, String fecha, Mascota mascota, Veterinario veterinario) {
        this.hora = hora;
        this.fecha = fecha;
        this.mascota = mascota;
        this.veterinario = veterinario;
        listaAgenda.add(this);
    }

    /**
     * Obtiene la hora de la cita.
     *
     * @return hora de la cita
     */
    public String getHora() { return hora; }

    /**
     * Establece la hora de la cita.
     *
     * @param hora nueva hora de la cita
     */
    public void setHora(String hora) { this.hora = hora; }

    /**
     * Obtiene la fecha de la cita.
     *
     * @return fecha de la cita
     */
    public String getFecha() { return fecha; }

    /**
     * Establece la fecha de la cita.
     *
     * @param fecha nueva fecha de la cita
     */
    public void setFecha(String fecha) { this.fecha = fecha; }

    /**
     * Obtiene la mascota asociada a la cita.
     *
     * @return mascota de la cita
     */
    public Mascota getMascota() { return mascota; }

    /**
     * Establece la mascota asociada a la cita.
     *
     * @param mascota nueva mascota de la cita
     */
    public void setMascota(Mascota mascota) { this.mascota = mascota; }

    /**
     * Obtiene el veterinario asignado a la cita.
     *
     * @return veterinario de la cita
     */
    public Veterinario getVeterinario() { return veterinario; }

    /**
     * Establece el veterinario asignado a la cita.
     *
     * @param veterinario nuevo veterinario para la cita
     */
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }
}
