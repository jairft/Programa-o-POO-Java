package heranca.poo.parte2;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno "+getNome());
    }

    public int isMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
