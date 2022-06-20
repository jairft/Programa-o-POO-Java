package livro.poo.encapsulamento;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jair Freitas", 28, "M");
        Livro l1 = new Livro("Java: como programar", "P.J. Deitel", 285, 3, p1.getNome());

        l1.abrir();
        l1.folhear();
        l1.avançarPag();


        l1.detalhes();

    }
}
