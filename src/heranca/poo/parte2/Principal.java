package heranca.poo.parte2;

public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Jair Freitas");
        a1.setIdade(28);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("João Guilherme");
        b1.setIdade(25);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
