import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemVenda> itens = new ArrayList<>();

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public double getTotal() {
        return itens.stream().mapToDouble(ItemVenda::getSubtotal).sum();
    }

    @Override
    public String toString() {
        return "Venda{id=" + id + ", cliente='" + cliente.getNome() +
                "', itens=" + itens + ", total=R$" + getTotal() + "}";
    }

}
