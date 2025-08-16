package co.edu.uniquindio.clinicaveterinaria.Model;

/**
 * La clase {@code Persona} representa a una persona dentro de la clínica veterinaria.
 *
 * <p>Es una clase base que contiene información general como nombre,
 * identificación y teléfono, la cual es compartida por otras entidades
 * del sistema como {@link Veterinario}, {@link Propietario} y {@link Asistente}.</p>
 *
 * <p>Al ser una clase padre, permite heredar atributos y métodos
 * comunes para reducir la duplicación de código.</p>
 *
 * @author
 * @version 1.0
 */
public class Persona {

    /** Nombre de la persona. */
    protected String nombre;

    /** Identificación única de la persona. */
    protected String id;

    /** Número de teléfono de contacto de la persona. */
    protected String telefono;

    /**
     * Constructor de la clase {@code Persona}.
     *
     * @param nombre   nombre de la persona
     * @param id       identificación única de la persona
     * @param telefono número de teléfono de la persona
     */
    public Persona(String nombre, String id, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de identificación de la persona.
     *
     * @return identificación única de la persona
     */
    public String getId() {
        return id;
    }

    /**
     * Establece la identificación de la persona.
     *
     * @param id identificación única de la persona
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el número de teléfono de la persona.
     *
     * @return teléfono de la persona
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la persona.
     *
     * @param telefono teléfono de la persona
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
