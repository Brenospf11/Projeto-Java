import java.util.Scanner;

public class ContaCorrente extends PessoaFisica {
    Scanner ler = new Scanner(System.in);

    private String operacao = "255";
    private String agencia = "32";
    private double saldo;
    private double contaInvestimento;

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
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

    public double getContaInvestimento() {
        return contaInvestimento;
    }

    public void setContaInvestimento(double contaInvestimento) {
        this.contaInvestimento = contaInvestimento;
    }

    public void calcularSaque(double saque) {
        if(getSaldo() < 0 || saque > getSaldo());
        else
            setSaldo(getSaldo() - saque);
        System.out.println("");
    }

    public double transferencia(double transferencia) {

    }
}
