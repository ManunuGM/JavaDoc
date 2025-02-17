package gestiontareas;
/**
 * Representa una tarea con un nombre y una prioridad.
 *
 * @author TuNombre
 * @version 1.0
 * @since 2025
 */
public class Tarea {
    private String nombre;
    private int prioridad;

    /**
     * Constructor de la tarea.
     *
     * @param nombre Nombre de la tarea
     * @param prioridad Prioridad de la tarea (1 a 5, donde 1 es la más alta)
     */
    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    /**
     * Obtiene el nombre de la tarea.
     *
     * @return Nombre de la tarea
     */
    public String getNombre() {
        return nombre;
    }
}