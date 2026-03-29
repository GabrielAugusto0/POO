import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos = new ArrayList<>();

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void construirApartamentos(int numero, int andar){
        apartamentos.add(new Apartamento(numero,andar));
        System.out.println("Apartamento" + numero + " construir no andar "+andar);
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", apartamentos=" + apartamentos +
                '}';
    }
}
