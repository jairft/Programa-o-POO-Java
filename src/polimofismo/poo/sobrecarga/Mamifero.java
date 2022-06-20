package polimofismo.poo.sobrecarga;


public class Mamifero extends Animal {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

       @Override
    public void emitirSom() {
        System.out.println("Som de mamífero!");
    }
}