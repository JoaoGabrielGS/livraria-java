import java.time.LocalDate;

public class Livro {
    protected final int id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private final LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(int id, String titulo, Autor autor, boolean disponivel, LocalDate dataCadastro) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public int getId() {
        return id;
    }

    public void marcarComoEmprestado() {
        this.disponivel = false;
        this.dataAtualizacao = LocalDate.now();
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Título: " + titulo + " | Autor: " + autor.getNome() + " | Está disponível? " + disponivel;
    }
}
