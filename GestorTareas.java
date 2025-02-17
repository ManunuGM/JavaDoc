package gestiontareas;
import java.util.ArrayList;
import java.util.List;

/**
 * Administra una lista de tareas.
 *
 * @author TuNombre
 * @version 1.0
 * @since 2025
 */
public class GestorTareas {
    private List<Tarea> tareas;

    /**
     * Constructor que inicializa la lista de tareas.
     */
    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    /**
     * Agrega una tarea a la lista.
     *
     * @param tarea La tarea a agregar
     */
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    /**
     * Muestra todas las tareas en la consola.
     */
    public void mostrarTareas() {
        for (Tarea tarea : tareas) {
            System.out.println("Tarea: " + tarea.getNombre());
        }
    }
}
