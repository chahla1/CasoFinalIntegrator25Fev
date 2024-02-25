import java.util.ArrayList;
import java.util.List;

public class MiembroTripulacion {
    private String nombre;
    private List<String> tareas;

    public MiembroTripulacion(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getTareas() {
        return tareas;
    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }
}
