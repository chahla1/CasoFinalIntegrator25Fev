public class Planificador {
    private static final String[] TAREAS = {"Tarea A", "Tarea B", "Tarea C", "Tarea D"};

    public void distribuirTareas(MiembroTripulacion... tripulantes) {
        int indexTarea = 0;
        for (MiembroTripulacion tripulante : tripulantes) {
            tripulante.agregarTarea(TAREAS[indexTarea % TAREAS.length]);
            indexTarea++;
        }
    }

    public void visualizarTablas() {
        System.out.println("Tablas de tareas:");
        for (int i = 1; i <= TAREAS.length; i++) {
            for (int j = 1; j <= TAREAS.length; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public void calcularCargaOptima(MiembroTripulacion... tripulantes) {
        System.out.println("\nCarga de trabajo óptima:");

        for (MiembroTripulacion tripulante : tripulantes) {
            int cargaOptima = 0;
            for (String tarea : tripulante.getTareas()) {
                // Simulación de la carga óptima utilizando el producto escalar
                cargaOptima += tarea.length();
            }
            System.out.println(tripulante.getNombre() + ": " + cargaOptima);
        }
    }
}
