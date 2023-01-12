import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaInvestimentoPJ extends PessoaJuridica{
    Scanner ler = new Scanner(System.in);
    private int conta = 12;
    private String numConta = "1231";
    private String operacao = "314";
    private String agencia = "32";
    private double saldo = 10000;
    private double contaInvestimento;
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
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
    @Override
    public String toString() {
        return "ContaInvestimentoPJ{" +
                "conta=" + conta +
                ", numConta='" + numConta + '\'' +
                ", operacao='" + operacao + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", contaInvestimento=" + contaInvestimento +
                '}';
    }
    public void imprimirCIPJ(){
        System.out.println(toString());
    }
    public void verSaldo() {
        System.out.println("Seu saldo atual é R$" + getSaldo());
    }
    public void saque(double valor) {
        double valorSaque = valor * 0.05;
        if (getSaldo() < 0 || valor > getSaldo())
            System.out.println("voce nao tem saldo suficiente para relaizazr a operacao");
        else
            setSaldo(getSaldo() - valor - valorSaque);
            double saldoTotal = valor + valorSaque;
            System.out.println("saque realizado no valor de R$" + saldoTotal);
    }
    public void depositar(double depositarValor) {
        setSaldo(depositarValor + getSaldo());
        System.out.println("valor depositado foi R$" + depositarValor);
    }
    public void tranferir(double transferencia) {
        double valorTransferencia = transferencia * 0.05;
        if (getSaldo() < 0 || transferencia > getSaldo())
            System.out.println("voce nao tem saldo suficiente para raealizar a operacao ");
        else
            setSaldo(getSaldo() - transferencia - valorTransferencia);
            System.out.println("Você transferiu R$" + transferencia + " tera que pagar de taxa R$" + valorTransferencia);
    }
    public void investir(double investimento) {
        setSaldo(getSaldo() - investimento);
        double valorInvestimento = investimento * 0.02;
        setContaInvestimento(getContaInvestimento() + investimento + valorInvestimento);
        System.out.println("Você investiu R$" + investimento + " e este investimento irá lhe render R$" +
                valorInvestimento);
    }
    public void operacao() {
        System.out.println("------------");
        System.out.println("Qual operação deseja realizar ?");
        System.out.println("--------------");
        System.out.println("[1] Saque");
        System.out.println("[2] Depositar");
        System.out.println("[3] Transferencia");
        System.out.println("[4] Investimento");
        System.out.println("[5] Ver Saldo");
        System.out.println("[6] Sair");
        System.out.println("----------------");
        System.out.println();
        System.out.println("Escolha sua operação");
        realizar();
    }
    public void realizar() {
        int operacao = ler.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("Saque");
                System.out.println("Digite o valor que deseja sacar");
                double valor = ler.nextDouble();
                saque(valor);
                break;
            case 2:
                System.out.println("Deposito");
                System.out.println("Digite o valor que deseja depositar");
                double depositarValor = ler.nextDouble();
                depositar(depositarValor);
                break;
            case 3:
                System.out.println("Transferencia");
                System.out.println("Digite o valor que deseja tranferir");
                double transferencia = ler.nextDouble();
                tranferir(transferencia);
                break;
            case 4:
                System.out.println("Investir");
                System.out.println("Quando deseja investir");
                double investimento = ler.nextDouble();
                investir(investimento);
                break;
            case 5:
                verSaldo();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Selecione a operacao que tenha");
                operacao();
        }
    }
}
