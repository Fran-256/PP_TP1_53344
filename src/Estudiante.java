public class Estudiante {
    private String legajo;
    private String nombreCompleto;

    public Estudiante(String legajo, String nombreCompleto) {
        this.legajo = legajo;
        this.nombreCompleto = nombreCompleto;
    }

    public String getLegajo() { return legajo; }
    public void setLegajo(String legajo) { this.legajo = legajo; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public void mostrarDatos() {
        System.out.println("Estudiante [Legajo: " + legajo + ", Nombre: " + nombreCompleto + "]");
    }
}