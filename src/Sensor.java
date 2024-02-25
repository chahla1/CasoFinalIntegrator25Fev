public abstract class Sensor {
    private String nombre;

    public Sensor(String nombre, int i) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double leerValor();

    public abstract boolean esValorCritico(double valor);

    public double leerNivel() {
        return 0;
    }

    public double leerTemperatura() {
        return 0;
    }

    public double leerPresion() {
        return 0;
    }

    public int verificarAlerta() {
        return 0;
    }
}

