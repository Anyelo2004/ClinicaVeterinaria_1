module co.edu.uniquindio.clinicaveterinaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.clinicaveterinaria to javafx.fxml;
    exports co.edu.uniquindio.clinicaveterinaria;
    opens co.edu.uniquindio.clinicaveterinaria.ViewController to javafx.fxml;
    opens co.edu.uniquindio.clinicaveterinaria.Model to javafx.base;

}
