package lutador.poo.encpsulamento;

public class Principal {
    public static void main(String[] args) {
        Lutador l1 = new Lutador("Pretty Boy","França", 31,
                1.75, 68.9, 8, 11, 4, 5);
        Lutador l2 = new Lutador("Putscript","Brasil", 29,
                1.68, 57.8, 10, 15, 5, 3);
        Lutador l3 = new Lutador("Snapshadow","EUA", 35,
                1.65, 80.9, 9, 13, 6, 4);
        Lutador l4 = new Lutador("Dead Code","Autrália", 28,
                1.93, 81.6, 8, 10, 7, 5);
        Lutador l5 = new Lutador("Ufocobol","Brasil", 37,
                1.70, 119.3, 9, 9, 2, 3);
        Lutador l6 = new Lutador("Nerdaard","EUA", 30,
                1.81, 105.7, 8, 14, 3, 6);




        Luta luta1 = new Luta(l5, l6);
        luta1.marcarLuta();
        luta1.lutar(l5.getForca(), l6.getForca());
    }
}
