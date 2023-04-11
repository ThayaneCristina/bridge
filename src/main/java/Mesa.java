public class Mesa extends Movel {

    public Mesa(String produto){
        super(produto);
    }

    public String ProdutoFinal() {
        return this.produto + "/" + this.material.tipo();
    }
}
