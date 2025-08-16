package co.edu.uniquindio.clinicaveterinaria.Model;

public class HistorialItem {
    private String tipo;
    private String fecha;
    private String hora;
    private String mascota;
    private String veterinario;
    private String motivo;
    private String diagnostico;
    private String tratamiento;

    public HistorialItem(String tipo, String fecha, String hora, String mascota, String veterinario,
                         String motivo, String diagnostico, String tratamiento) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public String getTipo() { return tipo; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getMascota() { return mascota; }
    public String getVeterinario() { return veterinario; }
    public String getMotivo() { return motivo; }
    public String getDiagnostico() { return diagnostico; }
    public String getTratamiento() { return tratamiento; }
}
