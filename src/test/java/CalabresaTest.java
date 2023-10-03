import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalabresaTest {

    @Test
    public void deveRetornarPizzaCalabresaComAdicionalDeAlho() {
        IngredienteAdicional adicional = new Alho();
        Calabresa calabresa = new Calabresa(70.0f);
        calabresa.setAdicional(adicional);
        assertEquals(70.0f, calabresa.calcularPreco(), 1.0f);
    }

    @Test
    public void deveRetornarPizzaCalabresaComAdicionalDeCebola() {
        IngredienteAdicional adicional = new Cebola();
        Calabresa calabresa = new Calabresa(70.0f);
        calabresa.setAdicional(adicional);
        assertEquals(70.0f, calabresa.calcularPreco(), 1.5f);
    }

    @Test
    public void deveRetornarPizzaCalabresaComAdicionalDeTomate() {
        IngredienteAdicional adicional = new Tomate();
        Calabresa calabresa = new Calabresa(70.0f);
        calabresa.setAdicional(adicional);
        assertEquals(70.0f, calabresa.calcularPreco(), 2.0f);
    }

    @Test
    public void deveRetornarPizzaCalabresaComAdicionalDeCatupiry() {
        IngredienteAdicional adicional = new Catupiry();
        Calabresa calabresa = new Calabresa(70.0f);
        calabresa.setAdicional(adicional);
        assertEquals(70.0f, calabresa.calcularPreco(), 5.0f);
    }
}
