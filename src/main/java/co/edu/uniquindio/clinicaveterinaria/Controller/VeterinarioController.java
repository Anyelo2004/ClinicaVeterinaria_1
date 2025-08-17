package co.edu.uniquindio.clinicaveterinaria.Controller;

import co.edu.uniquindio.clinicaveterinaria.Model.Mascota;
import co.edu.uniquindio.clinicaveterinaria.Model.Veterinaria;
import co.edu.uniquindio.clinicaveterinaria.Model.Veterinario;

public class VeterinarioController {
    Veterinaria veterinaria;

    public VeterinarioController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }
    public boolean addVeterinario(Veterinario veterinario) {
        return veterinaria.addVeterinario(veterinario);
    }

    public boolean deleteVeterinario(Veterinario veterinario) {
        return veterinaria.deleteVeterinario(veterinario.getId());
    }

    public boolean updateVeterinario(Veterinario veterinario) {
        return veterinaria.updateVeterinario(veterinario);
    }

}
