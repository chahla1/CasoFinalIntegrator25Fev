public class Navegador {
    private int filas;
    private int columnas;
    private int[][] terreno;
    private int[][] construcciones;

    public Navegador(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.terreno = new int[filas][columnas];
        this.construcciones = new int[filas][columnas];
    }

    public void setTerreno(int[][] terreno) {
        this.terreno = terreno;
    }

    public void setConstrucciones(int[][] construcciones) {
        this.construcciones = construcciones;
    }

    public void visualizarTerreno() {
        System.out.println("Terreno:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(terreno[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void visualizarConstrucciones() {
        System.out.println("Construcciones:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(construcciones[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void calcularYVisualizarRutasOptimizadas() {
        // Implementar la multiplicación de matrices para optimizar rutas y recursos
        // Puedes utilizar algoritmos de optimización según tus necesidades específicas
        // Aquí se proporciona una visualización simple de las rutas optimizadas
        System.out.println("\nRutas optimizadas:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(terreno[i][j] + construcciones[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int calcularRutasOptimizadas() {
        return 0;
    }
}
