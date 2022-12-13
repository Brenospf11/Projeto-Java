import java.util.Scanner;
import java.util.Random;

public class exercicio5novo {
    public static void main(String[] args){
        Random r = new Random();

        int numero = 0;
        int temp;
        boolean continuar;

        do {
            continuar = false;
            try {
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite um numero: ");
                numero = ler.nextInt();
                if (numero <= 0){
                    System.out.println("Digite m numero positivo!!");
                    continuar = false;
                } else {
                    continuar = true;
                }
            } catch (Exception e){
            }
        } while (!continuar);

        temp = r.nextInt(6) + 1;
        for(int i = 0; i < numero; i++) {
            System.out.println("O numero sorteado foi: " + temp);
        }
        if (numero == temp) {
            System.out.println("Foram necessarios " + temp + " para o numero " + numero + " fosse sorteado");
        }
    }
}
