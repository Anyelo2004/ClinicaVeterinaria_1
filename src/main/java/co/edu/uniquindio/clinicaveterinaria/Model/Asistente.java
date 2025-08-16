package co.edu.uniquindio.clinicaveterinaria.Model;

/**
 * La clase {@code Asistente} representa a un asistente dentro de la clínica veterinaria.
 * Hereda de la clase {@link Persona} e incluye información adicional como el sueldo.
 *
 * <p>Los asistentes forman parte del personal administrativo o de apoyo de la clínica.</p>
 *
 * @author
 * @version 1.0
 */
public class Asistente extends Persona {

    /** Sueldo del asistente. */
    private String sueldo;

    /**
     * Constructor de la clase {@code Asistente}.
     *
     * @param nombre   nombre completo del asistente
     * @param id       identificación del asistente
     * @param telefono número de contacto del asistente
     * @param sueldo   sueldo del asistente
     */
    public Asistente(String nombre, String id, String telefono, String sueldo) {
        super(nombre, id, telefono);
        this.sueldo = sueldo;
    }

    /**
     * Obtiene el sueldo del asistente.
     *
     * @return sueldo actual del asistente
     */
    public String getSueldo() {
        return sueldo;
    }

    /**
     * Establece un nuevo sueldo para el asistente.
     *
     * @param sueldo nuevo sueldo del asistente
     */
    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
}
