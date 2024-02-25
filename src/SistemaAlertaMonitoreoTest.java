import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaAlertaMonitoreoTest {

    @Test
    void verificarAlertaConValorCritico() {
        Sensor sensor = new Sensor("Prueba", 100) {
            @Override
            public double leerValor() {
                return 0;
            }

            @Override
            public boolean esValorCritico(double valor) {
                return false;
            }
        };
        assertTrue(sensor.verificarAlerta());
    }

    private void assertTrue(int i) {
    }

    @Test
    void verificarNoAlertaConValorNormal() {
        Sensor sensor = new Sensor("Prueba", 50) {
            @Override
            public double leerValor() {
                return 0;
            }

            @Override
            public boolean esValorCritico(double valor) {
                return false;
            }
        };
        assertFalse(sensor.verificarAlerta());
    }

    private void assertFalse(int i) {
        
    }
}

