package Testes;


import java.util.Scanner;

public class Numeros_Divisiveis {
    Scanner ler = new Scanner(System.in);
    public void divisiveis(){
        System.out.println("Digite o numero que deseja calcular a soma: ");
        int numero = ler.nextInt();
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                soma += i;
            }
        }
        System.out.println("A soma de todos os numeros divisiveis por 3 ou 5 ate " + numero + " é: " + soma);
    }
}