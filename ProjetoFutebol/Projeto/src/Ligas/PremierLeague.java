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

    public void tabela2021(){
        System.out.println("|----------------------------------------------------------------------------|");
        System.out.println("|                     Campeonato Ingles de 2021-2022                         |");
        System.out.println("|----------------------------------------------------------------------------|");
        System.out.println("|       Clube        | Pts  |  PJ  | VIT  |  E   | DER  |  GM  |  GC  |  SG  |");
        System.out.println("| 1  City            |  93  |  38  |  29  |  6   |  3   |  99  |  26  |  73  |");
        System.out.println("| 2  Liverpool       |  92  |  38  |  28  |  8   |  2   |  94  |  26  |  68  |");
        System.out.println("| 3  Chelsea         |  74  |  38  |  21  |  11  |  6   |  76  |  33  |  43  |");
        System.out.println("| 4  Tottenham       |  71  |  38  |  22  |  5   |  11  |  69  |  40  |  29  |");
        System.out.println("| 5  Arsenal         |  69  |  38  |  22  |  5   |  13  |  61  |  48  |  13  |");
        System.out.println("| 6  United          |  58  |  38  |  16  |  10  |  12  |  57  |  57  |  0   |");
        System.out.println("| 7  West Ham        |  56  |  38  |  16  |  8   |  14  |  60  |  51  |  9   |");
        System.out.println("| 8  Leicester       |  52  |  38  |  14  |  10  |  14  |  62  |  59  |  3   |");
        System.out.println("| 9  Brighton        |  52  |  38  |  12  |  15  |  11  |  42  |  44  | -2   |");
        System.out.println("| 10 Wolves          |  51  |  38  |  15  |  6   |  17  |  38  |  43  | -5   |");
        System.out.println("| 11 Newcastle       |  38  |  38  |  13  |  10  |  15  |  44  |  62  | -18  |");
        System.out.println("| 12 Crystal Palace  |  48  |  38  |  11  |  15  |  12  |  50  |  46  |  4   |");
        System.out.println("| 13 Brentford       |  46  |  38  |  13  |  7   |  18  |  48  |  26  | -8   |");
        System.out.println("| 14 Aston Villa     |  45  |  38  |  13  |  6   |  19  |  52  |  54  | -2   |");
        System.out.println("| 15 Southampton     |  40  |  38  |  9   |  13  |  16  |  43  |  67  | -24  |");
        System.out.println("| 16 Everton         |  39  |  38  |  11  |  6   |  21  |  43  |  66  | -23  |");
        System.out.println("| 17 Leeds           |  38  |  38  |  9   |  11  |  18  |  42  |  79  | -37  |");
        System.out.println("| 18 Burnley         |  35  |  38  |  7   |  14  |  17  |  34  |  53  | -19  |");
        System.out.println("| 19 Watford         |  23  |  38  |  6   |  5   |  27  |  34  |  77  | -43  |");
        System.out.println("| 20 Norwich         |  22  |  38  |  5   |  7   |  26  |  23  |  84  | -61  |");
        System.out.println("|----------------------------------------------------------------------------|");
    }

    public void Tabela2020(){

    }
}
