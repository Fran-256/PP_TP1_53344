public class Charla extends Actividad {
    private String disertante;

    public Charla(int id, String titulo, int cupoMaximo, String disertante) {
        super(id, titulo, cupoMaximo);
        this.disertante = disertante;
    }

    public String getDisertante() { return disertante; }
    public void setDisertante(String disertante) { this.disertante = disertante; }

    @Override
    public void mostrarDetallesEspecificos() {
        System.out.println("[CHARLA] Título: " + getTitulo() + " | Disertante: " + disertante + " | Cupo: " + getCupoMaximo());
        for (Inscripcion insc : inscripciones) {
            insc.mostrarDatos();
        }
    }
}
