import java.util.Scanner;

public class ContaPoupanca extends PessoaFisica {
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
        return super.toString() +
                " Conta Poupanca { " +
                "Conta=" + conta +
                ", Numero da Conta ='" + numConta + '\'' +
                ", Operacao ='" + operacao + '\'' +
                ", Agencia ='" + agencia + '\'' +
                ", Saldo =" + saldo +
                " }";
    }

    public void imprimirCP() {
        System.out.println(toString());
    }

    public void verSaldo() {
        System.out.println("\nSeu saldo atual é R$" + getSaldo());
    }

    public void saque(double saqueValor) {
        if (getSaldo() < 0 || saqueValor > getSaldo())
            System.out.println("\nVocê não tem saldo suficiente para raealizar a operação.");
        else
            setSaldo(getSaldo() - saqueValor);
            System.out.println("\nSaque realizado no valor de R$" + saqueValor);
    }

    public void depositar(double depositarValor) {
        setSaldo(depositarValor + getSaldo());
        System.out.println("\nO valor depositado foi R$");
    }

    public void tranferir(double transferencia) {
        if (getSaldo() < 0 || transferencia > getSaldo())
            System.out.println("\nVocê não tem saldo suficiente para raealizar a operação.");
        else
            setSaldo(getSaldo() - transferencia);
            System.out.println("\nVocê transferiu R$" + transferencia);
    }

    public void investir(double investimento) {
        setSaldo(getSaldo() - investimento);
        double investimentoTotal = investimento * 0.05;
        System.out.println("Voce investiu R$" + investimento + " e irá ter uma rentabilidade de R$" + investimentoTotal);
    }

    public void operacao() {
        System.out.println("------------");
        System.out.println("Qual operacao deseja fazer");
        System.out.println("------------");
        System.out.println("[1] saque");
        System.out.println("[2] Depositar");
        System.out.println("[3] Transferencia");
        System.out.println("[4] Investimento");
        System.out.println("[5] Ver saldo");
        System.out.println("[6] sair");
        System.out.println("-------------");
        System.out.println();
        System.out.println("Escolha sua operacao");
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
                System.out.println("Investimento");
                System.out.println("Insira o valor que deseja Investir");
                double investimento = ler.nextDouble();
                investir(investimento);
                break;
            case 5:
                verSaldo();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("\nSELECIONE UMA OPÇÃO VALIDA!!!");
                operacao();
        }
    }
}
