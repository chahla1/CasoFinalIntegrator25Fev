import java.util.Scanner;

public class ComunicadorInterplanetario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un mensaje desde la Tierra
        System.out.print("Ingrese un mensaje desde la Tierra: ");
        String mensajeDesdeTierra = scanner.nextLine();

        // Crear una instancia del Comunicador
        Comunicador comunicador = new Comunicador();

        // Traducir y analizar el mensaje
        comunicador.traducirYAnalizarMensaje(mensajeDesdeTierra);
    }
}
