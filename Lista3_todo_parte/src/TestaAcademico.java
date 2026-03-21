public class TestaAcademico {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Maria Silva", "12345", "Engenharia de Software");
        Aluno aluno2 = new Aluno(2, "João Santos", "67890", "Ciência da Computação");

        Disciplina poo = new Disciplina(101, "Programação Orientada a Objetos", "Dr. Carlos");

        poo.matricularAluno(aluno1);
        poo.matricularAluno(aluno2);

        Avaliacao provaSemestral = poo.criarAvaliacao(1, "Prova Semestral");


        provaSemestral.adicionarQuestao(1, "Explique os pilares da POO.", 3.0f);
        provaSemestral.adicionarQuestao(2, "Diferencie agregação de composição.", 4.0f);
        provaSemestral.adicionarQuestao(3, "Implemente um método toString() para a classe Aluno.", 3.0f);

        System.out.println(poo.toString());
    }
}