package Ligas;

import java.util.Scanner;

public class PremierLeague {
    Scanner ler = new Scanner(System.in);

    public void operacao(){
        System.out.println("Qual time deseja saber da Premier League? ");
        String clube = ler.next();
        if(clube.equalsIgnoreCase("Liverpool")) {
            Liverpool();
        } else if(clube.equalsIgnoreCase("United")) {
            ManchesterUnited();
        } else if(clube.equalsIgnoreCase("City")) {
            ManchesterCity();
        } else if(clube.equalsIgnoreCase("Chealsea")) {
            Chealsea();
        } else if(clube.equalsIgnoreCase("Arsenal")) {
            Arsenal();
        } else if(clube.equalsIgnoreCase("Tottenham")) {
            Tottenham();
        } else if(clube.equalsIgnoreCase("Newcastle")) {
            Newcastle();
        } else if(clube.equalsIgnoreCase("Nottingham Forest")) {
            NottinghamForest();
        } else if(clube.equalsIgnoreCase("Aston Villa")) {
            AstonVilla();
        } else if(clube.equalsIgnoreCase("Leicester")) {
            LeicesterCity();
        }
    }

    public void Liverpool() {
        System.out.println("Liverpool");
        System.out.println("-");
    }

    public void ManchesterUnited() {
        System.out.println("Manchester United");
        System.out.println("-");
    }

    public void ManchesterCity() {
        System.out.println("Manchester City");
        System.out.println("-");
    }

    public void Chealsea() {
        System.out.println("Chealsea");
        System.out.println("-");
    }

    public void Arsenal() {
        System.out.println("Arsenal");
        System.out.println("-");
    }

    public void Tottenham() {
        System.out.println("Tottenham");
        System.out.println("-");
    }

    public void Newcastle() {
        System.out.println("Newcastle");
        System.out.println("-");
    }

    public void NottinghamForest() {
        System.out.println("Nottingham Forest");
        System.out.println("-");
    }

    public void AstonVilla() {
        System.out.println("Aston Villa");
        System.out.println("-");
    }

    public void LeicesterCity() {
        System.out.println("Leicester City");
        System.out.println("-");
    }
}
