import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursosTest {

    @Test
    void calcularMediaConsumo() {
        Recursos recursos = new Recursos();
        recursos.registrarConsumoDiario(10);
        recursos.registrarConsumoDiario(20);
        recursos.registrarConsumoDiario(30);

        assertEquals(20.0, recursos.calcularMediaConsumo());
    }

    @Test
    void calcularMinimoConsumo() {
        Recursos recursos = new Recursos();
        recursos.registrarConsumoDiario(10);
        recursos.registrarConsumoDiario(20);
        recursos.registrarConsumoDiario(5);

        assertEquals(5.0, recursos.calcularMinimoConsumo());
    }

    @Test
    void calcularMaximoConsumo() {
        Recursos recursos = new Recursos();
        recursos.registrarConsumoDiario(10);
        recursos.registrarConsumoDiario(20);
        recursos.registrarConsumoDiario(5);

        assertEquals(20.0, recursos.calcularMaximoConsumo());
    }
}
