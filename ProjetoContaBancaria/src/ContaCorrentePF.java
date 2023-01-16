import java.util.Scanner;

public class ContaCorrentePF extends PessoaFisica {
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
        return " Conta Corrente PF { " +
                "Conta =" + conta +
                ", Numero Conta ='" + numConta + '\'' +
                ", Operacao ='" + operacao + '\'' +
                ", Agencia ='" + agencia + '\'' +
                ", Saldo =" + saldo +
                " }";
    }

    public void verSaldo() {
        System.out.println("Seu saldo atual é: " + getSaldo());
    }

    public void saque(double saqueValor) {
        if (getSaldo() < 0 || saqueValor > getSaldo())
            System.out.println("\nVoce nao tem saldo suficiente para realizar a operacao.");
        else
            setSaldo(getSaldo() - saqueValor);
            System.out.println("\nSaque realizado no valor de R$" + saqueValor);
    }

    public void depositar(double depositarValor) {
        setSaldo(depositarValor + getSaldo());
        System.out.println("\nO valor depositado foi R$" + depositarValor);
    }

    public void tranferir(double tranferencia) {
        if (getSaldo() < 0 || tranferencia > getSaldo())
            System.out.println("\nVoce nao tem saldo suficiente para realizar a operacao.");
        else
            setSaldo(getSaldo() - tranferencia);
            System.out.println("\nVoce transferiu R$" + tranferencia);
    }

    public void operacao() {
        System.out.println("------------");
        System.out.println("Qual operação você deseja realizar ?");
        System.out.println("------------");
        System.out.println("[1] Saque");
        System.out.println("[2] Tranferência");
        System.out.println("[3] Depositar");
        System.out.println("[4] Ver Saldo");
        System.out.println("[5] Sair");
        System.out.println("------------");
        System.out.println();
        System.out.println("\nEscolha a operação desejada:");
        realizar();
    }

    public void realizar() {
        int operacao = ler.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("Saque");
                System.out.println("\nInsira o valor que deseja sacar:");
                double saqueValor = ler.nextDouble();
                saque(saqueValor);
                break;
            case 2:
                System.out.println("Deposito");
                System.out.println("\nInsira o valor que deseja depositar:");
                double depositarValor = ler.nextDouble();
                depositar(depositarValor);
                break;
            case 3:
                System.out.println("Transferencia");
                System.out.println("\nInsira o valor que deseja transferir:");
                double tranferencia = ler.nextDouble();
                tranferir(tranferencia);
                break;
            case 4:
                verSaldo();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("\nSELECIONE UMA OPÇÃO VALIDA!!!");
                operacao();
        }
    }
}