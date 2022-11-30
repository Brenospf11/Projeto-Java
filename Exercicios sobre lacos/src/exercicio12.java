import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;

        System.out.printf("Digite um numero: ");
        valor = ler.nextInt();

        for (int i=1; i < valor; i = i + 2) {
            System.out.println(i);
        }
    }
}
