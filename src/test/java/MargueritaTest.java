import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MargueritaTest {

    @Test
    public void deveRetornarPizzaMargueritaComAdicionalDeAlho() {
        IngredienteAdicional adicional = new Alho();
        Marguerita marguerita = new Marguerita(60.0f);
        marguerita.setAdicional(adicional);
        assertEquals(60.0f, marguerita.calcularPreco(), 1.0f);
    }

    @Test
    public void deveRetornarPizzaMargueritaComAdicionalDeCebola() {
        IngredienteAdicional adicional = new Cebola();
        Marguerita marguerita = new Marguerita(60.0f);
        marguerita.setAdicional(adicional);
        assertEquals(60.0f, marguerita.calcularPreco(), 1.5f);
    }

    @Test
    public void deveRetornarPizzaMargueritaComAdicionalDeTomate() {
        IngredienteAdicional adicional = new Tomate();
        Marguerita marguerita = new Marguerita(60.0f);
        marguerita.setAdicional(adicional);
        assertEquals(60.0f, marguerita.calcularPreco(), 2.0f);
    }

    @Test
    public void deveRetornarPizzaMargueritaComAdicionalDeCatupiry() {
        IngredienteAdicional adicional = new Catupiry();
        Marguerita marguerita = new Marguerita(60.0f);
        marguerita.setAdicional(adicional);
        assertEquals(60.0f, marguerita.calcularPreco(), 5.0f);
    }
}
