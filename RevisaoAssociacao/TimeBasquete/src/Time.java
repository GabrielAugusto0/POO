import java.util.ArrayList;

public class Time {
    private int id;
    private String nome;
    private String tecnico;
    private ArrayList<Atleta> atletas = new ArrayList<>();

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
    }
    public void contratarAtleta(Atleta a){
        atletas.add(a);
        System.out.println(a.getNome()+ "contratado para o time" + nome);
    }

    @Override
    public String toString() {
        return "Time{" +
                ", nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", atletas=" + atletas +
                '}';
    }
}
