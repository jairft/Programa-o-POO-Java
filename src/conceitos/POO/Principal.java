package conceitos.POO;

public class Principal {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco(0, false);
        conta1.abrirConta("CP");
        conta1.setNome("Jair Freitas");
        conta1.setNumero("38.183-7");
        conta1.setAgencia("0121-0");
        conta1.setTipo("Conta Poupança");
        conta1.depositar(1000);
        conta1.sacar(500);
        conta1.statusConta();

        ContaBanco conta2 = new ContaBanco(0, false);
        conta2.abrirConta("CC");
        conta2.setNome("Nicodemos Freitas");
        conta2.setNumero("45.198-7");
        conta2.setAgencia("0121-0");
        conta2.setTipo("Conta Correte");
        conta2.depositar(1300.50);
        conta2.sacar(505);

        conta2.statusConta();

    }
}
