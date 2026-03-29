//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Processador {
    private String marca;
    private String modelo;
    private double fraquencia;

    public Processador(String marca, String modelo, double fraquencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.fraquencia = fraquencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fraquencia=" + fraquencia +
                '}';
    }
}