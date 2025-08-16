module co.edu.uniquindio.clinicaveterinaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.clinicaveterinaria to javafx.fxml;
    exports co.edu.uniquindio.clinicaveterinaria;
}