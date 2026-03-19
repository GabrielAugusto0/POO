public class  Main {
    public static void main(String[] args) {
        System.out.println("--- Teste 1: Criando objeto com dados inválidos ---");
        ArCondicionado meuAr = new ArCondicionado("LG", "Dual Inverter", 22, true);
        System.out.println(meuAr.toString());

        System.out.println("\n--- Teste 2: Corrigindo a Marca e Temperatura ---");
        meuAr.setMarca("Samsung");
        meuAr.setTemperatura(15);
        meuAr.setTemperatura(25);
        System.out.println(meuAr.toString());

        System.out.println("\n--- Teste 3: Ativando o Modo Turbo ---");
        meuAr.ativarModoTurbo();
        System.out.println("Estado Final: " + meuAr.toString());
    }
}