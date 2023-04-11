public class GuardaRoupa extends Movel{

    public GuardaRoupa(String produto){
        super(produto);
    }


    public String ProdutoFinal() {
        return this.produto + "/" + this.material.tipo();
    }
}
