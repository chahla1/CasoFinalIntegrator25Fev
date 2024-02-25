import java.util.ArrayList;
import java.util.List;

public class PlanificadorTareas {
    public static void main(String[] args) {
        // Crear instancias de la tripulación
        MiembroTripulacion tripulante1 = new MiembroTripulacion("Tripulante 1");
        MiembroTripulacion tripulante2 = new MiembroTripulacion("Tripulante 2");
        MiembroTripulacion tripulante3 = new MiembroTripulacion("Tripulante 3");

        // Crear instancia del planificador
        Planificador planificador = new Planificador();

        // Distribuir tareas
        planificador.distribuirTareas(tripulante1, tripulante2, tripulante3);

        // Visualizar tablas de tareas
        planificador.visualizarTablas();

        // Calcular la carga de trabajo óptima para cada miembro
        planificador.calcularCargaOptima(tripulante1, tripulante2, tripulante3);
    }
}
