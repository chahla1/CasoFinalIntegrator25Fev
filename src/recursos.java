import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Recursos {
    private List<Double> consumosDiarios;

    public Recursos() {
        consumosDiarios = new ArrayList<>();
    }

    public void registrarConsumoDiario(double consumo) {
        consumosDiarios.add(consumo);
    }

    public void calcularYMostrarEstadisticas() {

        if (!consumosDiarios.isEmpty()) {
            double media = calcularMedia();
            double minimo = Collections.min(consumosDiarios);
            double maximo = Collections.max(consumosDiarios);

            System.out.println("media de consumo: " + media);
            System.out.println("minimo de consumo: " + minimo);
            System.out.println("maximo de consumo: " + maximo);
        } else {
            System.out.println("No hay datos para calcular.");
        }
    }

    private double calcularMedia() {
        double suma = 0;
        for (double consumo : consumosDiarios) {
            suma += consumo;
        }
        return suma / consumosDiarios.size();
    }

    public double calcularMediaConsumo() {
        return 0;
    }


    public double calcularMinimoConsumo() {
        return 0;
    }

    public double calcularMaximoConsumo() {
        return 0;
    }
}
