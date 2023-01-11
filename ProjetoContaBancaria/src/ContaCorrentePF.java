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
        return "ContaInvestimentoPJ{" +
                "conta=" + conta +
                ", numConta='" + numConta + '\'' +
                ", operacao='" + operacao + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
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

    public void operacao() {
        System.out.println("------------");
        System.out.println("Qual operação você deseja realizar ?");
        System.out.println("--------------------------");
        System.out.println("[1] Saque");
        System.out.println("[2] Tranferência");
        System.out.println("[3] Depositar");
        System.out.println("[4] Ver Saldo");
        System.out.println("[5] Voltar");
        System.out.println("[6] Sair");
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("\nEscolha a operação desejada:");
        realizar();
    }

    public void realizar() {
        int operacao = ler.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Saque");
                System.out.println("insira o valor que deseja sacar:");
                double valor = ler.nextDouble();
                saque(valor);
                break;

            case 2:
                System.out.println("Deposito");
                System.out.println("Insira o valor que deseja depositar:");
                double valor1 = ler.nextDouble();
                depositar(valor1);
                break;

            case 3:
                System.out.println("Transferencia");
                System.out.println("Insira o valor que deseja transferir:");
                double valor2 = ler.nextDouble();
                depositar(valor2);
                break;

            case 4:
                System.out.println("Seu saldo atual é: ");
                verSaldo();
                break;

            case 5:


            case 6:
                System.exit(0);

            default:
                System.out.println("Selecione a operação que tenha");
                operacao();
        }

    }



}
