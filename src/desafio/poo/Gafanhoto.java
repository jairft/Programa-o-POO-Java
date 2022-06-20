package desafio.poo;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totalAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public void viuMaisUm(){
        setTotalAssistido(getTotalAssistido() + 1);
    }

    @Override
    public void ganharExperiencia() {
        setExperiencia(getExperiencia() + 1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +super.toString()+
                "\nlogin='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                '}';
    }
}
