package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;
import java.util.List;

public class Mascota {
    public String nombre;
    public String edad;
    public String raza;
    public char sexo;
    public String id;
    public Especie especie;

    // Lista estática para almacenar todas las mascotas registradas
    public static List<Mascota> listaMascotas = new ArrayList<>();

    public Mascota(String nombre, String edad, String raza, char sexo, String id, Especie especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
        this.id = id;
        this.especie = especie;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEdad() { return edad; }
    public void setEdad(String edad) { this.edad = edad; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public char getSexo() { return sexo; }
    public void setSexo(char sexo) { this.sexo = sexo; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Especie getEspecie() { return especie; }
    public void setEspecie(Especie especie) { this.especie = especie; }
}
