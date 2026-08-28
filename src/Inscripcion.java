import java.time.LocalDate;

public class Inscripcion {
    private LocalDate fechaInscripcion;
    private String estado;
    private Estudiante estudiante;

    public Inscripcion(Estudiante estudiante) {
        this.fechaInscripcion = LocalDate.now();
        this.estado = "CONFIRMADA";
        this.estudiante = estudiante;
    }

    public LocalDate getFechaInscripcion() { return fechaInscripcion; }
    public String getEstado() { return estado; }
    public Estudiante getEstudiante() { return estudiante; }

    public void mostrarDatos() {
        System.out.println("  -> Inscripción [Fecha: " + fechaInscripcion + ", Estado: " + estado + "]");
        estudiante.mostrarDatos();
    }
}