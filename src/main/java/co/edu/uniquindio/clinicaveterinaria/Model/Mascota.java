package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Mascota} representa un animal registrado en la clínica veterinaria.
 *
 * <p>Cada mascota contiene información básica como nombre, edad, raza, sexo,
 * identificación única y su especie. Además, se mantiene una lista estática con
 * todas las mascotas registradas en el sistema.</p>
 *
 * <p>Esta clase es fundamental para la gestión de historiales médicos,
 * consultas y agendamientos en la clínica.</p>
 *
 * @author
 * @version 1.0
 */
public class Mascota {

    /** Nombre de la mascota. */
    public String nombre;

    /** Edad de la mascota. */
    public String edad;

    /** Raza de la mascota. */
    public String raza;

    /** Sexo de la mascota ('M' = macho, 'H' = hembra). */
    public char sexo;

    /** Identificador único de la mascota. */
    public String id;

    /** Especie a la que pertenece la mascota (ejemplo: perro, gato, ave). */
    public Especie especie;

    /** Lista estática para almacenar todas las mascotas registradas en el sistema. */
    public static List<Mascota> listaMascotas = new ArrayList<>();

    /**
     * Constructor de la clase {@code Mascota}.
     *
     * @param nombre  nombre de la mascota
     * @param edad    edad de la mascota
     * @param raza    raza de la mascota
     * @param sexo    sexo de la mascota ('M' o 'H')
     * @param id      identificador único de la mascota
     * @param especie especie de la mascota
     */
    public Mascota(String nombre, String edad, String raza, char sexo, String id, Especie especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
        this.id = id;
        this.especie = especie;
    }

    /** @return nombre de la mascota */
    public String getNombre() { return nombre; }

    /** @param nombre establece el nombre de la mascota */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return edad de la mascota */
    public String getEdad() { return edad; }

    /** @param edad establece la edad de la mascota */
    public void setEdad(String edad) { this.edad = edad; }

    /** @return raza de la mascota */
    public String getRaza() { return raza; }

    /** @param raza establece la raza de la mascota */
    public void setRaza(String raza) { this.raza = raza; }

    /** @return sexo de la mascota */
    public char getSexo() { return sexo; }

    /** @param sexo establece el sexo de la mascota ('M' o 'H') */
    public void setSexo(char sexo) { this.sexo = sexo; }

    /** @return identificador único de la mascota */
    public String getId() { return id; }

    /** @param id establece el identificador único de la mascota */
    public void setId(String id) { this.id = id; }

    /** @return especie de la mascota */
    public Especie getEspecie() { return especie; }

    /** @param especie establece la especie de la mascota */
    public void setEspecie(Especie especie) { this.especie = especie; }
}
