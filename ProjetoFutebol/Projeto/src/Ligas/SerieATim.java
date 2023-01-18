package Ligas;

import java.util.Scanner;

public class SerieATim {
    Scanner ler = new Scanner(System.in);

    public void operacao() {
        System.out.println("Qual time deseja saber da Serie A TIM? ");
        String clube = ler.next();

        if(clube.equalsIgnoreCase("Milan")) {
            Milan();
        } else if(clube.equalsIgnoreCase("Juventus")) {
            Juventus();
        } else if(clube.equalsIgnoreCase("Inter")) {
            Inter();
        } else if(clube.equalsIgnoreCase("Roma")) {
            Roma();
        } else if(clube.equalsIgnoreCase("Napoli")) {
            Napoli();
        } else if(clube.equalsIgnoreCase("Lazio")) {
            Lazio();
        } else if(clube.equalsIgnoreCase("Atalanta")) {
            Atalanta();
        } else if(clube.equalsIgnoreCase("Fiorentina")) {
            Fiorentina();
        } else if(clube.equalsIgnoreCase("Torino")) {
            Torino();
        } else if(clube.equalsIgnoreCase("Sassuolo")) {
            Sassuolo();
        }
    }

    public void Milan() {
        System.out.println("Milan");
        System.out.println("-");
    }

    public void Napoli() {
        System.out.println("Napoli");
        System.out.println("-");
    }

    public void Juventus() {
        System.out.println("Juventus");
        System.out.println("-");
    }

    public void Inter() {
        System.out.println("Inter");
        System.out.println("-");
    }

    public void Lazio() {
        System.out.println("Lazio");
        System.out.println("-");
    }

    public void Roma() {
        System.out.println("Roma");
        System.out.println("-");
    }

    public void Atalanta() {
        System.out.println("Atalanta");
        System.out.println("-");
    }

    public void Fiorentina() {
        System.out.println("Fiorentina");
        System.out.println("-");
    }

    public void Torino() {
        System.out.println("Torino");
        System.out.println("-");
    }

    public void Sassuolo() {
        System.out.println("Sassuolo");
        System.out.println("-");
    }





}
