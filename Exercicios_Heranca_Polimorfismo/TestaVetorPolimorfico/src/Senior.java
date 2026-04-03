public class Senior  extends Desenvolvedor{
    private float verbaLider;
    public Senior(){
        super();
    }

    public Senior(String nome, String linguagem, float salarioBase, float verbaLider) {
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }

    @Override
    public void codar(){
        System.out.println("senior define e arquitetura e lidera pessoas");
    }
    @Override
    public float calcularBonus(){
        return this.salarioBase * 0.05f;
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                "verbaLider=" + verbaLider +
                '}';
    }
}