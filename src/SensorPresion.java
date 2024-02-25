public class SensorPresion extends Sensor {
    public SensorPresion() {
        super("Presión", 50);
    }

    @Override
    public double leerValor() {
        // Lógica para leer la presión (simulación)
        return 1000 + Math.random() * 20;
    }

    @Override
    public boolean esValorCritico(double valor) {
        return valor < 990; // Ejemplo de umbral crítico para la presión
    }
}
