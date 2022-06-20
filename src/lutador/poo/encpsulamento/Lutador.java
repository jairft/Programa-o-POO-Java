package lutador.poo.encpsulamento;

public class Lutador implements Apresentar{
       private String nome;
       private String nacionalidade;
       private int idade;
       private double altura;
       private double peso;
       private String categoria;
       private int vitorias;
       private int derrotas;
       private int empates;

       private int forca;

       public int getForca() {
              return forca;
       }

       public void setForca(int forca) {
              this.forca = forca;
       }

       public Lutador() {
       }

       public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int forca, int vitorias, int derrotas, int empates) {
              this.setNome(nome);
              this.setNacionalidade(nacionalidade);
              this.setIdade(idade);
              this.setAltura(altura);
              this.setPeso(peso);
              this.setVitorias(vitorias);
              this.setDerrotas(derrotas);
              this.setEmpates(empates);
              this.setForca(forca);
       }
       @Override
       public void apresentar() {
              System.out.println("===================================================");
              System.out.println("CHEGOU A HORA! Apresentamos o Lutador: " + getNome());
              System.out.println("Nacionalidade: " + getNacionalidade());
              System.out.println("Idade " + getIdade() + " anos");
              System.out.println(getAltura() + "m de altura");
              System.out.println("Pesando "+ getPeso() + "Kg");
              System.out.println("Categoria: " + getCategoria());
              System.out.println("Ganhou " + getVitorias());
              System.out.println("Perdeu " + getDerrotas());
              System.out.println("Empatou " + getEmpates());
              System.out.println("===================================================");
       }

       @Override
       public void status() {
              System.out.println("Lutador: " + getNome() + " é um peso " + getCategoria());
              System.out.println("Ganhou " + getVitorias() + " vezes");
              System.out.println("Perdeu " + getDerrotas() + " vezes");
              System.out.println("Empatou " + getEmpates() + " vezes");
       }

       @Override
       public void ganharLuta() {
              setVitorias(getVitorias() + 1);
       }

       @Override
       public void perderLuta() {
              setDerrotas(getDerrotas() + 1);
       }

       @Override
       public void empatarLuta() {
              setEmpates(getEmpates() + 1);
       }

       public String getNome() {
              return nome;
       }

       public void setNome(String nome) {
              this.nome = nome;
       }

       public String getNacionalidade() {
              return nacionalidade;
       }

       public void setNacionalidade(String nacionalidade) {
              this.nacionalidade = nacionalidade;
       }

       public int getIdade() {
              return idade;
       }

       public void setIdade(int idade) {
              this.idade = idade;
       }

       public double getAltura() {
              return altura;
       }

       public void setAltura(double altura) {
              this.altura = altura;
       }

       public double getPeso() {
              return peso;
       }

       public void setPeso(double peso) {
              this.peso = peso;
              setCategoria();
       }

       public String getCategoria() {
              return categoria;
       }

       private void setCategoria() {
              if(getPeso() < 52.2){
                     categoria = "Inválido";
              }else if (getPeso() <= 70.3){
                     categoria = "Leve";
              }else if (getPeso() <= 83.9){
                     categoria = "Médio";
              }else if (getPeso() <= 120.2){
                     categoria = "Pesado";
              }else {
                     categoria = "Inválido";
              }
       }
       public int getVitorias() {
              return vitorias;
       }

       public void setVitorias(int vitorias) {
              this.vitorias = vitorias;
       }

       public int getDerrotas() {
              return derrotas;
       }

       public void setDerrotas(int derrotas) {
              this.derrotas = derrotas;
       }

       public int getEmpates() {
              return empates;
       }

       public void setEmpates(int empates) {
              this.empates = empates;
       }


}
