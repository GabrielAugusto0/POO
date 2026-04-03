public class Pleno extends Desenvolvedor{
    private int projEntrada;
    public Pleno(){
        super();
    }
    public Pleno(String nome, String linguagem, float salarioBase, int projEntrada) {
        super(nome, linguagem, salarioBase);
        this.projEntrada = projEntrada;
    }

    public int getProjEntrada() {
        return projEntrada;
    }

    public void setProjEntrada(int projEntrada) {
        this.projEntrada = projEntrada;
    }
    @Override
    public void codar(){
        System.out.println("Pleno codando e fazendo code review");
    }
    @Override
    public float calcularBonus(){
        return this.salarioBase * 0.05f;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projEntrada=" + projEntrada +
                '}';
    }
}