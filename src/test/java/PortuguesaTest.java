import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortuguesaTest {

    @Test
    public void deveRetornarPizzaPortuguesaComAdicionalDeAlho() {
        IngredienteAdicional adicional = new Alho();
        Portuguesa portuguesa = new Portuguesa(65.0f);
        portuguesa.setAdicional(adicional);
        assertEquals(65.0f, portuguesa.calcularPreco(), 1.0f);
    }

    @Test
    public void deveRetornarPizzaPortuguesaComAdicionalDeCebola() {
        IngredienteAdicional adicional = new Cebola();
        Portuguesa portuguesa = new Portuguesa(65.0f);
        portuguesa.setAdicional(adicional);
        assertEquals(65.0f, portuguesa.calcularPreco(), 1.5f);
    }

    @Test
    public void deveRetornarPizzaPortuguesaComAdicionalDeTomate() {
        IngredienteAdicional adicional = new Tomate();
        Portuguesa portuguesa = new Portuguesa(65.0f);
        portuguesa.setAdicional(adicional);
        assertEquals(65.0f, portuguesa.calcularPreco(), 2.0f);
    }

    @Test
    public void deveRetornarPizzaPortuguesaComAdicionalDeCatupiry() {
        IngredienteAdicional adicional = new Catupiry();
        Portuguesa portuguesa = new Portuguesa(65.0f);
        portuguesa.setAdicional(adicional);
        assertEquals(65.0f, portuguesa.calcularPreco(), 5.0f);
    }
}
