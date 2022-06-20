package heranca.poo.parte2;

public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa(){

    }
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do bolsista " + getNome());
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
