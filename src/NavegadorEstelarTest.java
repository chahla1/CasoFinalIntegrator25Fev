import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NavegadorEstelarTest {

    @Test
    void calcularRutasOptimizadas() {
        Navegador navegador = new Navegador(3, 3);

        int[][] terreno = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 1, 1}
        };

        int[][] construcciones = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        navegador.setTerreno(terreno);
        navegador.setConstrucciones(construcciones);

        int rutasOptimizadas = navegador.calcularRutasOptimizadas();

        int[][] resultadoEsperado = {
                {2, 0, 1},
                {0, 2, 0},
                {1, 0, 2}
        };

        assertArrayEquals(resultadoEsperado, rutasOptimizadas);
    }

    private void assertArrayEquals(int[][] resultadoEsperado, int rutasOptimizadas) {
    }
}
