package Ligas;

import java.util.Scanner;

public class LaLiga {
    Scanner ler = new Scanner(System.in);

    public void operacao(){
        System.out.println("Qual time deseja saber da La Liga? ");
        String clube = ler.next();
        if(clube.equalsIgnoreCase("Barcelona")){
            Barcelona();
        } else if(clube.equalsIgnoreCase("Real Madrid")){
            RealMadrid();
        } else if(clube.equalsIgnoreCase("Atletico de Madrid")) {
            AtleticoMadrid();
        } else if(clube.equalsIgnoreCase("Valencia")) {
            Valencia();
        } else if(clube.equalsIgnoreCase("Vilarreal")) {
            Vilarreal();
        } else if(clube.equalsIgnoreCase("Betis")) {
            Betis();
        } else if(clube.equalsIgnoreCase("Real Sociedad")) {
            RealSociedad();
        } else if(clube.equalsIgnoreCase("Sevilla")) {
            Sevilla();
        } else if(clube.equalsIgnoreCase("Celta de Vigo")) {
            CeltaVigo();
        } else if(clube.equalsIgnoreCase("Real Valladolid")) {
            RealValladolid();
        }
    }

    public void Barcelona() {
        System.out.println("Barcelona");
        System.out.println("-");
    }

    public void RealMadrid() {
        System.out.println("Real Madrid");
        System.out.println("-");
    }

    public void AtleticoMadrid() {
        System.out.println("Atletico de Madrid");
        System.out.println("-");
    }

    public void Valencia() {
        System.out.println("Valencia");
        System.out.println("-");
    }

    public void Vilarreal() {
        System.out.println("Vilarreal");
        System.out.println("-");
    }

    public void Betis() {
        System.out.println("Betis");
        System.out.println("-");
    }

    public void RealSociedad() {
        System.out.println("Real Sociedad");
        System.out.println("-");
    }

    public void Sevilla() {
        System.out.println("Sevilla");
        System.out.println("-");
    }

    public void CeltaVigo() {
        System.out.println("Celta de Vigo");
        System.out.println("-");
    }

    public void RealValladolid() {
        System.out.println("Real Valladolid");
        System.out.println("-");
    }
}
