package co.edu.uniquindio.clinicaveterinaria.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeterinariaTest {

    Veterinaria veterinaria;
    Veterinario vet1;
    Veterinario vet2;
    Propietario prop1;
    Propietario prop2;
    Mascota mascota1;
    Mascota mascota2;
    Agenda agenda1;
    Agenda agenda2;

    @BeforeEach
    void setUp() {
        veterinaria = new Veterinaria("Veterinaria Animal Health","646464","centro de armenia al lado de la Olla");

        // Veterinarios
        vet1 = new Veterinario("Carlos Pérez", "V001", "555-111", "LIC-1234", Especialidad.DOMESTICOS);
        vet2 = new Veterinario("María Gómez", "V002", "555-222", "LIC-5678", Especialidad.EXOTICOS);

        // Propietarios
        prop1 = new Propietario("Ana Torres", "P001", "300-555", "Calle 10 #45-23");
        prop2 = new Propietario("Luis Morales", "P002", "301-777", "Carrera 20 #12-34");

        // Mascotas
        mascota1 = new Mascota("Firulais", "5", "Labrador", 'M', "M001", Especie.PERRO);
        mascota2 = new Mascota("Misu", "3", "Siames", 'F', "M002", Especie.GATO);

        // Agendas
        agenda1 = new Agenda("10:00", "2025-08-20", mascota1, vet1);
        agenda2 = new Agenda("11:30", "2025-08-21", mascota2, vet2);

        // Se añaden algunos datos iniciales
        veterinaria.addVeterinario(vet1);
        veterinaria.addPropietario(prop1);
        veterinaria.addMascota(mascota1);
        veterinaria.addAgenda(agenda1);
    }

    @Test
    @DisplayName("Agregar entidades en veterinaria")
    void testAddEntities() {
        assertTrue(veterinaria.addVeterinario(vet2));
        assertTrue(veterinaria.addPropietario(prop2));
        assertTrue(veterinaria.addMascota(mascota2));
        assertTrue(veterinaria.addAgenda(agenda2));
    }

    @Test
    @DisplayName("Actualizar entidades en veterinaria")
    void testUpdateEntities() {
        Veterinario vetNuevo = new Veterinario("Carlos Pérez Actualizado", "V001", "555-999", "LIC-0000", Especialidad.DOMESTICOS);
        Propietario propNuevo = new Propietario("Ana Torres Actualizada", "P001", "322-000", "Nueva Dirección");
        Mascota mascotaNueva = new Mascota("Firulais Jr", "6", "Bulldog", 'M', "M001", Especie.PERRO);
        Agenda agendaNueva = new Agenda("15:00", "2025-08-22", mascota1, vet1);

        assertTrue(veterinaria.updateVeterinario(vetNuevo));
        assertTrue(veterinaria.updatePropietario(propNuevo));
        assertTrue(veterinaria.updateMascota(mascotaNueva));
        assertTrue(veterinaria.updateAgenda(agendaNueva));
    }

    @Test
    @DisplayName("Eliminar entidades en veterinaria")
    void testDeleteEntities() {
        assertTrue(veterinaria.deleteVeterinario("V001"));
        assertTrue(veterinaria.deletePropietario("P001"));
        assertTrue(veterinaria.deleteMascota("M001"));
        assertTrue(veterinaria.deleteAgenda(agenda1));
    }

    @Test
    @DisplayName("Evitar duplicados en creación")
    void testAddDuplicados() {
        // Ya existen vet1, prop1, mascota1, agenda1 desde @BeforeEach
        assertFalse(veterinaria.addVeterinario(vet1));
        assertFalse(veterinaria.addPropietario(prop1));
        assertFalse(veterinaria.addMascota(mascota1));
        assertFalse(veterinaria.addAgenda(agenda1));
    }
}
