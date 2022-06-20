package heranca.poo.parte1;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        setEspecialidade(especialidade);
        setSalario(salario);
    }

    public void receberAumento( double aumento){
        setSalario(getSalario() + aumento);
        System.out.println("===========================================");
        System.out.println("Aumento de R$"+ aumento + " concedido para "+ getNome());
        System.out.println("Antigo salário: "+ (getSalario() - aumento));
        System.out.println("Novo salário: " + getSalario());
        System.out.println("===========================================");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor " +
                "especialidade '" + especialidade + '\'' +
                ",\n salario: " + salario +'}';
    }
}
