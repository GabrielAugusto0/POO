public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(int id, String marca, Processador processador) {
        this.id = id;
        this.marca = marca;
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }
}
