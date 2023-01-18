import java.math.BigDecimal;

public class ContaCorrente implements Conta{
    public String tipoConta;
    @Override
    public void sacar(BigDecimal valor) {

    }
    public ContaCorrente(){
        this.tipoConta = String.valueOf(TiposConta.CONTA_CORRENTE);
    }
}
