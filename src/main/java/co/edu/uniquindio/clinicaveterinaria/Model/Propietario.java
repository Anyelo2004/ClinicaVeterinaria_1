package co.edu.uniquindio.clinicaveterinaria.Model;

public class Propietario extends Persona{
    public String direccion;

    public Propietario(String nombre, String id, String telefono, String direccion) {
        super(nombre, id, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
