package heranca.poo.parte1;

public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("jair freitas", 28, "M", "Computação");
        Professor p1 = new Professor("Guanabara", 41, "M","Informatica",3500);
        Funcionario f1 = new Funcionario("Verônica", 36, "F", "Secretária");

        a1.fazerAniversario();
        System.out.println(a1.getIdade());

        p1.receberAumento(350);

        f1.mudarTrabalho("Diretora");


        System.out.println(p1.toString());


    }
}
