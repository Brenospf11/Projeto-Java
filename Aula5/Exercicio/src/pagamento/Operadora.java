package pagamento;

public interface Operadora {
    public boolean autorizar (Autorizacao autorizacao, Cartao cartao);
}
