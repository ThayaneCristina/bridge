public abstract class Movel {

    protected Material material;

    protected String produto;

    public Movel(String produto) {
        this.produto = produto;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

}
