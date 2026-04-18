import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroEstudante {
    private List<Estudante> estudantes = new ArrayList<>();

    public void cadastrar(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        System.out.print("Periodo: ");
        String periodo = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        estudantes.add(new Estudante(nome, matricula, curso, periodo, idade));
        System.out.println("Estudante cadastrado com sucesso!");
    }

    public void listar() {
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante cadastrado.");
            return;
        }
        System.out.println(" ESTUDANTES");
        for (int i = 0; i < estudantes.size(); i++) {
            System.out.println("[" + i + "] " + estudantes.get(i));
        }
    }

    public List<Estudante> getLista() {
        return estudantes;
    }
}
