package Testes;



import java.util.Random;
import java.util.Scanner;

public class Jogo_Adivinhacao {
    Scanner ler = new Scanner(System.in);
    Random random = new Random();

public void adivinha(){
    int numero = random.nextInt(100) + 1;
    int adivinha = 0;
    int tentativas = 0;
    System.out.println("Adivinhe o numero de 1 a 100: ");
    while (adivinha != numero){
        adivinha = ler.nextInt();
        tentativas++;
        if(adivinha < numero){
            System.out.println("Muito baixo. Tente novamente.");
        } else if(adivinha > numero) {
            System.out.println("Muito alto. Tente novamente.");
        }
    }
    System.out.println("Voce adivinho o numero em " + tentativas + " tentativas.");
}
}
