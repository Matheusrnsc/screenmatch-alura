package br.com.alura.cartaoDeCredito;

public class CalculoCartao {
    private double limite ;
    private double valor;

    private String descricao;

    /*public CalculoCartao(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }*/


    // GETTERS -----------------------------------------------------
    public double getLimite() {
        return limite;}

    public double getValor() {
        return valor;}

    public String getDescricao() {
        return descricao;
    }

    // SETTERS ------------------------------------------------------
    public void setLimite(double limite) {
        this.limite = limite;}
    public void setDescricao(String descricao){
        this.descricao = descricao;}
    public void setValor(double valor){
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  this.descricao + " Valor: R$" + this.valor + "\n";
    }
}
