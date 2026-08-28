public class Taller extends Actividad {
    private boolean requiereNotebook;

    public Taller(int id, String titulo, int cupoMaximo, boolean requiereNotebook) {
        super(id, titulo, cupoMaximo);
        this.requiereNotebook = requiereNotebook;
    }

    public boolean isRequiereNotebook() { return requiereNotebook; }
    public void setRequiereNotebook(boolean requiereNotebook) { this.requiereNotebook = requiereNotebook; }

    @Override
    public void mostrarDetallesEspecificos() {
        System.out.println("[TALLER] Título: " + getTitulo() + " | Requiere Notebook: " + (requiereNotebook ? "Sí" : "No") + " | Cupo: " + getCupoMaximo());
        for (Inscripcion insc : inscripciones) {
            insc.mostrarDatos();
        }
    }
}