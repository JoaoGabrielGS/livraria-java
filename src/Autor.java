import java.time.LocalDate;

public class Autor {
    private int id;
    private String nome;
    private LocalDate dataNacimento;

    public Autor(Integer id, String nome, LocalDate dataNacimento) {
        this.id = id;
        this.nome = nome;
        this.dataNacimento = dataNacimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Data Nascimento: " + dataNacimento;
    }
}
