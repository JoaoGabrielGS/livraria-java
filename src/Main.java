import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.popularBiblioteca();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.println("--- MENU PRINCIPAL ---");
            System.out.println("1.: Listar livros\n2.: Emprestar\n3.: Cadastrar Livro\n4.: Cadastrar Autor\n5.: Listar Autores.\n6.: Encerrar");
            int opt = scanner.nextInt();

            if (opt == 6) {
                System.out.println("Obrigado por usar a biblioteca! Tchau!");
                break;
            }

            switch (opt) {
                case 1:
                    biblioteca.listarLivros();
                    break;
                case 2:
                    biblioteca.listarLivrosDisponiveis();
                    System.out.println("\nO que deseja fazer agora?");
                    System.out.println("1.: Emprestar um livro.\n2.: Voltar ao Menu Principal.\n3.: Sair do Programa.");
                    int subOpt = scanner.nextInt();

                    if (subOpt == 1) {
                        System.out.println("Digite o ID do livro que deseja:");
                        int idEscolhido = scanner.nextInt();
                        System.out.println("Digite seu nome:");
                        String nome = scanner.next();

                        biblioteca.realizarEmprestimo(idEscolhido, nome);
                    } else if (subOpt == 3) {
                        System.out.println("Encerrando...");
                        System.exit(0);
                    }
                    break;
                case 3:
                    System.out.println("--- CADASTRAR NOVO LIVRO ---");
                    System.out.println("1.: Escolha um autor existente para o livro");
                    System.out.println("3.: Voltar ao menu");
                    int createBookOpt = scanner.nextInt();

                    if (createBookOpt == 1) {
                        biblioteca.listarAutores();
                    }
                    break;
                case 4:
                    System.out.println("--- CADASTRAR NOVO AUTOR ---");
                    System.out.println("Escreva o nome do autor:");
                    String nomeAutor = scanner.next();
                    System.out.println("Escreva a data de nascimento do autor no formato AAAA-MM-DD");
                    String nascimento = scanner.next();

                    biblioteca.criarAutor(nomeAutor, nascimento);
                case 5:
                    biblioteca.listarAutores();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}