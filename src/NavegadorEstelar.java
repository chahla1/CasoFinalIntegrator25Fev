public class NavegadorEstelar {
    public static void main(String[] args) {
        // Definir el tamaño del terreno
        int filas = 5;
        int columnas = 5;

        // Crear una instancia del Navegador
        Navegador navegador = new Navegador(filas, columnas);

        // Definir el terreno y las construcciones
        int[][] terreno = {
                {1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 1, 0, 0},
                {1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };

        // Definir construcciones (1 representa construcción, 0 representa espacio vacío)
        int[][] construcciones = {
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1}
        };

        // Establecer el terreno y las construcciones en el navegador
        navegador.setTerreno(terreno);
        navegador.setConstrucciones(construcciones);

        // Visualizar el terreno y las construcciones
        navegador.visualizarTerreno();
        navegador.visualizarConstrucciones();

        // Calcular y visualizar rutas optimizadas
        navegador.calcularYVisualizarRutasOptimizadas();
    }
}
