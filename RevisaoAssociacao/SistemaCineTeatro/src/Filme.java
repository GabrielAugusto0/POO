public class Filme {
    private int id;
    private int duracao;
    private String titulo;
    private String genero;

    public Filme(int id, int duracao, String titulo, String genero) {
        this.id = id;
        this.duracao = duracao;
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", duracao=" + duracao +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}