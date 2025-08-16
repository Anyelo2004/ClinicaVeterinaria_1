package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;

/**
 * La clase {@code Veterinario} representa a un médico veterinario
 * de la clínica veterinaria.
 *
 * <p>Hereda de la clase {@link Persona} los atributos comunes como
 * nombre, identificación y teléfono, y agrega información propia
 * como la licencia profesional, la especialidad y el registro de
 * consultas realizadas.</p>
 *
 * <p>Los veterinarios son los encargados de atender consultas y
 * registrar diagnósticos y tratamientos para las mascotas.</p>
 *
 * @author
 * @version 1.0
 */
public class Veterinario extends Persona {

    /** Número de licencia profesional del veterinario. */
    public String licProfesional;

    /** Especialidad del veterinario. */
    public Especialidad especialidad;

    /** Lista de consultas realizadas por el veterinario. */
    public ArrayList<Consulta> consultas;

    /** Lista estática de todos los veterinarios registrados en el sistema. */
    public static ArrayList<Veterinario> listaVeterinarios = new ArrayList<>();

    /**
     * Constructor de la clase {@code Veterinario}.
     *
     * @param nombre          nombre del veterinario
     * @param id              identificación única del veterinario
     * @param telefono        número de teléfono de contacto
     * @param licProfesional  número de licencia profesional
     * @param especialidad    especialidad del veterinario
     */
    public Veterinario(String nombre, String id, String telefono, String licProfesional, Especialidad especialidad) {
        super(nombre, id, telefono);
        this.licProfesional = licProfesional;
        this.especialidad = especialidad;
        consultas = new ArrayList<>();
    }

    /**
     * Obtiene la licencia profesional del veterinario.
     *
     * @return licencia profesional
     */
    public String getLicProfesional() {
        return licProfesional;
    }

    /**
     * Establece la licencia profesional del veterinario.
     *
     * @param licProfesional nueva licencia profesional
     */
    public void setLicProfesional(String licProfesional) {
        this.licProfesional = licProfesional;
    }

    /**
     * Obtiene la especialidad del veterinario.
     *
     * @return especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del veterinario.
     *
     * @param especialidad nueva especialidad
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la lista de consultas realizadas por el veterinario.
     *
     * @return lista de consultas
     */
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    /**
     * Establece la lista de consultas del veterinario.
     *
     * @param consultas nueva lista de consultas
     */
    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
}
