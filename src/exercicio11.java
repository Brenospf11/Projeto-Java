import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o seu salario? ");
        double salario = ler.nextInt();

        if (salario <= 1212.00) {
            double resultado = salario * 0.075;
            System.out.println("Seu desconto foi: " + resultado);
        }

        else if (salario >= 1212.01 && salario <= 2427.35) {
            double inicio = 1212;
            double contribuicao = inicio * 0.075;
            double excede = salario - 1212;
            double correspondente = excede * 0.09;
            double resultado = contribuicao + correspondente;
            System.out.println("Seu desconto foi: " + resultado);
        }

        else if (salario >= 2427.36 && salario <= 3641.03) {
            double inicio = 1212;
            double contribuicao = inicio * 0.075;
            double preco = (2427.35 - 1212) * 0.09;
            double preco1 = (salario - 2427.35) * 0.12;
            double resultado = contribuicao + preco + preco1;
            System.out.println("Seu desconto foi: " + resultado);
        }

        else if (salario >= 3641.04 && salario <= 7087.22) {
            double inicio = 1212;
            double contribuicao = inicio * 0.075;
            double preco = (2427.35 - 1212) * 0.09;
            double preco1 = (3641.03 - 2427) * 0.12;
            double preco2 = (salario - 3641.03) * 0.14;
            double resultado = contribuicao + preco + preco1 + preco2;
            System.out.println("Seu desconto foi: " + resultado);
        }

        else if (salario > 7087.22) {
            double inicio = 1212;
            double contribuicao = inicio * 0.075;
            double preco = (2427.35 - 1212) * 0.09;
            double preco1 = (3641.03 - 2427) * 0.12;
            double preco2 = (7087.22 - 3641.03) * 0.14;
            double resultado = contribuicao + preco + preco1 + preco2;
            System.out.println("O teto maximo é: " + resultado);
        }

    }
}
