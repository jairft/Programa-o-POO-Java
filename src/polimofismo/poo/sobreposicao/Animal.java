package polimofismo.poo.sobreposicao;

public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int membros;

    protected abstract void locomover();

    protected abstract void alimentar();

    protected abstract void emitirSom();

}
