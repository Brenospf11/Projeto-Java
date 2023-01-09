package caixa;

import impressao.Imprimivel;
import pagamento.Autorizacao;

public class Compra implements Imprimivel, Autorizacao {
    private double valorCompra;
    private String produto;
    private String nomeCliente;

    @Override
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String getCabecalhoNF() {
        return this.getNomeCliente();
    }

    @Override
    public String getCorpoNF() {
        return this.produto + " = " + this.valorCompra;
    }
}
