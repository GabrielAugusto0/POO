import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    // Agregação
    public void matricularAluno(Aluno a) {
        this.alunos.add(a);
    }

    // Composição
    public Avaliacao criarAvaliacao(int id, String nome) {
        Avaliacao novaAvaliacao = new Avaliacao(id, nome);
        this.avaliacoes.add(novaAvaliacao);
        return novaAvaliacao; // Retorna a avaliação para permitir a composição aninhada
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disciplina{")
                .append("id=").append(id)
                .append(", nome=\"").append(nome).append("\"")
                .append(", professor=\"").append(professor).append("\"")
                .append(", alunos=").append("\n");
        for (Aluno a : alunos) {
            sb.append("    ").append(a.toString());
        }
        sb.append(", avaliacoes=").append("\n");
        for (Avaliacao av : avaliacoes) {
            sb.append("    ").append(av.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}