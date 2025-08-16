package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Representa una clínica veterinaria, con su información básica y la gestión de
 * veterinarios, propietarios, mascotas y agendas.
 *
 * Proporciona operaciones CRUD (crear, leer, actualizar, eliminar) sobre las
 * entidades relacionadas.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Veterinaria {
    private String nombre;
    private String nit;
    private String direccion;
    private Collection<Veterinario> veterinarios;
    private Collection<Propietario> propietarios;
    private Collection<Mascota> mascotas;
    private Collection<Agenda> agendas;

    /**
     * Crea una nueva veterinaria con los datos básicos.
     *
     * @param nombre    nombre de la veterinaria
     * @param nit       NIT de la veterinaria
     * @param direccion dirección física de la veterinaria
     */
    public Veterinaria(String nombre, String nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        veterinarios = new ArrayList<>();
        propietarios = new ArrayList<>();
        mascotas = new ArrayList<>();
        agendas = new ArrayList<>();
    }

    // ================= GETTERS & SETTERS =================

    /**
     * Obtiene el nombre de la veterinaria.
     *
     * @return nombre de la veterinaria
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la veterinaria.
     *
     * @param nombre nuevo nombre de la veterinaria
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el NIT de la veterinaria.
     *
     * @return NIT de la veterinaria
     */
    public String getNit() {
        return nit;
    }

    /**
     * Establece el NIT de la veterinaria.
     *
     * @param nit nuevo NIT
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * Obtiene la dirección de la veterinaria.
     *
     * @return dirección de la veterinaria
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección de la veterinaria.
     *
     * @param direccion nueva dirección
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene todos los veterinarios registrados en la clínica.
     *
     * @return colección de veterinarios
     */
    public Collection<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(Collection<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    /**
     * Obtiene todos los propietarios registrados en la clínica.
     *
     * @return colección de propietarios
     */
    public Collection<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Collection<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    /**
     * Obtiene todas las mascotas registradas en la clínica.
     *
     * @return colección de mascotas
     */
    public Collection<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Collection<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    /**
     * Obtiene todas las agendas registradas.
     *
     * @return colección de agendas
     */
    public Collection<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(Collection<Agenda> agendas) {
        this.agendas = agendas;
    }

    // ================= READERS =================

    /**
     * Busca un veterinario por su ID.
     *
     * @param id ID del veterinario
     * @return veterinario encontrado o null si no existe
     */
    public Veterinario getVeterinario(String id) {
        if (veterinarios.isEmpty()) {
            return null;
        }
        for (Veterinario veterinario : veterinarios) {
            if (veterinario.getId().equals(id)) {
                return veterinario;
            }
        }
        return null;
    }

    /**
     * Busca un propietario por su ID.
     *
     * @param id ID del propietario
     * @return propietario encontrado o null si no existe
     */
    public Propietario getPropietario(String id) {
        if (propietarios.isEmpty()) {
            return null;
        }
        for (Propietario propietario : propietarios) {
            if (propietario.getId().equals(id)) {
                return propietario;
            }
        }
        return null;
    }

    /**
     * Busca una mascota por su ID.
     *
     * @param id ID de la mascota
     * @return mascota encontrada o null si no existe
     */
    public Mascota getMascota(String id) {
        if (mascotas.isEmpty()) {
            return null;
        }
        for (Mascota mascota : mascotas) {
            if (mascota.getId().equals(id)) {
                return mascota;
            }
        }
        return null;
    }

    /**
     * Busca una agenda por fecha, hora y mascota asociada.
     *
     * @param fecha  fecha de la cita
     * @param hora   hora de la cita
     * @param mascota mascota relacionada
     * @return agenda encontrada o null si no existe
     */
    public Agenda getAgenda(String fecha, String hora, Mascota mascota) {
        if (agendas.isEmpty()) {
            return null;
        }
        for (Agenda agenda : agendas) {
            if (agenda.getFecha().equals(fecha) && agenda.getHora().equals(hora)
                    && agenda.getMascota().equals(mascota)) {
                return agenda;
            }
        }
        return null;
    }

    // ================= CREATORS =================

    /**
     * Agrega un veterinario si no existe ya en el sistema.
     *
     * @param veterinario nuevo veterinario
     * @return true si se agregó, false si ya existía
     */
    public boolean addVeterinario(Veterinario veterinario) {
        if (this.getVeterinario(veterinario.getId()) == null) {
            this.veterinarios.add(veterinario);
            return true;
        }
        return false;
    }

    /**
     * Agrega un propietario si no existe ya en el sistema.
     *
     * @param propietario nuevo propietario
     * @return true si se agregó, false si ya existía
     */
    public boolean addPropietario(Propietario propietario) {
        if (this.getPropietario(propietario.getId()) == null) {
            this.propietarios.add(propietario);
            return true;
        }
        return false;
    }

    /**
     * Agrega una mascota si no existe ya en el sistema.
     *
     * @param mascota nueva mascota
     * @return true si se agregó, false si ya existía
     */
    public boolean addMascota(Mascota mascota) {
        if (this.getMascota(mascota.getId()) == null) {
            this.mascotas.add(mascota);
            return true;
        }
        return false;
    }

    /**
     * Agrega una agenda si no existe ya en el sistema.
     *
     * @param agenda nueva agenda
     * @return true si se agregó, false si ya existía
     */
    public boolean addAgenda(Agenda agenda) {
        if (this.getAgenda(agenda.getFecha(), agenda.getHora(), agenda.getMascota()) == null) {
            this.agendas.add(agenda);
            return true;
        }
        return false;
    }

    // ================= UPDATERS =================

    /**
     * Actualiza un veterinario existente.
     *
     * @param veterinario veterinario actualizado
     * @return true si se actualizó, false si no existía
     */
    public boolean updateVeterinario(Veterinario veterinario) {
        Veterinario v = this.getVeterinario(veterinario.getId());
        if (v == null) {
            return false;
        }
        this.veterinarios.remove(v);
        this.veterinarios.add(veterinario);
        return true;
    }

    /**
     * Actualiza un propietario existente.
     *
     * @param propietario propietario actualizado
     * @return true si se actualizó, false si no existía
     */
    public boolean updatePropietario(Propietario propietario) {
        Propietario p = this.getPropietario(propietario.getId());
        if (p == null) {
            return false;
        }
        this.propietarios.remove(p);
        this.propietarios.add(propietario);
        return true;
    }

    /**
     * Actualiza una mascota existente.
     *
     * @param mascota mascota actualizada
     * @return true si se actualizó, false si no existía
     */
    public boolean updateMascota(Mascota mascota) {
        Mascota m = this.getMascota(mascota.getId());
        if (m == null) {
            return false;
        }
        this.mascotas.remove(m);
        this.mascotas.add(mascota);
        return true;
    }

    /**
     * Actualiza una agenda existente.
     *
     * @param agenda agenda actualizada
     * @return true si se actualizó, false si no existía
     */
    public boolean updateAgenda(Agenda agenda) {
        Agenda a = this.getAgenda(agenda.getFecha(), agenda.getHora(), agenda.getMascota());
        if (a == null) {
            return false;
        }
        this.agendas.remove(a);
        this.agendas.add(agenda);
        return true;
    }

    // ================= DELETERS =================

    /**
     * Elimina un veterinario por ID.
     *
     * @param id ID del veterinario
     * @return true si se eliminó, false si no existía
     */
    public boolean deleteVeterinario(String id) {
        Veterinario v = this.getVeterinario(id);
        if (v == null) {
            return false;
        }
        this.veterinarios.remove(v);
        return true;
    }

    /**
     * Elimina un propietario por ID.
     *
     * @param id ID del propietario
     * @return true si se eliminó, false si no existía
     */
    public boolean deletePropietario(String id) {
        Propietario p = this.getPropietario(id);
        if (p == null) {
            return false;
        }
        this.propietarios.remove(p);
        return true;
    }

    /**
     * Elimina una mascota por ID.
     *
     * @param id ID de la mascota
     * @return true si se eliminó, false si no existía
     */
    public boolean deleteMascota(String id) {
        Mascota m = this.getMascota(id);
        if (m == null) {
            return false;
        }
        this.mascotas.remove(m);
        return true;
    }

    /**
     * Elimina una agenda existente.
     *
     * @param agenda agenda a eliminar
     * @return true si se eliminó, false si no existía
     */
    public boolean deleteAgenda(Agenda agenda) {
        Agenda a = this.getAgenda(agenda.getFecha(), agenda.getHora(), agenda.getMascota());
        if (a == null) {
            return false;
        }
        this.agendas.remove(a);
        return true;
    }
}
