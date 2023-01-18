package Ligas;

import java.util.Scanner;

public class Ligue1 {
    Scanner ler = new Scanner(System.in);

    public void operacao() {
        System.out.println("Qual time deseja saber da Ligue 1? ");
        String clube = ler.next();

        if(clube.equalsIgnoreCase("PSG")) {
            PSG();
        } else if(clube.equalsIgnoreCase("Olympique")) {
            Olympique();
        } else if(clube.equalsIgnoreCase("Monaco")) {
            Monaco();
        } else if(clube.equalsIgnoreCase("Lile")) {
            Lile();
        } else if(clube.equalsIgnoreCase("Lyon")) {
            Lyon();
        } else if(clube.equalsIgnoreCase("Rennes")) {
            Rennes();
        } else if(clube.equalsIgnoreCase("Lens")) {
            Lens();
        } else if(clube.equalsIgnoreCase("Nantes")) {
            Nantes();
        } else if(clube.equalsIgnoreCase("Toulouse")) {
            Toulouse();
        } else if(clube.equalsIgnoreCase("Montpellier")) {
            Montpellier();
        }
    }

    public void PSG() {
        System.out.println("PSG");
        System.out.println("-");
    }

    public void Olympique() {
        System.out.println("Olympique");
        System.out.println("-");
    }

    public void Monaco() {
        System.out.println("Monaco");
        System.out.println("-");
    }

    public void Lile() {
        System.out.println("Lile");
        System.out.println("-");
    }
    public void Lyon() {
        System.out.println("Nice");
        System.out.println("-");
    }

    public void Rennes() {
        System.out.println("Rennes");
        System.out.println("-");
    }

    public void Lens() {
        System.out.println("Lens");
        System.out.println("-");
    }

    public void Nantes() {
        System.out.println("Nantes");
        System.out.println("-");
    }

    public void Toulouse() {
        System.out.println("Toulouse");
        System.out.println("-");
    }

    public void Montpellier() {
        System.out.println("Montpellier");
        System.out.println("-");
    }
}
