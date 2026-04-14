import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String professor;
    private String curso;
    private String periodo;
    private ArrayList<Estudante> estudantes;

    public Disciplina(String nome, String professor, String curso, String periodo){
        this.nome = nome;
        this.professor = professor;
        this.curso = curso;
        this.periodo = periodo;
        this.estudantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public String getCurso() {
        return curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + " Professor: " + professor + " Curso: " + curso + " Período: " + periodo + "Estudantes: " + estudantes);
    }
}
