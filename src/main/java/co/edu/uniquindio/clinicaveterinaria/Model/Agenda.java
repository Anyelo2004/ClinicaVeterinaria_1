package co.edu.uniquindio.clinicaveterinaria.Model;

public class Agenda {
    public String hora;
    public String fecha;
    public Mascota mascota;
    public  Veterinario veterinario;

    public Agenda(String hora, String fecha, Mascota mascota, Veterinario veterinario) {
        this.hora = hora;
        this.fecha = fecha;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}
