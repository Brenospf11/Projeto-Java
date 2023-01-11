import java.util.Scanner;

public class ContaPoupanca extends PessoaFisica{
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
        return super.toString() +
                "conta=" + conta +
                ", numConta='" + numConta + '\'' +
                ", operacao='" + operacao + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", contaInvestimento=" + contaInvestimento +
                '}';
    }

    public void verSaldo() {
        System.out.println("" + getSaldo());
    }

    public void saque(double saqueValor) {
        if (getSaldo() < 0 || saqueValor > getSaldo())
            System.out.println("");
        else
            setSaldo(getSaldo() - saqueValor);
        System.out.println("");

    }

    public void depositar(double depositarValor) {
        setSaldo(depositarValor + getSaldo());
        System.out.println("");

    }

    public void tranferir(double tranferencia) {
        if (getSaldo() < 0 || tranferencia > getSaldo())
            System.out.println("");
        else
            setSaldo(getSaldo() - tranferencia);
        System.out.println("");
    }

    public void investir(double investimento) {
        setSaldo(getSaldo() - investimento);
        setContaInvestimento(getContaInvestimento() + investimento + (investimento * 0.05));
        System.out.println("");

    }

    public void operacao() {
        System.out.println("------------");
        System.out.println("Qual operacao deseja fazer");
        System.out.println("--------------");
        System.out.println("[1] saque");
        System.out.println("[2] tranferencia");
        System.out.println("[3] depositar");
        System.out.println("[4] Investimento");
        System.out.println("[5] Ver saldo");
        System.out.println("[6] voltar");
        System.out.println("[7] sair");
        System.out.println("----------------");
        System.out.println();
        System.out.println("Escolha sua operacao");
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
                double valor1 = ler.nextDouble();
                depositar(valor1);
                break;

            case 3:
                System.out.println("Transferencia");
                System.out.println("Digite o valor que deseja tranferir");
                double valor2 = ler.nextDouble();
                tranferir(valor2);
                break;

            case 4:
                System.out.println("Investimento");
                System.out.println("Digite o valor que deseja Investir");
                double valor3 = ler.nextDouble();
                investir(valor3);
                break;

            case 5:


            case 6:
                System.out.println("Seu saldo é ");
                verSaldo();

            case 7:
                System.exit(0);
            default:
                System.out.println("Selecione a operacao que tenha");
                operacao();
        }

    }
}
