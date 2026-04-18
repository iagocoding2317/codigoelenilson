import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDisciplina {
    private List<Disciplina> disciplinas = new ArrayList<>();

    public void cadastrarDisciplina(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Professor: ");
        String professor = sc.nextLine();

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Turno: ");
        String turno = sc.nextLine();

        disciplinas.add(new Disciplina(nome, professor, codigo, turno));
    }

    public void listar() {
        for (Disciplina d : disciplinas) {
            System.out.println(d);
        }
    }

    public List<Disciplina> getLista() {
        return disciplinas;
    }
}
