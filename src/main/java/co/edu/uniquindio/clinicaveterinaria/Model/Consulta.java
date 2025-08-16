package co.edu.uniquindio.clinicaveterinaria.Model;

import java.util.ArrayList;

public class Consulta {
    public String diagnostico;
    public String motivoConsulta;
    public String tratamiento;
    public ArrayList<Mascota> mascotas;

    public Consulta(String diagnostico, String motivoConsulta, String tratamiento) {
        this.diagnostico = diagnostico;
        this.motivoConsulta = motivoConsulta;
        this.tratamiento = tratamiento;
        this.mascotas = new ArrayList<>();
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        tratamiento = tratamiento;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
