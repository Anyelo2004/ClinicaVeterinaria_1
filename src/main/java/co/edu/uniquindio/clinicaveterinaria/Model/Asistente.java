package co.edu.uniquindio.clinicaveterinaria.Model;

public class Asistente extends Persona {
    public String Sueldo;

    public Asistente(String nombre, String id, String telefono, String Sueldo) {
        super(nombre, id, telefono);
        this.Sueldo = Sueldo;
    }

    public String getSueldo() {
        return Sueldo;
    }

    public void setSueldo(String sueldo) {
        Sueldo = sueldo;
    }
}
