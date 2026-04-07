public class Estudante {
    private String nome;
    private String matricula;
    private String curso;
    private String periodo;
    private Disciplina disciplina;

    public Estudante(String nome, String matricula, String curso, String periodo, Disciplina disciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.disciplina = disciplina;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + " Matrícula: " + matricula + " Curso: " + curso + "Período: " + periodo + "Disciplina: " + disciplina);
    }
}