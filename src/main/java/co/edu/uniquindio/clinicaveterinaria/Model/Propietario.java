package co.edu.uniquindio.clinicaveterinaria.Model;

/**
 * La clase {@code Propietario} representa al dueño de una o varias mascotas
 * en la clínica veterinaria.
 *
 * <p>Hereda de la clase {@link Persona} los atributos comunes como
 * nombre, identificación y teléfono, y agrega un atributo adicional
 * para registrar la dirección de residencia del propietario.</p>
 *
 * <p>Los propietarios son fundamentales en el sistema, ya que permiten
 * asociar mascotas con sus respectivos responsables.</p>
 *
 * @author
 * @version 1.0
 */
public class Propietario extends Persona {

    /** Dirección de residencia del propietario. */
    public String direccion;

    /**
     * Constructor de la clase {@code Propietario}.
     *
     * @param nombre    nombre del propietario
     * @param id        identificación única del propietario
     * @param telefono  número de teléfono de contacto
     * @param direccion dirección de residencia del propietario
     */
    public Propietario(String nombre, String id, String telefono, String direccion) {
        super(nombre, id, telefono);
        this.direccion = direccion;
    }

    /**
     * Obtiene la dirección del propietario.
     *
     * @return dirección del propietario
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del propietario.
     *
     * @param direccion nueva dirección del propietario
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
