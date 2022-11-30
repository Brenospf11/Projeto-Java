import java.util.Scanner;
import java.util.Random;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escolha um numero: ");
        int escolha = ler.nextInt();

        if (escolha < 1 || escolha > 6) {
            System.out.println("Escolha um numero entre 0 e 6!");
        } else {

            int numero = random.nextInt( 6) + 1;
            System.out.println("O numero sorteado de 0 a 6: " + numero);

            if (escolha == numero) {
                System.out.println("Voce acertou!");
            } else {
                System.out.println("Voce errou!");
            }

        }
    }
}
