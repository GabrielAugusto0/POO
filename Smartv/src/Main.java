//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Smartv {
    private String marca, modelo;
    private int volume;
    private boolean internet;
    public Smartv();

    public Smartv(String marca, String modelo, int volume, boolean internet) {
        this.setmarca(marca);
        this.setmodelo(modelo);
        this.setvolume(volume);
        this.internet = internet;
    }
    
    public void setvolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
    }

    public int setVolume(){
        return this.volume;
    }
    public void  setmarca(String marca) {
        if (marca.length() <= 30) {
            this.marca = marca;
        } else System.out.println("marca invalida");
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo) {
        char letraInicial = modelo.charAt(0);
        boolean resp = Character.isUpperCase(letraInicial);
        if(resp){
            this.modelo = modelo;
        } else System.out.println("Modelo Invalido ");
    }

    public String getModelo(){
        return this.modelo;
    }
    public void aumentarVolume(int x){
        this.setvolume(this.volume + x);
    }
    public void diminuirVolume(int x){
        this.setvolume(this.volume -x);
    }

    private boolean conectarInternet(){
        System.out.println("verificando conecxoes disponiveis");
        System.out.println("consultando as credenciais ");
        int randomic = (int) (Math.random() * 10);
        if(randomic)
    }
}