public class Main {
    public static void main(String[] args) {

        System.out.println("--- Teste 1: Tentativa de decolagem com bateria baixa ---");
        Drone meuDrone = new Drone("SkyMaster-X1", 0, 15, false);
        meuDrone.decolar();

        System.out.println("\n--- Teste 2: Recarregando e Testando Motores ---");
        meuDrone.setBateria(100);

        meuDrone.decolar();

        System.out.println("\n--- Teste 3: Movimentação e Limites de Segurança ---");
        System.out.println("Tentando subir 150 metros...");
        meuDrone.subir(150);

        System.out.println("Altura atual: " + meuDrone.getAltura() + "m");

        System.out.println("\nTentando descer 10 metros...");
        meuDrone.subir(10);

        System.out.println("Estado Final da Altura: " + meuDrone.getAltura() + "m");
    }
}