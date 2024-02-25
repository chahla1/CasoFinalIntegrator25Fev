import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CronometroTest {

    @Test
    void convertirTiempoATiempoNuevo() {
        double tiempoEnLaTierra = 365 * 24 * 60 * 60;
        double tiempoEnNuevoPlaneta = ConversorTiempo.convertirTiempoNuevo(tiempoEnLaTierra);
        assertEquals(365 * 24 * 60 * 60 * 2.3, tiempoEnNuevoPlaneta);
    }

    @Test
    void calcularMaximosValores() {
        assertEquals(Long.MAX_VALUE, Cronometro.calcularMaximoValor());
    }
}
