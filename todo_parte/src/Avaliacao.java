import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questoes> questoes;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
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

    public ArrayList<Questoes> getQuestoes() {
        return questoes;
    }

    public void adicionarQuestao(int num, String enunciado, float valor) {
        this.questoes.add(new Questoes(num, enunciado, valor));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Avaliacao{")
                .append("id=").append(id)
                .append(", nome=\"").append(nome).append("\"")
                .append(", questoes=").append("\n");
        for (Questoes q : questoes) {
            sb.append("    ").append(q.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}