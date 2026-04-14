import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDisciplina {
    private ArrayList<Disciplina> disciplina = new ArrayList<>();

    public void cadastrarDisciplina(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Professor: ");
        String professor = sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        System.out.print("Periodo: ");
        String periodo = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        estudante.add(new Estudante(nome, professor, curso, periodo, idade));
    }

    public void listar() {
        for (Estudante e : estudante) {
            e.toString();
        }
    }
}
// Altere isso aqui de acordo com o codigo Disciplina
