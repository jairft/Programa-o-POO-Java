package lutador.poo.encpsulamento;

import java.util.Objects;
import java.util.Random;

public class Luta extends Lutador{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    private int forca;
    public Luta(Lutador desafiante, Lutador desafiado) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.setAprovada(false);
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    public void marcarLuta(){
        setAprovada(true);
    }

    public void lutar(int l1, int l2){

        if(!Objects.equals(desafiante.getNome(), desafiado.getNome()) &&
                Objects.equals(desafiante.getCategoria(), desafiado.getCategoria())){
            if(isAprovada()){
                desafiante.apresentar();
                desafiado.apresentar();
                Random numAleatorio = new Random();
                l1 = numAleatorio.nextInt(l1) + 1;
                l2 = numAleatorio.nextInt(l2) + 1;
                System.out.println("-----------------------------------");
                if(l1 > l2){
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    System.out.println("O LUTADOR " + desafiante.getNome()+ " VENCEU A LUTA!");
                    System.out.println("-----------------------------------");
                }else if (l2 > l1){
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    System.out.println("O LUTADOR " + desafiado.getNome()+ " VENCEU A LUTA!");
                    System.out.println("-----------------------------------");
                } else {
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    System.out.println("LUTA EMPATADA!");
                    System.out.println("-------------------------------");
                }

            }else {
                System.out.println("ESSA LUTA NÃO ESTÁ APROVADA!");
            }
        }else {
            System.out.println("IMPOSSÍVEL REALIZAR A LUTA COM OS MESMOS LUTADORES OU LUTADORES DE CATEGORIAS DIFERENTES!");
        }
    }

}
