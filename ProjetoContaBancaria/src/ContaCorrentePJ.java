import java.util.Scanner;

public class ContaCorrentePJ extends PessoaJuridica {
    Scanner ler = new Scanner(System.in);
    private int conta = 12;
    private String numConta = "1231";
    private String operacao = "314";
    private String agencia = "32";
    private double saldo = 10000;

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

    @Override
    public String toString() {
        return " Conta Corrente PJ { " +
                "Conta=" + conta +
                ", Numero da Conta ='" + numConta + '\'' +
                ", Operacao ='" + operacao + '\'' +
                ", Agencia ='" + agencia + '\'' +
                ", Saldo =" + saldo +
                " }";
    }

    public void imprimirCCPJ() {
        System.out.println(toString());
    }

    public void verSaldo() {
        System.out.println("Seu saldo ayual é: " + getSaldo());
    }

    public void saque(double saqueValor) {
        if (getSaldo() < 0 || saqueValor > getSaldo())
            System.out.println("Você não tem saldo suficiente para raealizar a operação.");
        else
            setSaldo(getSaldo() - saqueValor);
        System.out.println("Saque realizado no valor de R$" + saqueValor);
    }

    public void depositar(double depositarValor) {
        setSaldo(depositarValor + getSaldo());
        System.out.println("O valor depositado foi R$" + depositarValor);
    }

    public void tranferir(double tranferencia) {
        if (getSaldo() < 0 || tranferencia > getSaldo())
            System.out.println("Você não tem saldo suficiente para raealizar a operação.");
        else
            setSaldo(getSaldo() - tranferencia);
        System.out.println("Você transferiu R$" + tranferencia);
    }

    public void operacao() {
        System.out.println("------------");
        System.out.println("Qual operação você deseja realizar?");
        System.out.println("-------------");
        System.out.println("[1] saque");
        System.out.println("[2] Deposito");
        System.out.println("[3] Transferencia");
        System.out.println("[4] Ver saldo");
        System.out.println("[5] sair");
        System.out.println("-------------");
        System.out.println();
        System.out.println("\nEscolha a operação desejada:");
        realizar();
    }

    public void realizar() {
        int operacao = ler.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("Saque");
                System.out.println("Insira o valor que deseja sacar");
                double saqueValor = ler.nextDouble();
                saque(saqueValor);
                break;
            case 2:
                System.out.println("Deposito");
                System.out.println("Insira o valor que deseja depositar");
                double depositarValor = ler.nextDouble();
                depositar(depositarValor);
                break;
            case 3:
                System.out.println("Transferencia");
                System.out.println("Insira o valor que deseja tranferir");
                double transferencia = ler.nextDouble();
                tranferir(transferencia);
                break;
            case 4:
                verSaldo();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("\\nSELECIONE UMA OPÇÃO VALIDA!!!");
                operacao();
        }
    }
}
