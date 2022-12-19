package tabuada;

import java.util.Scanner;
public class tabuada {
    Scanner ler = new Scanner(System.in);
    int n1;
    int n2;
    String operacao = "";
    boolean continuar;
    public void calculadora() {
        switch (operacao) {
            case "+":
                System.out.println("O resultado da adição é: " + (n1 + n2));
                break;
            case "-":
                System.out.println("O resultado da subtração é: " + (n1 - n2));
                break;
            case "*":
                System.out.println("O resultado da multiplicação é: " + (n1 * n2));
                break;
            case "/":
                System.out.println("O resultado da divisão é: " + (n1 / n2));
                break;
        }
    }
    public void entrdaDados() {
            do {
                continuar = false;
                try {
                    ler = new Scanner(System.in);
                    System.out.println("Qual o tipo de efetuacao: (EX: +, -, *, /)");
                    operacao = ler.nextLine();
                    switch (operacao) {
                        case "-":
                            continuar = true;
                            break;
                        case "+":
                            continuar = true;
                            break;
                        case "/":
                            continuar = true;
                            break;
                        case "*":
                            continuar = true;
                            break;
                        default:
                            continuar = false;
                            break;
                    }
                } catch (Exception e) {
                }
            } while (!continuar);

            do {
                continuar = false;
                try {
                    ler = new Scanner(System.in);
                    System.out.println("Digite o primeiro numero: ");
                    n1 = ler.nextInt();
                    continuar = true;
                } catch (Exception e) {
                }
            } while (!continuar);

            do {
                try {
                    ler = new Scanner(System.in);
                    System.out.println("Digite o segundo numero: ");
                    n2 = ler.nextInt();
                    continuar = true;
                } catch (Exception e) {
                }
            } while (!continuar);
    }
}
