package co.edu.uniquindio.clinicaveterinaria.Controller;

import co.edu.uniquindio.clinicaveterinaria.Model.Agenda;
import co.edu.uniquindio.clinicaveterinaria.Model.Veterinaria;

public class AgendaController {
    Veterinaria veterinaria;

    public AgendaController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }
    public boolean addAgenda(Agenda agenda) {
        return veterinaria.addAgenda(agenda);
    }

    public boolean deleteAgenda(Agenda agenda) {
        return veterinaria.deleteAgenda(agenda);
    }

    public boolean updateAgenda(Agenda agenda) {
        return veterinaria.updateAgenda(agenda);
    }

}
