package saldo;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        saldoBancario saldoban = new saldoBancario();
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite o numero da conta: ");
            saldoban.setNumNome(ler.nextLine());
            System.out.println("O numero da sua conta é: " + saldoban.getNumNome());

            saldoban.entradaConta();
            System.out.println("Quer fazer o calculo de outra conta? (S/N)");
        } while (ler.nextLine().equalsIgnoreCase("S"));



    }
}
