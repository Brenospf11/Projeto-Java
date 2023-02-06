import Ligas.*;
import Torneios.*;
import Copas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Copa copa = new Copa();
        PremierLeague prem = new PremierLeague();
        LaLiga laLiga = new LaLiga();
        Bundesliga bund = new Bundesliga();
        SerieATim serieATim = new SerieATim();
        Ligue1 ligue1 = new Ligue1();
        Brasileirao brasileirao = new Brasileirao();
        CampeonatosNacionais nacionais = new CampeonatosNacionais();
        Champions champions = new Champions();
        Libertadores libertadores = new Libertadores();
        MundialDeClubes mundialDeClubes = new MundialDeClubes();

        do {
            System.out.println("███████ ██    ██ ████████ ███████ ██████   ██████  ██      \n" +
                    "██      ██    ██    ██    ██      ██   ██ ██    ██ ██      \n" +
                    "█████   ██    ██    ██    █████   ██████  ██    ██ ██      \n" +
                    "██      ██    ██    ██    ██      ██   ██ ██    ██ ██      \n" +
                    "██       ██████     ██    ███████ ██████   ██████  ███████ \n" +
                    "                                                           ");

            System.out.println();
            System.out.println("|-------------------------------|");
            System.out.println("|  [1] Ligas                    |");
            System.out.println("|  [2] Torneios                 |");
            System.out.println("|  [3] Copas                    |");
            System.out.println("|  [4] Tabelas de Campeonatos   |");
            System.out.println("|  [5] Sair                     |");
            System.out.println("|-------------------------------|");
            System.out.println("Digite oque deseja: ");
            int numero = ler.nextInt();
            switch (numero){
                case 1:
                    System.out.println("|----------------------|");
                    System.out.println("|  [1] Premier League  |");
                    System.out.println("|  [2] La Liga         |");
                    System.out.println("|  [3] Bundesliga      |");
                    System.out.println("|  [4] Serie A Tim     |");
                    System.out.println("|  [5] Brasileirao     |");
                    System.out.println("|  [6] Ligue 1         |");
                    System.out.println("|  [7] Sair            |");
                    System.out.println("|----------------------|");
                    System.out.println("  Qual liga deseja ver? ");
                    int times = ler.nextInt();
                    switch (times){
                        case 1:
                            prem.operacao();
                            break;
                        case 2:
                            laLiga.operacao();
                            break;
                        case 3:
                            bund.operacao();
                            break;
                        case 4:
                            serieATim.operacao();
                            break;
                        case 5:
                            brasileirao.operacao();
                            break;
                        case 6:
                            ligue1.operacao();
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Digite um numero VALIDO!!!");
                    }
                    break;
                case 2:
                    System.out.println("|-----------------------------|");
                    System.out.println("|  [1] Champions              |");
                    System.out.println("|  [2] Libertadores           |");
                    System.out.println("|  [3] Mundial de Clubes      |");
                    System.out.println("|  [4] Cmpeonatos Nacionais   |");
                    System.out.println("|  [5] Sair                   |");
                    System.out.println("|-----------------------------|");
                    System.out.println("Qual Torneio deseja ver?       ");
                    int torneio = ler.nextInt();
                    switch (torneio){
                        case 1:
                            System.out.println("|-----------------|");
                            System.out.println("|  [1] Historia   |");
                            System.out.println("|  [2] Campeoes   |");
                            System.out.println("|  [3] Sair       |");
                            System.out.println("|-----------------|");
                            System.out.println("Qual vc deseja saber sobre");
                            int campeonato = ler.nextInt();
                            switch (campeonato){
                                case 1:
                                    champions.Historia();
                                    break;
                                case 2:
                                    champions.Campeoes();
                                    break;
                                case 3:
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Insira um numero VALIDO!!!");
                            }
                            break;
                        case 2:
                            System.out.println("|----------------|");
                            System.out.println("| [1] Historia   |");
                            System.out.println("| [2] Campeoes   |");
                            System.out.println("| [3] Sair       |");
                            System.out.println("|----------------|");
                            System.out.println("Qual vc deseja saber sobre");
                            int liberta = ler.nextInt();
                            switch (liberta){
                                case 1:
                                    libertadores.Historia();
                                    break;
                                case 2:
                                    libertadores.Campeoes();
                                    break;
                                case 3:
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Insira um numero VALIDO!!!");
                            }
                            break;
                        case 3:
                            System.out.println("|----------------|");
                            System.out.println("| [1] Historia   |");
                            System.out.println("| [2] Campeoes   |");
                            System.out.println("| [3] Sair       |");
                            System.out.println("|----------------|");
                            System.out.println("Qual vc deseja saber sobre");
                            int mundial = ler.nextInt();
                            switch (mundial){
                                case 1:
                                    mundialDeClubes.Historia();
                                    break;
                                case 2:
                                    mundialDeClubes.Campeoes();
                                    break;
                                case 3:
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Insira um numero VALIDO!!!");
                            }
                            break;
                        case 4:
                            System.out.println();
                            System.out.println("|---------------------|");
                            System.out.println("|  [1] Premier league |");
                            System.out.println("|  [2] La Liga        |");
                            System.out.println("|  [3] Bundesliga     |");
                            System.out.println("|  [4] Brasileirao    |");
                            System.out.println("|  [5] Ligue 1        |");
                            System.out.println("|  [6] Serie A TIM    |");
                            System.out.println("|  [7] Sair           |");
                            System.out.println("|---------------------|");
                            System.out.println("Qual liga voce quer saber sobre? ");
                            int liga = ler.nextInt();
                            switch (liga) {
                                case 1:
                                    nacionais.PremierLeague();
                                    break;
                                case 2:
                                    nacionais.LaLiga();
                                    break;
                                case 3:
                                    nacionais.Bundesliga();
                                    break;
                                case 4:
                                    nacionais.Brasileirao();
                                    break;
                                case 5:
                                    nacionais.Ligue1();
                                    break;
                                case 6:
                                    nacionais.SerieATIM();
                                    break;
                                case 7:
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Digite um numero VALIDO!!!");
                            }
                            break;
                        case 5:
                            System.exit(0);
                        default:
                            System.out.println("Digite um numero VALIDO!!!");
                    }
                    break;
                case 3:
                    System.out.println("|-------------------------|");
                    System.out.println("|  [1] Campeos da Copa    |");
                    System.out.println("|  [2] Historia da Copa   |");
                    System.out.println("|  [3] Sair               |");
                    System.out.println("|-------------------------|");
                    System.out.println("  Qual deseja ver? ");
                    int copas = ler.nextInt();
                    switch (copas){
                        case 1:
                            copa.Campeoes();
                            break;
                        case 2:
                            copa.Historia();
                            break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Digite um numero VALIDO!!!");
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("|-----------------------|");
                    System.out.println("|  [1] Brasileirao      |");
                    System.out.println("|  [2] Premier League   |");
                    System.out.println("|  [3] La Liga          |");
                    System.out.println("|  [4] Bundesliga       |");
                    System.out.println("|  [5] Serie A TIM      |");
                    System.out.println("|  [6] Ligue 1          |");
                    System.out.println("|  [7] Sair             |");
                    System.out.println("|-----------------------|");
                    System.out.println("Qual tabela deseja ver?  ");
                    int tabela = ler.nextInt();
                    switch (tabela) {
                        case 1:
                            System.out.println("|-----------------------|");
                            System.out.println("|      Brasileirao      |");
                            System.out.println("|-----------------------|");
                            System.out.println("|  [1] Temporada 2022   |");
                            System.out.println("|  [2] Temporada 2021   |");
                            System.out.println("|-----------------------|");
                            System.out.println("Qual ano voce deseja ver? ");
                            int brasil = ler.nextInt();
                            switch (brasil) {
                                case 1:
                                    brasileirao.tabela2022();
                                    break;
                                case 2:
                                    brasileirao.tabela2021();
                                    break;
                                default:
                                    System.out.println("Digite um numero VALIDO!!!");
                            }
                            break;
                        case 2:
                            System.out.println("|----------------------------|");
                            System.out.println("|       Premier League       |");
                            System.out.println("|----------------------------|");
                            System.out.println("|  [1] Temporada 2021-2022   |");
                            System.out.println("|  [2] temporada xxxx-xxxx   |");
                            System.out.println("|----------------------------|");
                            System.out.println("Qual ano voce deseja ver? ");
                            int ing = ler.nextInt();
                            switch (ing) {
                                case 1:
                                    prem.tabela2021();
                                    break;
                                case 2:

                                    break;
                                default:
                                    System.out.println("Digite um numero VALIDO!!!");
                            }
                            break;
                        case 3:
                            System.out.println("|-------------|");
                            System.out.println("|   La Liga   |");
                            System.out.println("|-------------|");
                            System.out.println("|  [1] ano1   |");
                            System.out.println("|  [2] ano2   |");
                            System.out.println("|-------------|");
                            System.out.println("Qual ano voce deseja ver? ");
                            int esp = ler.nextInt();
                            switch (esp) {
                                case 1:

                                    break;
                                case 2:

                                    break;
                                default:
                                    System.out.println("Digite um numero VALIDO!!!");
                            }
                            break;
                        case 4:
                            System.out.println("|--------------|");
                            System.out.println("|  Bundesliga  |");
                            System.out.println("|--------------|");
                            System.out.println("|  [1] ano1    |");
                            System.out.println("|  [2] ano2    |");
                            System.out.println("|--------------|");
                            System.out.println("Qual ano voce deseja ver? ");
                            int ale = ler.nextInt();
                            switch (ale) {
                                case 1:

                                    break;
                                case 2:

                                    break;
                                default:
                                    System.out.println("Digite um numero VALIDO!!!");
                            }
                            break;
                        case 5:
                            System.out.println("|-------------|");
                            System.out.println("| Serie A TIM |");
                            System.out.println("|-------------|");
                            System.out.println("|  [1] ano1   |");
                            System.out.println("|  [2] ano2   |");
                            System.out.println("|-------------|");
                            System.out.println("Qual ano voce deseja ver? ");
                            int ita = ler.nextInt();
                            switch (ita) {
                                case 1:

                                    break;
                                case 2:

                                    break;
                                default:
                                    System.out.println("Digite um numero VALIDO!!!");
                            }
                            break;
                        case 6:
                            System.out.println("|-------------|");
                            System.out.println("|   Ligue 1   |");
                            System.out.println("|-------------|");
                            System.out.println("|  [1] ano1   |");
                            System.out.println("|  [2] ano2   |");
                            System.out.println("|-------------|");
                            System.out.println("Qual ano voce deseja ver? ");
                            int fran = ler.nextInt();
                            switch (fran) {
                                case 1:

                                    break;
                                case 2:

                                    break;
                                default:
                                    System.out.println("Digite um numero VALIDO!!!");
                            }
                            break;
                        case 7:
                            System.exit(0);
                        default:
                            System.out.println("Digite um numero VALIDO!!!");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Insira um numero VALIDO!!!");
            }

            System.out.println("Deseja Voltar ao menu? (S/N)");

        }while(ler.next().equalsIgnoreCase("S"));
    }
}