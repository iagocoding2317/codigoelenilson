public class Principal {
    public static void main(String[] args) {
        CadastroEstudante ce = new CadastroEstudante();
        CadastroDisciplina cd = new CadastroDisciplina();
        Menu menu = new Menu(ce, cd);
        menu.iniciar();
    }
}
