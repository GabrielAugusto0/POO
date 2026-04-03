public class TesteVeiculo {
    public static void main(String[] args){
        Veiculo v = new Aviao("Boeing","554",900, 12000);
        System.out.println("===AVIÃO===");
        v.mover();
        v.abastecer();

        System.out.println();

        Veiculo c = new CarroEletrico("BYD","MODEL 3", 250f, 500);
        System.out.println("===CARRO ELETRICO ===");
        c.mover();
        c.abastecer();
    }
}