package conceitos.POO;

import java.util.Objects;

public class ContaBanco {
    private String nome;
    private String numero;
    private String agencia;
    private double saldo;
    private String tipo;
    private boolean situacaoConta;

    public ContaBanco(double saldo, boolean situacaoConta) {
        this.saldo = 0;
        this.situacaoConta = false;
    }

    public void statusConta(){
        System.out.println("---------------- INFORMAÇÕES DA CONTA ------------------");
        System.out.println("Nome Titular: " + getNome());
        System.out.println("Conta: " + getNumero());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Tipo: " + getTipo());
        if(isSituacaoConta()){
            System.out.println("status da conta: ABERTA");
        }else {
            System.out.println("status da conta: FECHADA");
        }
        System.out.println("--------------------------------------------------------");
    }

    public void depositar(double valor){
        if(isSituacaoConta()){
            System.out.println("Deposito no valor de R$" + valor +" realizado na conta de " + getNome());
            setSaldo(getSaldo() + valor);
        }else {
            System.out.println("Conta inexistente");
        }

    }
    public void sacar(double valor){
        if(valor <= saldo && isSituacaoConta()){
            System.out.println("Saque no valor de R$" + valor + " realizado na conta de " + getNome());
            setSaldo(getSaldo() - valor);
        }else {
            System.out.println("saldo insuficinte ou conta inexistente!");
        }
    }

    public  void abrirConta(String tipo){
        setTipo(tipo);
        setSituacaoConta(true);
        if(Objects.equals(tipo, "CC")){
            setSaldo(50);
        } else {
            setSaldo(150);
        }
    }
    public void fecharConta(){
        if(saldo == 0){
            System.out.println("Conta encerrada com sucesso!");
            setSituacaoConta(false);
        }else {
            System.out.println("Conta com saldo positivo ou negativo, impossivel fechar!");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isSituacaoConta() {
        return situacaoConta;
    }

    public void setSituacaoConta(boolean situacaoConta) {
        this.situacaoConta = situacaoConta;
    }
}
