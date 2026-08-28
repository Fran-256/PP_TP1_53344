import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    protected List<Inscripcion> inscripciones;

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>();
    }

    public void inscribe(Estudiante estudiante) {
        if (inscripciones.size() < cupoMaximo) {
            Inscripcion nuevaInscripcion = new Inscripcion(estudiante);
            inscripciones.add(nuevaInscripcion);
            System.out.println("¡Inscripción exitosa para " + estudiante.getNombreCompleto() + " en '" + titulo + "'!");
        } else {
            System.out.println("Lo siento, la actividad '" + titulo + "' no tiene cupos disponibles.");
        }
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getCupoMaximo() { return cupoMaximo; }
    public List<Inscripcion> getInscripciones() { return inscripciones; }

    public abstract void mostrarDetallesEspecificos();
}
