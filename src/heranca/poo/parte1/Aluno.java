package heranca.poo.parte1;

public class Aluno extends Pessoa{
    private boolean matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo);
        this.setMatricula(true);
        this.setCurso(curso);
    }


    public void cancelarMatricula(){
        setMatricula(false);
        System.out.println("Matricula cancelada!");
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
