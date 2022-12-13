import java.util.Random;
import java.util.Scanner;

public class exercicio2novo {
    public static void main(String[] args){
        int soma = 0;
        int numero = 0;
        int temp = 0;
        boolean continuar;

        do {
            continuar = false;
            try {
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite um numero: ");
                numero = ler.nextInt();
                if (numero < 0){
                    System.out.println("Coleque um numero positivo!!");
                    continuar = false;
                } else {
                    continuar = true;
                }
            }
            catch (Exception e) {
            }
        } while (!continuar);

        for (int i = 0; i < numero; i++) {
            Random r = new Random();
            temp = r.nextInt(6) + 1;
            System.out.println("O numero " + temp + " foi sorteado!");
            soma += temp;
        }
        System.out.println("A soma é: " + soma);
    }
}
