import java.util.Scanner;

public class Menu {

    private CadastroEstudante cadastroEstudante;
    private CadastroDisciplina cadastroDisciplina;

    public Menu(CadastroEstudante ce, CadastroDisciplina cd) {
        cadastroEstudante = ce;
        cadastroDisciplina = cd;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = sc.nextInt();
            sc.nextLine();
            processarOpcao(opcao, sc);
        } while (opcao != 0);

        sc.close();
    }

    private void exibirMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Cadastrar Estudante");
        System.out.println("2 - Listar Estudantes");
        System.out.println("3 - Cadastrar Disciplina");
        System.out.println("4 - Listar Disciplinas");
        System.out.println("5 - Inserir Estudante em Disciplina");
        System.out.println("0 - Sair");
    }

    private void processarOpcao(int opcao, Scanner sc) {
        switch (opcao) {
        case 1:
            cadastroEstudante.cadastrar(sc);
            break;
        case 2:
            cadastroEstudante.listar();
            break;
        case 3:
            cadastroDisciplina.cadastrar(sc);
            break;
        case 4:
            cadastroDisciplina.listar();
            break;
        case 5:
            inserirAluno(sc);
            break;
        case 0:
            System.out.println("Encerrando...");
            break;
        default:
            System.out.println("Opção inválida.");
        }
    }

    private void inserirAluno(Scanner sc) {
        cadastroEstudante.listar();
        System.out.print("Escolha o índice do estudante: ");
        int i = sc.nextInt();

        cadastroDisciplina.listar();
        System.out.print("Escolha o índice da disciplina: ");
        int j = sc.nextInt();

        Estudante estudante = cadastroEstudante.getLista().get(i);
        Disciplina disciplina = cadastroDisciplina.getLista().get(j);
        disciplina.inserirEstudante(estudante);
    }
}