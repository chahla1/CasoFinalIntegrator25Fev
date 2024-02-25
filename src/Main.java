import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
        cronometro.setSeconds(1000000);
        cronometro.displayTime();

        double earthTime = 365 * 24 * 60 * 60;
        ConversorTiempo conversorTiempo = new ConversorTiempo();
        double newPlanetTime = conversorTiempo.convertToNewPlanet(earthTime);
        System.out.println("El tiempo en el nuevo planeta es: " + newPlanetTime);
        Scanner scanner = new Scanner(System.in);


        Recursos recursos = new Recursos();


        int totalDias = 10;
        for (int dia = 1; dia <= totalDias; dia++) {
            System.out.print("Ingrese la cantidad de recursos consumidos en el día " + dia + ": ");
            double consumoDiario = scanner.nextDouble();


            recursos.registrarConsumoDiario(consumoDiario);
        }


        recursos.calcularYMostrarEstadisticas();
    }
}








