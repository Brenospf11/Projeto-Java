package Faculdades;

import java.util.Scanner;

public abstract class Estudante {
    Scanner ler =new Scanner(System.in);

    public String nomeAluno;
    public String Matricula;

    public void EntradaDados(){
        System.out.println("Qual o nome do aluno: ");
        nomeAluno = ler.nextLine();
        System.out.println("Qual a Matricula do aluno: ");
        Matricula = ler.nextLine();
    }

    public void imprimeDados(){
        System.out.println("O nome do aluno é: " + nomeAluno);
        System.out.println("A matricula é: " + Matricula);
    }
}
