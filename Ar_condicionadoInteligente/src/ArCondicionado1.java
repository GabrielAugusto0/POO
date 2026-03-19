public class ArCondicionado1 {
    //atributos
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    //contruturo vazio
    public ArCondicionado1(){

    }

    //construtor com parametros
    public ArCondicionado1(String marca,String modelo,int temperatura,boolean ligado){
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }

    //encapsulamento com regra
    public void setTemperatura(int t){
        if(t >= 16 && t <= 30){
            this.temperatura = t;
        } else {
            System.out.println("temperatura fora da faixa(16c a 30c");
        }
    }
    public void setMarca(String m){
        if(m!= null && m.length() >=3){
            this.marca = m;
        } else {
            System.out.println("marca invalida! deve conter pelo menos 3 caracteres");
        }
    }
    //getters
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public int getTemperatura() {return temperatura;}
    public boolean isLigado() {return ligado;}

    //ativar modoTurbo
    public void ativarModoTurbo(){
        if(verificarCompressor()){
            System.out.println("compressor Ok! ativar modo turbo...");
            setTemperatura(16);
        } else {
            System.out.print("falha tecnica! o compressor não respode!");
        }
    }
    //privado: verificar compressor
    private boolean verificarCompressor(){
        double checagem = Math.random() * 10;
        return checagem> 2;
    }
    //toString
    public String toString(){
        return "Ar-condicionado [" +
                " marca:" + marca +
                " modelo: " + modelo +
                " temperatura: " + temperatura +
                " ligado:" + (ligado? "sim":"nao")+
                " ]";
    }
}
