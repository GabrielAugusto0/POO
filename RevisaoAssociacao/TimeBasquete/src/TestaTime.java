public class TestaTime {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta(1,"Lucas Dias", "Ala");
        Atleta atleta2 = new Atleta(2,"Bennett","Armador");

        Time franca = new Time(1,"Franca Basquete","Helinho");
        franca.contratarAtleta(atleta1);
        franca.contratarAtleta(atleta2);

        System.out.println(franca);

        franca = null;
        System.out.println("Time anulado. Atleta ainda existe"+ atleta1);
    }
}
