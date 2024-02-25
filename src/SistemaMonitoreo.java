import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoreo {
    public static void main(String[] args) {
        // Crear instancias de los sensores (radiación, temperatura, presión)
        SensorRadiacion sensorRadiacion = new SensorRadiacion();
        SensorTemperatura sensorTemperatura = new SensorTemperatura();
        SensorPresion sensorPresion = new SensorPresion();

        // Lista para almacenar eventos raros o críticos
        List<Evento> eventosRaros = new ArrayList<>();

        // Monitoreo constante
        while (true) {
            // Leer valores de los sensores
            double nivelRadiacion = sensorRadiacion.leerNivel();
            double temperatura = sensorTemperatura.leerTemperatura();
            double presion = sensorPresion.leerPresion();

            // Verificar niveles y generar alertas
            verificarYAlertar(sensorRadiacion, nivelRadiacion, eventosRaros);
            verificarYAlertar(sensorTemperatura, temperatura, eventosRaros);
            verificarYAlertar(sensorPresion, presion, eventosRaros);

            // Identificar y listar los N primeros eventos raros
            identificarYListarEventosRaros(eventosRaros, 5);

            // Pausa para simular el monitoreo constante
            try {
                Thread.sleep(5000); // Pausa de 5 segundos entre lecturas
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void verificarYAlertar(Sensor sensor, double valor, List<Evento> eventosRaros) {
        // Verificar y generar alerta si es necesario
        if (sensor.esValorCritico(valor)) {
            System.out.println("¡Alerta! Valor crítico detectado en " + sensor.getNombre() + ": " + valor);

            // Agregar el evento a la lista de eventos raros
            eventosRaros.add(new Evento(sensor.getNombre(), valor));
        }
    }

    private static void identificarYListarEventosRaros(List<Evento> eventosRaros, int n) {
        // Identificar y listar los N primeros eventos raros
        System.out.println("\nLista de los primeros " + n + " eventos raros:");
        for (int i = 0; i < Math.min(n, eventosRaros.size()); i++) {
            Evento evento = eventosRaros.get(i);
            System.out.println("Evento en " + evento.getSensor() + ": " + evento.getValor());
        }
    }
}

