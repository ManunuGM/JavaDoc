package gestiontareas;
/**
 * Clase principal para probar la gestión de tareas.
 */
public class Principal {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea(new Tarea("Hacer la compra", 2));
        gestor.mostrarTareas();
    }
}
