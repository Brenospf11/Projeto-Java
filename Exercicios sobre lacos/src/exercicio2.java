import java.util.Scanner;
import java.util.Random;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random r = new Random();

        int soma = 0;

        System.out.print("Digite um numero: ");
        int numero = ler.nextInt();

        for (int i = 0; i < numero; i++) {
             int temp = r.nextInt(6) + 1;
            System.out.println("O numero " + temp + " foi sorteado!");
            soma += temp;
        }
        System.out.println("A soma é: " + soma);


    }
}
