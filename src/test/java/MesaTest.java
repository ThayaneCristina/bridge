import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MesaTest {

    @Test
    void deveRetornarProdutoMesaMDF() {
        Material material = new Mdf();
        Mesa mesa = new Mesa("Mesa");
        mesa.setMaterial(material);
        assertEquals("Mesa/MDF", mesa.ProdutoFinal());
    }

    @Test
    void deveRetornarProdutoMesaMadeira() {
        Material material = new Madeira();
        Mesa mesa = new Mesa("Mesa");
        mesa.setMaterial(material);
        assertEquals("Mesa/Madeira", mesa.ProdutoFinal());
    }
}
