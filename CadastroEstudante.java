import java.util.ArrayList;
import java.util.Scanner;

public class CadastroEstudante {
    private ArrayList<Estudante> estudante = new ArrayList<>();

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

        estudante.add(new Estudante(nome, matricula, curso, periodo, idade));
    }

    public void listar() {
        for (Estudante e : estudante) {
            e.toString();
        }
    }
}
