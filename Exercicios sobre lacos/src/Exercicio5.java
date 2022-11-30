import java.util.Scanner;
import java.util.Random;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite um numero: ");
        int numero = ler.nextInt();

        for(int i = 0; i < numero; i++) {
            int temp = random.nextInt(6) + 1;
            System.out.println("O numero sorteado foi: " + temp);

            if (numero == temp) {
                System.out.println("Foram necessarios " + temp + " para o numero " + numero + " fosse sorteado");
            }
        }



    }
}
