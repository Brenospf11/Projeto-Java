package Exercicios;

import Testes.*;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Media_de_numeros Media = new Media_de_numeros();
        Temperatura temp = new Temperatura();
        Jogo_Adivinhacao jogo = new Jogo_Adivinhacao();
        Numeros num = new Numeros();
        Palindromo palin = new Palindromo();
        Numeros_Divisiveis div = new Numeros_Divisiveis();
        Combnacao_de_String string = new Combnacao_de_String();

        System.out.println("-----------------------");
        System.out.println("[1] Todos os numeros de impares");
        System.out.println("[2] Media de numeros ");
        System.out.println("[3] Verificar se é um palindromo");
        System.out.println("[4] Soma de numeros divisiveis por 3 ou 5 abaixo de 1000");
        System.out.println("[5] Jogo de adivinhacao");
        System.out.println("[6] Convertor de temperatura");
        System.out.println("[7] Todas as combinacoes de uma String");
        System.out.println("[8] O maximo divisor comum com algoritimo de Euclides ");
        System.out.println("---------------------------------");
        System.out.println("Escolha uma operacao: ");
        int numero = ler.nextInt();
        switch (numero) {
            case 1:
                num.numeros_jogo();
                break;
            case 2:
                Media.calculo();
                break;
            case 3:
                palin.palindromo();
                break;
            case 4:
                div.divisiveis();
                break;
            case 5:
                jogo.adivinha();
                break;
            case 6:
                temp.temperatura();
                break;
            case 7:
                string.conexao();
                break;
            case 8:

                break;
        }
    }
}
