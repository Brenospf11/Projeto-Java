import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("insira a largura ");
        double largura = ler.nextDouble();
        System.out.print("Insira o comprimento ");
        double comprimento = ler.nextDouble();
        System.out.print("Insira a profundidade inicial ");
        double profundidadeI = ler.nextDouble();
        System.out.print("Insira a profundidade final ");
        double profundidadeF = ler.nextDouble();

        double calc = (profundidadeI * profundidadeF) / 2;
        calc = calc * largura * comprimento * 1000;

        System.out.print(calc);
    }
}