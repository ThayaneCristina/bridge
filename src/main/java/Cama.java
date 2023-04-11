public class Cama extends Movel {

    public Cama(String produto){
        super(produto);
    }


    public String ProdutoFinal() {
        return this.produto + "/" + this.material.tipo();
    }


}
