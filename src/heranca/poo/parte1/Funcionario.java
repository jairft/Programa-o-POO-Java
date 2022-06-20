package heranca.poo.parte1;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor) {
        super(nome, idade, sexo);
        setSetor(setor);
        setTrabalhando(true);
    }


    public void mudarTrabalho(String novoSetor){
        setSetor(novoSetor);
        System.out.println("===========================================");
        System.out.println("A funcionária " + getNome() + " mudou de função!");
        System.out.println("Novo cargo: " + getSetor());
        System.out.println("===========================================");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
