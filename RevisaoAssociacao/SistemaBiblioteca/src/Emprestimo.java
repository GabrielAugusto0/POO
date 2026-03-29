import java.time.LocalDateTime;

public class Emprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataEntregaPrevista;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataEntregaPrevista, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataEntregaPrevista = dataEntregaPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo +
                ", dataEntregaPrevista=" + dataEntregaPrevista +
                ", leitor=" + leitor.getNome() +
                ", livro=" + livro.getTitulo() +
                '}';
    }
}
