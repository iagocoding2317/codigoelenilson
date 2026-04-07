import java.util.ArrayList;
import java.util.Scanner;

public class CadastroEstudante {
    private ArrayList<Estudante> cadastroest = new ArrayList<>();

    public void cadastrar(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        cadastro.add(new Estudante(nome, matricula, curso));
    }

    public void listar() {
        for (Estudante e : cadastro) {
            e.exibir();
        }
    }

    public ArrayList<Estudante> getLista() {
        return lista;
    }
}