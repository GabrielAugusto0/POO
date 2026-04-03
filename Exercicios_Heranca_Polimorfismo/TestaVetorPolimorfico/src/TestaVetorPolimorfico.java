public class TestaVetorPolimorfico {

    public static void main(String[] args) {
        Desenvolvedor[] equipe = new Desenvolvedor[4];

        equipe[0] = new Junior("Beltrano", "Fulano", "Java", 4500f);
        equipe[1] = new Pleno("Beltrano", "Java", 6000f, 3);
        equipe[2] = new Senior("Ciclano", "Java", 9000f, 1500f);
        equipe[3] = new Desenvolvedor("Freelancer", "Python", 3000f);

        System.out.println("======= FOLHA DE PAGAMENTO =======\n");

        for (Desenvolvedor dev : equipe) {
            dev.codar();
            System.out.println("Bônus: R$" + dev.calcularBonus());
            System.out.println(dev.toString());
            System.out.println("----------------------------------");
        }
    }
}
