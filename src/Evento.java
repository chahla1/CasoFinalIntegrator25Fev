public class Evento {
    private String sensor;
    private double valor;

    public Evento(String sensor, double valor) {
        this.sensor = sensor;
        this.valor = valor;
    }

    public String getSensor() {
        return sensor;
    }

    public double getValor() {
        return valor;
    }
}
