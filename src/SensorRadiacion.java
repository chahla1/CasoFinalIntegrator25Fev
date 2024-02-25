public class SensorRadiacion extends Sensor {
    public SensorRadiacion() {
        super("Radiación", 50);
    }

    @Override
    public double leerValor() {
        // Lógica para leer el nivel de radiación (simulación)
        return Math.random() * 100;
    }

    @Override
    public boolean esValorCritico(double valor) {
        return valor > 90; // Ejemplo de umbral crítico para la radiación
    }
}
