package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;
import java.util.Collection;

public class Veterinaria {
    private String nombre;
    private  String nit;
    private  String direccion;
    private Collection<Veterinario> veterinarios;
    private Collection<Propietario> propietarios;
    private Collection<Mascota> mascotas;
    private Collection<Agenda> agendas;

    public Veterinaria(String nombre, String nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        veterinarios = new ArrayList<>();
        propietarios = new ArrayList<>();
        mascotas = new ArrayList<>();
        agendas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Collection<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(Collection<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    public Collection<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Collection<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public Collection<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Collection<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Collection<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(Collection<Agenda> agendas) {
        this.agendas = agendas;
    }
}
