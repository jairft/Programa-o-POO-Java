package desafio.poo;

public class Principal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de Java");
        v[1] = new Video("Desenvolvimento Android");
        v[2] = new Video("Aula de HML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jair", 28, 'M', "122345");

        Visualizacao vv = new Visualizacao(g[0], v[1]);
        vv.avaliar(87.0);
        System.out.println(vv.toString());
    }
}
