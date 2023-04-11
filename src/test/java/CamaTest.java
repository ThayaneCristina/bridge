import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CamaTest {

    @Test
    void deveRetornarProdutoCamaMDF() {
        Material material = new Mdf();
        Cama cama = new Cama("Cama");
        cama.setMaterial(material);
        assertEquals("Cama/MDF", cama.ProdutoFinal());
    }

    @Test
    void deveRetornarProdutoCamaMadeira() {
        Material material = new Madeira();
        Cama cama = new Cama("Cama");
        cama.setMaterial(material);
        assertEquals("Cama/Madeira", cama.ProdutoFinal());
    }
}