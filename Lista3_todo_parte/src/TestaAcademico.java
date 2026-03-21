public class TestaAcademico {
    public static void main(String[] args) {
        // 1. Instancie 2 objetos Aluno (eles devem ser independentes).
        Aluno aluno1 = new Aluno(1, "Maria Silva", "12345", "Engenharia de Software");
        Aluno aluno2 = new Aluno(2, "João Santos", "67890", "Ciência da Computação");

        // 2. Instancie um objeto Disciplina (ex: "Programação Orientada a Objetos").
        Disciplina poo = new Disciplina(101, "Programação Orientada a Objetos", "Dr. Carlos");

        // 3. Agregação: Matricule os alunos criados na disciplina.
        poo.matricularAluno(aluno1);
        poo.matricularAluno(aluno2);

        // 4. Composição: Crie uma avaliação chamada "Prova Semestral" dentro da disciplina.
        Avaliacao provaSemestral = poo.criarAvaliacao(1, "Prova Semestral");

        // 5. Composição aninhada: Dentro da avaliação criada, adicione 3 questões usando o método específico.
        provaSemestral.adicionarQuestao(1, "Explique os pilares da POO.", 3.0f);
        provaSemestral.adicionarQuestao(2, "Diferencie agregação de composição.", 4.0f);
        provaSemestral.adicionarQuestao(3, "Implemente um método toString() para a classe Aluno.", 3.0f);

        // 6. Imprima o toString() da disciplina para visualizar toda a árvore de objetos.
        System.out.println(poo.toString());
    }
}