package co.edu.uniquindio.clinicaveterinaria.Controller;

import co.edu.uniquindio.clinicaveterinaria.Model.Veterinaria;
import co.edu.uniquindio.clinicaveterinaria.Model.Mascota;


public class MascotaController {
    Veterinaria veterinaria;

    public MascotaController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }
    public boolean addMascota(Mascota mascota) {
        return veterinaria.addMascota(mascota);
    }

    public boolean deleteMascota(Mascota mascota) {
        return veterinaria.deleteMascota(mascota.getId());
    }

    public boolean updateMascota(Mascota mascota) {
        return veterinaria.updateMascota(mascota);
    }


}
