package Ligas;

import java.util.Scanner;

public class Bundesliga {
    Scanner ler = new Scanner(System.in);

    public void operacao() {
        System.out.println("Qual time deseja saber da Bundesliga? ");
        String clube = ler.next();
        if(clube.equalsIgnoreCase("Bayern")) {
            Bayern();
        } else if(clube.equalsIgnoreCase("Leipzig")) {
            Leipzig();
        } else if(clube.equalsIgnoreCase("Dortmund")) {
            BorussiaDortmund();
        } else if(clube.equalsIgnoreCase("Union Berlin")) {
            UnionBerlin();
        } else if(clube.equalsIgnoreCase("Leverkusen")) {
            Leverkusen();
        } else if(clube.equalsIgnoreCase("Eintracht")) {
            Eintracht();
        } else if(clube.equalsIgnoreCase("Monchengladbach")) {
            BorussiaMonchengladbach();
        } else if(clube.equalsIgnoreCase("Wolfsburg")) {
            Wolfsburg();
        } else if(clube.equalsIgnoreCase("Hertha Berlin")) {
            HerthaBerlin();
        } else if(clube.equalsIgnoreCase("Hoffenheim")) {
            Hoffenheim();
        }
    }

    public void Bayern() {
        System.out.println("Bayern");
        System.out.println("-");
    }

    public void Leipzig() {
        System.out.println("Leipzig");
        System.out.println("-");
    }

    public void BorussiaDortmund() {
        System.out.println("Borussia Dortmund");
        System.out.println("-");
    }

    public void UnionBerlin() {
        System.out.println("Union Berlin");
        System.out.println("-");
    }

    public void Leverkusen() {
        System.out.println("Leverkusen");
        System.out.println("-");
    }

    public void Eintracht() {
        System.out.println("Eintracht");
        System.out.println("-");
    }

    public void BorussiaMonchengladbach(){
        System.out.println("Borussia Monchegladbach");
        System.out.println("-");
    }

    public void Wolfsburg() {
        System.out.println("Wolfsburg");
        System.out.println("-");
    }

    public void HerthaBerlin() {
        System.out.println("Hertha Berlin");
        System.out.println("-");
    }

    public void Hoffenheim() {
        System.out.println("Hoffenheim");
        System.out.println("-");
    }
}
