import java.util.Scanner;

public class exercicio11novo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
//        for (char c = 'a'; c <= 'z'; c++) {
//            System.out.println("" + c);
//        }
        System.out.println("Quanto é o seu salario: ");
        double salario = ler.nextDouble();

            if (salario <= 1212) {
                double resultado = salario * 0.075;
                System.out.println("A contribuicao do INSS foi: " + resultado);
            } else if (salario <= 2437.35) {
                double resultado = (salario - 1212) * 0.09 + 90.90;
                System.out.println("A contribuicao do INSS foi: " + resultado);
            } else if (salario <= 3641.03) {
                double resultado = (salario - 2427.35) * 0.12 + 90.90 + 109.38;
                System.out.println("A contribuicao do INSS foi: " + resultado);
            } else if (salario <= 7087.22) {
                double resultado = (salario - 3641.03) * 0.14 + 90.90 + 109.38 + 145.65;
                System.out.println("A contribuicao do INSS foi: " + resultado);
            } else {
                System.out.println("A contribuicao do INSS foi: 828.38");
            }
        }

    }

