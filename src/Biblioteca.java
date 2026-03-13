import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();


    public void popularBiblioteca() {
        Autor primeiroAutor = new Autor(1, "Leonardo", LocalDate.of(1974, 6, 23));
        Autor segundoAutor = new Autor(2, "Marcos", LocalDate.of(1985, 4, 12));
        Autor terceiroAutor = new Autor(3, "Livia", LocalDate.of(1993, 1, 22));

        Livro primeiroLivro = new Livro(1, "Primeiro Livro", primeiroAutor, true, LocalDate.now());
        Livro segundoLivro = new Livro(2, "Segundo Livro", segundoAutor, false, LocalDate.now());
        Livro terceiroLivro = new Livro(3, "Terceiro Livro", terceiroAutor, true, LocalDate.now());

        autores.add(primeiroAutor);
        autores.add(segundoAutor);
        autores.add(terceiroAutor);

        livros.add(primeiroLivro);
        livros.add(segundoLivro);
        livros.add(terceiroLivro);
    }

    public void listarLivros() {
        System.out.println("----- LISTA DE LIVROS CADASTRADOS -----");
        for (Livro livro : livros) {
            System.out.println(livro);
        }

    }

    public void listarAutores() {
        System.out.println("--- LISTA DE AUTORES CADASTRADOS ---");
        for (Autor autor: autores) {
            System.out.println(autor);
        }
    }

    public void listarLivrosDisponiveis() {
        System.out.println("----- LISTA DE LIVROS DISPONIVEIS PARA EMPRESTIMO -----");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void realizarEmprestimo(int idLivro, String nomeCliente) {
        for (Livro livro : livros) {
            if (livro.getId() == idLivro) {
                if (livro.isDisponivel()) {
                    livro.marcarComoEmprestado();

                    Emprestimo novoEmprestimo = new Emprestimo(emprestimos.size() + 1, livro, nomeCliente, LocalDate.now());
                    emprestimos.add(novoEmprestimo);

                    System.out.println("Empréstimo realizado com sucesso!");
                    return;
                } else {
                    System.out.println("Este livro já está emprestado.");
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado. Digite o ID válido!");
    }

    public int nextAutorId() {
        return autores.size() + 1;
    }

    public void criarAutor(String nome, String dataNascimento) {
        Autor autor = new Autor(nextAutorId(), nome, LocalDate.parse(dataNascimento));

        autores.add(autor);
    }
}
