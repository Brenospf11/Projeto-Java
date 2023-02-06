package Testes;

import java.util.Scanner;

public class Numeros {
    Scanner ler = new Scanner(System.in);
    public void numeros_jogo(){
        System.out.println("Digite um numero grande para mostrar quantos impares tem: ");
        int numero = ler.nextInt();
        for (int i = 1; i <= numero; i += 2){
            System.out.println(i);
        }
    }
}
