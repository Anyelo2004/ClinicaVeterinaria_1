package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;

public class Veterinario extends Persona{
    public String licProfesional;
    public Especialidad especialidad;
    public ArrayList<Consulta> consultas;

    public Veterinario(String nombre, String id, String telefono, String licProfesional, Especialidad especialidad) {
        super(nombre, id, telefono);
        this.licProfesional = licProfesional;
        this.especialidad = especialidad;
        consultas = new ArrayList<>();
    }

public static ArrayList<Veterinario> listaVeterinarios = new ArrayList<>();

    public String getLicProfesional() {
        return licProfesional;
    }

    public void setLicProfesional(String licProfesional) {
        this.licProfesional = licProfesional;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
}
