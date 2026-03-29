import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadors = new ArrayList<>();

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
    }

    public void adicionarProgramador(Programador p){
        programadors.add(p);
    }

    public void listaProgramadores(){
        System.out.println("Programadores no projeto"+ nomeProjeto + ":");
        for(Programador p : programadors){
            System.out.println("  -  "+ p);
        }
    }
}
