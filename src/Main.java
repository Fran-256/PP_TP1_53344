import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJECUCIÓN DEL ESCENARIO ===\n");

        // a. Se crean 3 estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("EST-101", "Lucía Gómez"));
        estudiantes.add(new Estudiante("EST-102", "Carlos Pérez"));
        estudiantes.add(new Estudiante("EST-103", "Ana Fernández"));

        // b. Se crea 1 evento
        EventoUniversitario evento = new EventoUniversitario("E-01", "Congreso de Tecnologías 2026", 5000.0, false);

        // c. Se crea 1 sala y se asigna (Agregación)
        Sala sala = new Sala(302, "Auditorio Principal");
        evento.asignarSala(sala);

        // d. Se crean 2 actividades para el evento: una Charla y un Taller
        Charla charla = new Charla(1, "Inteligencia Artificial Aplicada", 30, "Dra. Martina López");
        Taller taller = new Taller(2, "Programación Orientada a Objetos en Java", 15, true);

        evento.agregarActividad(charla);
        evento.agregarActividad(taller);

        // e. Se inscriben 2 estudiantes en la Charla (Lucía y Carlos)
        charla.inscribe(estudiantes.get(0));
        charla.inscribe(estudiantes.get(1));

        // f. Se inscriben 2 estudiantes en el Taller (Carlos y Ana)
        taller.inscribe(estudiantes.get(1));
        taller.inscribe(estudiantes.get(2));
        evento.mostrarDatos();
    }
}