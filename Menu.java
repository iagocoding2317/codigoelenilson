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
        } while (opcao != 5);

        sc.close();
    }

    private void exibirMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Cadastrar Estudante");
        System.out.println("2 - Cadastrar Disciplina");
        System.out.println("3 - Inserir Estudante em Disciplina");
        System.out.println("4 - Listar Tudo" );
        System.out.println("5 - Sair");
    }

    private void processarOpcao(int opcao, Scanner sc) {
        switch (opcao) {
        case 1:
            cadastroEstudante.cadastrar(sc);
            break;
        case 2:
            cadastroDisciplina.cadastrarDisciplina(sc);
            break;
        case 3:
            inserirAluno(sc);
            break;
        case 4:
            cadastroDisciplina.listar();
            cadastroEstudante.listar();
            break;
        case 5:
            System.out.println("Encerrando...");
            break;
        default:
            System.out.println("Opção inválida.");
        }
    }

    private void inserirAluno(Scanner sc) {
    if (cadastroEstudante.getLista().isEmpty() || cadastroDisciplina.getLista().isEmpty()) {
        System.out.println("Cadastre ao menos um estudante e uma disciplina antes.");
        return;
    }

        cadastroEstudante.listar();
        System.out.print("Escolha o índice do estudante: ");
        int i = sc.nextInt();

        cadastroDisciplina.listar();
        System.out.print("Escolha o índice da disciplina: ");
        int j = sc.nextInt();

        if (i < 0 || i >= cadastroEstudante.getLista().size() || j < 0 || j >= cadastroDisciplina.getLista().size()) {
            System.out.println("Índice inválido.");
            return;
        }

        Estudante estudante = cadastroEstudante.getLista().get(i);
        Disciplina disciplina = cadastroDisciplina.getLista().get(j);
        disciplina.inserirEstudante(estudante);
        System.out.println("Estudante: " + estudante.getNome() + "inserido em/na disciplina: " + disciplina.getNome());
    }
}
