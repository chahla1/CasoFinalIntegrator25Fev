public class Comunicador {
    public void traducirYAnalizarMensaje(String mensaje) {
        // Traducir y analizar el mensaje
        String mensajeTraducido = traducirMensaje(mensaje);
        int cantidadVocales = contarVocales(mensaje);
        boolean esPalindromo = esPalindromo(mensaje);

        // Mostrar resultados
        System.out.println("\nMensaje Traducido: " + mensajeTraducido);
        System.out.println("Cantidad de Vocales: " + cantidadVocales);
        System.out.println("Es Palíndromo: " + esPalindromo);
    }

    private String traducirMensaje(String mensaje) {
        // Implementar la lógica de traducción según tus necesidades
        // Aquí, simplemente invertiremos el mensaje como ejemplo
        StringBuilder mensajeInvertido = new StringBuilder(mensaje);
        return mensajeInvertido.reverse().toString();
    }

    private int contarVocales(String mensaje) {
        // Contar el número de vocales en el mensaje
        int count = 0;
        for (char ch : mensaje.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    private boolean esPalindromo(String mensaje) {
        // Verificar si el mensaje es un palíndromo
        String mensajeSinEspacios = mensaje.replaceAll("\\s+", "").toLowerCase();
        String mensajeInvertido = new StringBuilder(mensajeSinEspacios).reverse().toString();
        return mensajeSinEspacios.equals(mensajeInvertido);
    }
}
