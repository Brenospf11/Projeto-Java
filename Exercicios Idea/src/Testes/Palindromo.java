package Testes;

import java.util.Scanner;

public class Palindromo {
    Scanner ler = new Scanner(System.in);
    public void palindromo(){
        System.out.println("Digite um Palindromo: ");
        String nome = ler.nextLine();
        boolean palin = true;
        for(int i = 0, j = nome.length() - 1; i < j; i++, j--){
            if(nome.charAt(i) != nome.charAt(j)) {
                palin = false;
                break;
            }
        }
        if(palin) {
            System.out.println("O nome é um palindromo");
        } else {
            System.out.println("O nome nao é um palindromo");
        }
    }
}
