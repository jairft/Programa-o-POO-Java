package polimofismo.poo.sobreposicao;

public class Principal {
    public static void main(String[] args) {

        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();

        m1.alimentar();
        r1.alimentar();
        p1.alimentar();
        a1.alimentar();

    }
}
