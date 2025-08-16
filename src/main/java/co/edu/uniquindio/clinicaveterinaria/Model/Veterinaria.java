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

    //Readers
    public Veterinario getVeterinario(String id) {
        if (veterinarios.isEmpty()){
            return null;
        }
        for  (Veterinario veterinario : veterinarios) {
            if (veterinario.getId().equals(id)) {
                return veterinario;
            }
        }
        return null;
    }

    public Propietario getPropietario(String id) {
        if (propietarios.isEmpty()){
            return null;
        }
        for  (Propietario propietario : propietarios) {
            if (propietario.getId().equals(id)) {
                return propietario;
            }
        }
        return null;
    }

    public Mascota getMascota(String id) {
        if (mascotas.isEmpty()){
            return null;
        }
        for  (Mascota mascota : mascotas) {
            if (mascota.getId().equals(id)) {
                return mascota;
            }
        }
        return null;
    }

    public Agenda getAgenda(String fecha,String hora,Mascota mascota) {
        if (agendas.isEmpty()){
            return null;
        }
        for  (Agenda agenda : agendas) {
            if (agenda.getFecha().equals(fecha) && agenda.getHora().equals(hora) && agenda.getMascota().equals(mascota)) {
                return agenda;
            }
        }
        return null;
    }

    //Creators
    public boolean addVeterinario(Veterinario veterinario) {

        if (this.getVeterinario(veterinario.getId()) == null) {
            this.veterinarios.add(veterinario);
            return true;
        }
        return false;
    }

    public boolean addPropietario(Propietario propietario) {
        if (this.getPropietario(propietario.getId()) == null) {
            this.propietarios.add(propietario);
            return true;
        }
        return false;
    }
    public boolean addMascota(Mascota mascota) {
        if (this.getMascota(mascota.getId()) == null) {
            this.mascotas.add(mascota);
            return true;
        }
        return false;
    }
    public boolean addAgenda(Agenda agenda) {
        if (this.getAgenda(agenda.getFecha(), agenda.getHora(), agenda.getMascota()) == null) {
            this.agendas.add(agenda);
            return true;
        }
        return false;
    }
    //Updaters

    public boolean updateVeterinario(Veterinario veterinario) {
        Veterinario v = this.getVeterinario(veterinario.getId());
        if (v == null) {
            return false;
        }
        this.veterinarios.remove(v);
        this.veterinarios.add(veterinario);
        return true;

    }

    public boolean updatePropietario(Propietario propietario) {
        Propietario p = this.getPropietario(propietario.getId());
        if (p == null) {
            return false;
        }
        this.propietarios.remove(p);
        this.propietarios.add(propietario);
        return true;
    }

    public boolean updateMascota(Mascota mascota) {
        Mascota m = this.getMascota(mascota.getId());
        if (m == null) {
            return false;
        }
        this.mascotas.remove(m);
        this.mascotas.add(mascota);
        return true;
    }

    public boolean updateAgenda(Agenda agenda) {
        Agenda a = this.getAgenda(agenda.getFecha(), agenda.getHora(), agenda.getMascota());
        if (a == null) {
            return false;
        }
        this.agendas.remove(a);
        this.agendas.add(agenda);
        return true;
    }
    //Deleters
    public boolean deleteVeterinario(String id) {
        Veterinario v = this.getVeterinario(id);
        if (v == null) {
            return false;
        }
        this.veterinarios.remove(v);
        return true;
    }
    public boolean deletePropietario(String id) {
        Propietario p = this.getPropietario(id);
        if (p == null) {
            return false;
        }
        this.propietarios.remove(p);
        return true;
    }
    public boolean deleteMascota(String id) {
        Mascota m = this.getMascota(id);
        if (m == null) {
            return false;
        }
        this.mascotas.remove(m);
        return true;
    }
    public boolean deleteAgenda(Agenda agenda) {
        Agenda a = this.getAgenda(agenda.getFecha(), agenda.getHora(), agenda.getMascota());
        if (a == null) {
            return false;
        }
        this.agendas.remove(a);
        return true;
    }

}
