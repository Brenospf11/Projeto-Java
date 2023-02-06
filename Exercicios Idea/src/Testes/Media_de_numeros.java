package Testes;

import java.util.Scanner;

public class Media_de_numeros {
    Scanner ler = new Scanner(System.in);

    public void calculo(){
        System.out.println("Quantos numeros deseja inserir?");
        int n = ler.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            int numero = ler.nextInt();
            sum += numero;
        }
        double calculo = (double) sum / n;
        System.out.println("A media dos numeros é: " + calculo);
    }
}
