package Ligas;

import java.util.Scanner;

public class Brasileirao {
    Scanner ler = new Scanner(System.in);

    public void operacao() {
        System.out.println("Qual time deseja saber do Brasileirao");
        String clube = ler.next();

        if (clube.equalsIgnoreCase("Gremio")) {
            Gremio();
        } else if(clube.equalsIgnoreCase("Flamengo")){
            Flamengo();
        } else if(clube.equalsIgnoreCase("Snatos")){
            Santos();
        } else if(clube.equalsIgnoreCase("Sao Paulo")){
            SaoPaulo();
        } else if(clube.equalsIgnoreCase("Internacional")){
            Internacional();
        } else if(clube.equalsIgnoreCase("Vasco")){
            Vasco();
        } else if(clube.equalsIgnoreCase("Fluminense")){
            Fluminense();
        } else if(clube.equalsIgnoreCase("Palmeiras")){
            Palmeiras();
        } else if(clube.equalsIgnoreCase("Corinthias")){
            Corinthias();
        } else if(clube.equalsIgnoreCase("Atletico Mineiro")){
            AtleticoMG();
        }
    }

    public void Gremio() {
        System.out.println("Gremio");
        System.out.println("-");
    }

    public void Flamengo() {
        System.out.println("Flamengo");
        System.out.println("-");
    }

    public void Internacional() {
        System.out.println("Internacional");
        System.out.println("-");
    }

    public void Vasco() {
        System.out.println("Vasco");
        System.out.println("-");
    }

    public void Fluminense() {
        System.out.println("Fluminense");
        System.out.println("-");
    }

    public void Palmeiras() {
        System.out.println("Palmeiras");
        System.out.println("-");
    }

    public void Corinthias() {
        System.out.println("Corinthias");
        System.out.println("-");
    }

    public void SaoPaulo() {
        System.out.println("Sao Paulo");
        System.out.println("-");
    }

    public void Santos() {
        System.out.println("Santos");
        System.out.println("-");
    }

    public void AtleticoMG() {
        System.out.println("Atletico-MG");
        System.out.println("-");
    }

    public void tabela2022(){
        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.println("|                          Capeonato Brasileiro de 2022                       |");
        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.println("|      Clube           | Pts  |  PJ  | VIT  |   E  | DER |  GM  |  GC  |   SG |");
        System.out.println("| 1  Palmeiras         |  81  |  38  |  23  |  12  |  3  |  66  |  27  |   39 |");
        System.out.println("| 2  Internacional     |  73  |  38  |  20  |  13  |  5  |  58  |  31  |   27 |");
        System.out.println("| 3  Fluminense        |  70  |  38  |  21  |  7   |  10 |  63  |  41  |   22 |");
        System.out.println("| 4  Corinthias        |  65  |  38  |  18  |  11  |  9  |  44  |  36  |   8  |");
        System.out.println("| 5  Flamengo          |  62  |  38  |  18  |  8   |  12 |  60  |  39  |   21 |");
        System.out.println("| 6  Athletico-PR      |  58  |  38  |  16  |  10  |  12 |  48  |  48  |   0  |");
        System.out.println("| 7  Atletico-MG       |  58  |  38  |  15  |  13  |  10 |  45  |  37  |   8  |");
        System.out.println("| 8  Fortaleza         |  55  |  38  |  15  |  10  |  13 |  46  |  39  |   7  |");
        System.out.println("| 9  Sao Paulo         |  54  |  38  |  13  |  15  |  10 |  55  |  42  |   13 |");
        System.out.println("| 10 America-MG        |  53  |  38  |  15  |  8   |  15 |  40  |  40  |   0  |");
        System.out.println("| 11 Botafogo          |  53  |  38  |  15  |  8   |  15 |  41  |  43  |  -2  |");
        System.out.println("| 12 Santos            |  47  |  38  |  12  |  11  |  15 |  44  |  41  |   3  |");
        System.out.println("| 13 Goais             |  46  |  38  |  11  |  13  |  14 |  40  |  53  |  -13 |");
        System.out.println("| 14 Bragantino        |  44  |  38  |  11  |  11  |  16 |  49  |  59  |  -10 |");
        System.out.println("| 15 Coritiba          |  42  |  38  |  12  |  6   |  20 |  39  |  60  |  -21 |");
        System.out.println("| 16 Cuiaba            |  41  |  38  |  10  |  11  |  17 |  31  |  42  |  -11 |");
        System.out.println("| 17 Ceara SC          |  37  |  38  |  7   |  16  |  15 |  34  |  41  |  -7  |");
        System.out.println("| 18 Atletico-GO       |  36  |  38  |  8   |  12  |  18 |  39  |  57  |  -18 |");
        System.out.println("| 19 Avai              |  35  |  38  |  9   |  8   |  21 |  34  |  60  |  -26 |");
        System.out.println("| 20 Juventude         |  22  |  38  |  3   |  13  |  22 |  29  |  69  |  -40 |");
        System.out.println("|-----------------------------------------------------------------------------|");
    }

    public void tabela2021(){

        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.println("|                          Capeonato Brasileiro de 2021                       |");
        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.println("|      Clube           | Pts  |  PJ  | VIT  |  E   | DER |  GM  |  GC  |   SG |");
        System.out.println("| 1  Atletico-MG       |  84  |  38  |  26  |  6   |  6  |  67  |  34  |   33 |");
        System.out.println("| 2  Flamengo          |  71  |  38  |  21  |  8   |  9  |  69  |  36  |   33 |");
        System.out.println("| 3  Palmeiras         |  66  |  38  |  20  |  6   |  12 |  58  |  43  |   15 |");
        System.out.println("| 4  Fortaleza         |  58  |  38  |  17  |  7   |  14 |  44  |  45  |   -1 |");
        System.out.println("| 5  Corinthias        |  57  |  38  |  15  |  12  |  11 |  40  |  36  |   4  |");
        System.out.println("| 6  Bragantino        |  56  |  38  |  14  |  14  |  10 |  55  |  46  |   9  |");
        System.out.println("| 7  Fluminense        |  54  |  38  |  15  |  9   |  14 |  38  |  38  |   0  |");
        System.out.println("| 8  America-MG        |  53  |  38  |  13  |  14  |  11 |  41  |  37  |   4  |");
        System.out.println("| 9  Atletico-GO       |  53  |  38  |  13  |  14  |  11 |  33  |  36  |   -3 |");
        System.out.println("| 10 Santos            |  50  |  38  |  12  |  14  |  12 |  35  |  40  |   -5 |");
        System.out.println("| 11 Ceara SC          |  50  |  38  |  11  |  17  |  10 |  39  |  38  |   1  |");
        System.out.println("| 12 Internacional     |  48  |  38  |  12  |  12  |  14 |  44  |  42  |   2  |");
        System.out.println("| 13 Sao Paulo         |  48  |  38  |  11  |  15  |  12 |  31  |  39  |   -8 |");
        System.out.println("| 14 Athletico_PR      |  47  |  38  |  13  |  8   |  17 |  41  |  45  |   -4 |");
        System.out.println("| 15 Cuiaba            |  47  |  38  |  10  |  17  |  11 |  34  |  37  |   -3 |");
        System.out.println("| 16 Juventude         |  46  |  38  |  11  |  13  |  14 |  36  |  44  |   -8 |");
        System.out.println("| 17 Gremio            |  43  |  38  |  12  |  7   |  19 |  44  |  51  |   -7 |");
        System.out.println("| 18 Bahia             |  43  |  38  |  11  |  10  |  17 |  42  |  51  |   -9 |");
        System.out.println("| 19 Sport Recife      |  38  |  38  |  9   |  11  |  18 |  24  |  37  |  -13 |");
        System.out.println("| 20 Chapecoense       |  15  |  38  |  1   |  12  |  25 |  27  |  67  |  -40 |");
        System.out.println("|-----------------------------------------------------------------------------|");
    }



}
