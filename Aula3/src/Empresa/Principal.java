package Empresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        boolean continuar;
        String pergunta = "";
        Scanner input = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Scanner ler = new Scanner(System.in);

        System.out.println("----- Empregado -----");
        System.out.println("Qual o seu nome? ");
        p1.setNome(ler.nextLine());
        System.out.println("Qual o seu telefone? ");
        p1.setTelefone(ler.nextLine());
        System.out.println("Qual a data de admissao? ");
        p1.setData_de_admissao(ler.nextLine());

        // ---------------------- Empregado -------------------------
        Empregado emp = new Empregado();
        System.out.println("Qual o seu salario? ");
        emp.setSalario(ler.nextDouble());
        System.out.println(p1.toString());
        System.out.println(emp.toString());

        // -------------------------------- PERGUNTA SE QUER CONTINUAR --------------------
        System.out.println("Deseja continuar para o Desenvolvedor? (S/N)");
        pergunta = input.nextLine();
        if (pergunta.equalsIgnoreCase("S")){
            continuar = true;
        } else {
            System.exit(0);
        }

        Scanner ler1 = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        p1.setNome(ler1.nextLine());
        System.out.println("Qual o seu telefone? ");
        p1.setTelefone(ler1.nextLine());
        System.out.println("Qual a data de admissao? ");
        p1.setData_de_admissao(ler1.nextLine());

        // ------------------------------ DESENVOLVEDOR ----------------------------------
        Desenvolvedor dev = new Desenvolvedor();
        System.out.println("Quantas horas voce trabalhou no mes? ");
        dev.setHoras(ler1.nextDouble());
        System.out.println(p1.toString());
        System.out.println(dev.toString());
        dev.calcDev();

        // ---------------------------- PERGUNTA SE QUER CONTINUAR ------------------------
        System.out.println("Deseja continuar para o Gerente? (S/N)");
        pergunta = input.nextLine();
        if (pergunta.equalsIgnoreCase("S")){
            continuar = true;
        } else {
            System.exit(0);
        }

        Scanner ler2 = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        p1.setNome(ler2.nextLine());
        System.out.println("Qual o seu telefone? ");
        p1.setTelefone(ler2.nextLine());
        System.out.println("Qual a data de admissao? ");
        p1.setData_de_admissao(ler2.nextLine());

        // ------------------------------------- GERENTE ---------------------------------
        Gerente ger = new Gerente();
        System.out.println("Qual o seu salario? ");
        ger.setSalario(ler2.nextDouble());
        System.out.println("Quantas horas voce trabalhou no mes? ");
        ger.setHoras(ler2.nextDouble());
        System.out.println("Quantos dias voce trabalhou no mes? ");
        ger.setDias(ler2.nextDouble());
        System.out.println(p1.toString());
        System.out.println(ger.toString());
        ger.calcGer();


    }
}