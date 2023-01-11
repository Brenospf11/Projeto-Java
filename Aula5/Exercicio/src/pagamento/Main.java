package pagamento;

import caixa.Checkout;
import caixa.Compra;
import impressao.HP;
import impressao.Impressora;


public class Main {
    public static void main(String[] args){
        Operadora operadora = new Nubank();
        Impressora impressora = new HP();
        Cartao cartao = new Cartao();
        cartao.setNomeDoCliente("Breno");
        cartao.setNumeroCartao("1234.5555.5555.2434");
        Compra compra = new Compra();
        compra.setNomeCliente("Breno");
        compra.setProduto("Miniatura do Messi");
        compra.setValorCompra(499);

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }
}