import java.util.Random;

public class Drone{

    public String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    //encapsulamento
    public Drone(String codigo, float altura, int bateria, boolean emVoo){
        setAltura(altura);
        setBateria(bateria);
        this.codigo = codigo;
        this.emVoo = emVoo;
    }
    //encapsulamento
    public void setAltura(float a){
        if(a > 0 && a <=120){
            this.altura = a;
        } else {
            System.out.println("Aviso: altura de "+ a +"m invalida. Limite(0-120m)");
        }
    }
    public void setBateria(int b){
        if(b >= 20 && b <= 100){
            this.bateria = b;
        } else {
            System.out.println("bateria deve estar entre 20-100");
        }
    }
    public float getAltura(){
        return altura;
    }

    //metodo de voo
    public void decolar(){
        if(bateria > 20){
            if(testarMotores()){
                this.emVoo = true;
                setAltura(2);
                System.out.println("Drone" + codigo + " decolou com sucesso!");
            } else {
                System.out.println("falha critica nos motores! abandonar decolagem");
            }
        } else {
            System.out.println("Bateria insuficiente para decolar (Mínimo 20%)");
        }
    }

    private boolean testarMotores(){
        System.out.println("testando hélices...");
        System.out.println("testando GPS...");

        Random random = new Random();
        int resultado = random.nextInt(10);
        return resultado < 8;
    }

    public void subir(float x){
        if(emVoo){
            setAltura(this.altura - x);
        } else {
            System.out.println("o drone ja esta no chao");
        }
    }
}