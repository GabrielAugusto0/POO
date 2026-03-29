public class Ingresso {
    private int id;
    private String assento;
    private String tipo;
    private float preco;

    public Ingresso(int id, String acento, String tipo, float preco) {
        this.id = id;
        this.acento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "assento='" + assento + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
