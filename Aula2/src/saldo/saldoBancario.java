package saldo;

import java.util.Scanner;

public class saldoBancario {
    Scanner ler = new Scanner(System.in);
    private String numNome;
    private double saldo;
    private double credito;
    private double debito;
    private double saldoAtual;

    public String getNumNome() {
        return numNome;
    }

    public void setNumNome(String numNome) {
        this.numNome = numNome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public void calculoSaldo(){
        saldoAtual = saldo - debito + credito;
    }

    public double calculoSaldo2() {
        saldoAtual = saldo - debito + credito;
        return saldoAtual;
    }

    public void entradaConta(){

        System.out.println("Qual é o seu saldo: ");
        setSaldo(ler.nextDouble());

        System.out.println("Qual o seu debito: ");
        setDebito(ler.nextDouble());

        System.out.println("Qual é o seu credito: ");
        setCredito(ler.nextDouble());

        System.out.println("Seu saldo é: " + calculoSaldo2());
        if (saldoAtual < 0) {
            System.out.println("O seu saldo é Negativo!!");
        } else {
            System.out.println("O seu saldo é Positivo!!");
        }
    }
}
