import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String professor;
    private int codigo;
    private String turno;
    ArrayList<Estudante> estudantes;

    public Disciplina(String nome, String professor, int codigo, String turno, Estudante estudantes) {
        this.nome = nome;
        this.professor = professor;
        this.codigo = codigo;
        this.turno = turno;
        this.estudantes = new ArrayList<>();
    }

    public void inserirEstudante(Estudante e) {
        estudantes.add(e);
    }

    public void listarAlunos() {
        System.out.println("Alunos da disciplina " + nome + ":");
        for (Estudante e : estudantes) {
            estudantes.exibir();
        }
    }

    public void exibir() {
        System.out.println("Disciplina: " + nome + " | Professor: " + professor + " | Código: " + codigo + " | Turno: " + turno + "Estudantes: " + estudantes);
    }
}
