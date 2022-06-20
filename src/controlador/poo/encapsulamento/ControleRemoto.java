package controlador.poo.encapsulamento;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desigar() {
        if(getLigado()){
            setLigado(false);
        }else {
            System.out.println("Ligue a TV para poder desligar!");
        }

    }

    @Override
    public void abrirMenu() {
        System.out.println("=== MENU DE OPÇÕES ===");
        System.out.print("Volume: ");
        for (int i = 0; i <= getVolume(); i+=5) {
            System.out.print("|");
        }

        System.out.println();
        System.out.println("Está tocando? "+ getTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu de Opções fechado!");
    }

    @Override
    public void maisVolume() {
        if(getLigado()){
            setVolume(getVolume() + 5);
        } else {
            System.out.println("Impossivel aumentar o volume com a TV desligada!");
        }

    }

    @Override
    public void menosVolume() {
        if(getLigado()){
            setVolume(getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir o volume com a TV desligada!");
        }
    }

    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume() > 0){
            setVolume(0);
        }

    }
    @Override
    public void desligarMudo() {
        if(getLigado() && getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(getLigado() && !getTocando()){
            setTocando(true);
        }

    }
    @Override
    public void pause() {
        if(getLigado() && getTocando()){
            setTocando(false);
        }
    }
}
