package polimofismo.poo.sobrecarga;

public class Principal {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5);
        c.reagir(15, 4.6);
    }
}
