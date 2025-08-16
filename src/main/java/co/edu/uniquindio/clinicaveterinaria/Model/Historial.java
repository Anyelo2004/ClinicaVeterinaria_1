package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;

public class Historial {
    public ArrayList<Consulta> consultas;

    public Historial() {
        consultas = new ArrayList<>();
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
}
