import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {
    private String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private Sala sala; // Agregación
    private List<Actividad> actividades; // Composición

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>();
    }

    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void agregarActividad(Actividad actividad) {
        this.actividades.add(actividad);
    }

    public double calcularCostoTotal() {
        if (gratuito) {
            return 0.0;
        }
        // Aplicamos un impuesto estimado del 21% por ejemplo, o retornamos base
        return costoBase * 1.21;
    }

    public void mostrarDatos() {
        System.out.println("\n========================================");
        System.out.println("EVENTO: " + titulo + " (ID: " + id + ")");
        System.out.println("Costo Total con Impuestos: $" + calcularCostoTotal());
        if (sala != null) {
            System.out.print("SALA ASIGNADA: ");
            sala.mostrarDatos();
        }
        System.out.println("--- ACTIVIDADES DEL EVENTO ---");
        for (Actividad act : actividades) {
            act.mostrarDetallesEspecificos();
        }
        System.out.println("========================================\n");
    }

    public List<Actividad> getActividades() { return actividades; }
}
