package livro.poo.encapsulamento;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private String leitor;

    public Livro(String titulo, String autor, int totPag, int pagAtual, String leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPag(totPag);
        this.setPagAtual(pagAtual);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    public void detalhes(){
        System.out.println("=== INFORMAÇÕES DO LIVRO ===");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de páginas: " + getTotPag());
        System.out.println("Página atual: " + getPagAtual());
        System.out.println("O livro está aberto: " + isAberto());
        System.out.println("Leitor: " + this.getLeitor());
    }

    @Override
    public void abrir() {
        if(!isAberto()){
            setAberto(true);
            System.out.println("Livro aberto!");
        }else {
            System.out.println("ERRO! Livro já aberto!");
        }
    }

    @Override
    public void fechar() {
        if(isAberto()){
            setAberto(false);
            System.out.println("Livro fechado!");
        }else{
            System.out.println("ERRO! Livro já fechado!");
        }
    }

    @Override
    public void folhear() {
        if(isAberto()){
            System.out.println("Folheando!");
        }else {
            System.out.println("ERRO! Livro está fechado!");
        }
    }

    @Override
    public void avançarPag() {
        if(isAberto()){
            setPagAtual(getPagAtual() + 1);
        }else {
            System.out.println("ERRO! Livro está fechado!");
        }

    }

    @Override
    public void voltarPag() {
        if(isAberto()){
            setPagAtual(getPagAtual() - 1);
        }else {
            System.out.println("ERRO! Livro está fechado!");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }
}
