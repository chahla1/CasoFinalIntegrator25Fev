public class SensorTemperatura extends Sensor {
    public SensorTemperatura() {
        super("Temperatura", 50);
    }

    @Override
    public double leerValor() {
        // Lógica para leer la temperatura (simulación)
        return 20 + Math.random() * 10;
    }

    @Override
    public boolean esValorCritico(double valor) {
        return valor > 25; // Ejemplo de umbral crítico para la temperatura
    }
}
