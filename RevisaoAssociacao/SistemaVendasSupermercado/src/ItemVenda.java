public class ItemVenda {
    private int id;
    private int quantidade;
    private Produto produto;

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double getSubtotal(){
        return quantidade * produto.getPreco();

    }

    @Override
    public String toString() {
        return "Item{" + produto.getNome() +
                " x" + quantidade + " = R$" +
                getSubtotal() + "}";
    }
}
