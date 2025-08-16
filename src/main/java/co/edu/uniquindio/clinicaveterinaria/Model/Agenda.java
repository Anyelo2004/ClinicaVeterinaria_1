package co.edu.uniquindio.clinicaveterinaria.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public String hora;
    public LocalDate fecha;
    public Mascota mascota;
    public Veterinario veterinario;

    public static List<Agenda> listaAgenda = new ArrayList<>();

    public Agenda(String hora, LocalDate fecha, Mascota mascota, Veterinario veterinario) {
        this.hora = hora;
        this.fecha = fecha;
        this.mascota = mascota;
        this.veterinario = veterinario;
        listaAgenda.add(this); // se agrega automáticamente al crear
    }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public Mascota getMascota() { return mascota; }
    public void setMascota(Mascota mascota) { this.mascota = mascota; }

    public Veterinario getVeterinario() { return veterinario; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }
}
