package nomeIdade;

import java.util.Scanner;

public class idadeNome {
        Scanner ler = new Scanner(System.in);
        String [] aluno = new String[3];
        int [] idade = new int [3];
        int menor = 1000, maior;
        String nomem = "", nomev = "";
        float soma, media;
    public void entradaDado() {

        for (int i = 0; i < aluno.length; i++){
            System.out.println("Digite o nome do " + (i+1) + "° aluno: ");
            aluno [i] = ler.next();
            System.out.println("Digite a idade do " + (i+1) + "° aluno: ");
            idade [i] = ler.nextInt();

            soma += idade[i];
            media = soma / (i+1);

            if (idade[i] < menor){
                menor = idade[i];
                nomem = aluno[i];
            }
            else if (idade[i] > maior) {
                maior = idade[i];
                nomev = aluno[i];
            }
        }
    }
    public void resultado() {

        System.out.println("A média da iadades é: " + media);
        System.out.println("O aluno " + nomev + " que é o mais velho tem " + maior + " anos.");
        System.out.println("O aluno " + nomem + " que é o mais novo tem " + menor + " anos.");
    }
}
