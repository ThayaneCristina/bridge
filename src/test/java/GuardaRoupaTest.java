import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuardaRoupaTest {

    @Test
    void deveRetornarProdutoGuardaRoupaMDF() {
        Material material = new Mdf();
        GuardaRoupa guardaRoupa = new GuardaRoupa("Guarda Roupa");
        guardaRoupa.setMaterial(material);
        assertEquals("Guarda Roupa/MDF", guardaRoupa.ProdutoFinal());
    }

    @Test
    void deveRetornarProdutoGuardaRoupaMadeira() {
        Material material = new Madeira();
        GuardaRoupa guardaRoupa = new GuardaRoupa("Guarda Roupa");
        guardaRoupa.setMaterial(material);
        assertEquals("Guarda Roupa/Madeira", guardaRoupa.ProdutoFinal());
    }

}
