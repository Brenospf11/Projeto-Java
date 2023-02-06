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
        } else if(clube.equalsIgnoreCase("Chelsea")) {
            Chelsea();
        } else if(clube.equalsIgnoreCase("Arsenal")) {
            Arsenal();
        } else if(clube.equalsIgnoreCase("Tottenham")) {
            Tottenham();
        } else if(clube.equalsIgnoreCase("Newcastle")) {
            Newcastle();
        } else if(clube.equalsIgnoreCase("NottinghamForest")) {
            NottinghamForest();
        } else if(clube.equalsIgnoreCase("AstonVilla")) {
            AstonVilla();
        } else if(clube.equalsIgnoreCase("Leicester")) {
            LeicesterCity();
        }
    }
    public void Liverpool() {
        System.out.println("██      ██ ██    ██ ███████ ██████  ██████   ██████   ██████  ██      \n" +
                "██      ██ ██    ██ ██      ██   ██ ██   ██ ██    ██ ██    ██ ██      \n" +
                "██      ██ ██    ██ █████   ██████  ██████  ██    ██ ██    ██ ██      \n" +
                "██      ██  ██  ██  ██      ██   ██ ██      ██    ██ ██    ██ ██      \n" +
                "███████ ██   ████   ███████ ██   ██ ██       ██████   ██████  ███████ \n" +
                "                                                                      ");
        System.out.println();
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                          Sobre                                                                          |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O Liverpool Football Club, ou da forma reduzida L.F.C., é um clube de futebol, com sede na cidade de Liverpool, Noroeste da Inglaterra.");
        System.out.println("Fundado em 1892, ingressou na Football League no ano seguinte e desde então atua no Anfield Road. Seu uniforme, que originalmente adotava camisas vermelhas");
        System.out.println("e calções brancos, é todo vermelho desde 1965. O lema do clube é \"You'll Never Walk Alone\" (\"Você jamais caminhará sozinho\", em tradução livre).");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                         Titulos                                                                            |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |           Campeonato           |                                             Temporadas                                          |");
        System.out.println("|   1x    | Mundial de Clubes              | 2019                                                                                            |");
        System.out.println("|   6x    | Liga dos Campeoes da UEFA      | 1976–77, 1977–78, 1980–81, 1983–84, 2004–05 e 2018–19                                           |");
        System.out.println("|   3x    | Liga Europa da UEFA            | 1972–73, 1975–76 e 2000–01                                                                      |");
        System.out.println("|   4x    | Supercopa da UEFA              | 1977, 2001, 2005 e 2019                                                                         |");
        System.out.println("|   19x   | Campeonato Ingles              | 1900–01, 1905–06, 1921–22, 1922–23, 1946–47, 1963–64, 1965–66, 1972–73, 1975–76, 1976–77        |");
        System.out.println("|                                            1978–79, 1979–80, 1981–82, 1982–83, 1983–84, 1985–86, 1987–88, 1989–90 e 2019–20                |");
        System.out.println("|   8x    | Copa da Inglaterra             | 1964–65, 1973–74, 1985–86, 1988–89, 1991–92, 2000–01, 2005–06 e 2021–22                         |");
        System.out.println("|   9x    | Copa da Liga Inglesa           | 1980–81, 1981–82, 1982–83, 1983–84, 1994–95, 2000–01, 2002–03, 2011–12 e 2021–22                |");
        System.out.println("|   16x   | Supercopa da Inglaterra        | 1964, 1965, 1966, 1974, 1976, 1977, 1979, 1980, 1982, 1986, 1988, 1989, 1990, 2001, 2006 e 2022 |");
        System.out.println("|   4x    | Campeonato Ingles - 2ª Divisao | 1893–94, 1895–96, 1904–05 e 1961–62                                                             |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }
    public void ManchesterUnited() {
        System.out.println("███    ███  █████  ███    ██  ██████ ██   ██ ███████ ███████ ████████ ███████ ██████      ██    ██ ███    ██ ██ ████████ ███████ ██████  \n" +
                "████  ████ ██   ██ ████   ██ ██      ██   ██ ██      ██         ██    ██      ██   ██     ██    ██ ████   ██ ██    ██    ██      ██   ██ \n" +
                "██ ████ ██ ███████ ██ ██  ██ ██      ███████ █████   ███████    ██    █████   ██████      ██    ██ ██ ██  ██ ██    ██    █████   ██   ██ \n" +
                "██  ██  ██ ██   ██ ██  ██ ██ ██      ██   ██ ██           ██    ██    ██      ██   ██     ██    ██ ██  ██ ██ ██    ██    ██      ██   ██ \n" +
                "██      ██ ██   ██ ██   ████  ██████ ██   ██ ███████ ███████    ██    ███████ ██   ██      ██████  ██   ████ ██    ██    ███████ ██████  \n" +
                "                                                                                                                                         ");
        System.out.println();
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                 Sobre                                                                                                                                                                   |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O Manchester United Football Club é um clube inglês, sediado em Trafford, na região metropolitana de Manchester, sendo um dos times mais populares e mais bem sucedidos da Inglaterra e do mundo.");
        System.out.println("É conhecido como \"Diabos Vermelhos\", bem como por abreviações de seu nome, como Manchester Utd, Man United, Man Utd e United. Em muitos lugares, é referido como \"o Manchester\" ou apenas como o \"UNITED\" assim referido pela grande maioria dos fãs.");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                Titulos                                                                                 |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |           Campeonato           |                                             Temporadas                                                      |");
        System.out.println("|   2x    | Mundial de Clubes              | 1999 e 2008                                                                                                 |");
        System.out.println("|   3x    | Liga dos Campeoes da UEFA      | 1967–68, 1998–99 e 2007–08                                                                                  |");
        System.out.println("|   1x    | Liga Europa da UEFA            | 2016-17                                                                                                     |");
        System.out.println("|   1x    | Supercopa da UEFA              | 1991                                                                                                        |");
        System.out.println("|   20x   | Campeonato Ingles              | 1907–08, 1910–11, 1951–52, 1955–56, 1956–57, 1964–65, 1966–67, 1992–93, 1993–94, 1995–96                    |");
        System.out.println("|                                            1996-97, 1998–99, 1999–00, 2000–01, 2002–03, 2006–07, 2007–08, 2008–09, 2010–11 e 2012–13                   |");
        System.out.println("|   12x   | Copa da Inglaterra             | 1908–09, 1947–48, 1962–63, 1976–77, 1982–83, 1984–85, 1989–90, 1993–94, 1995–96, 1998–99, 2003–04 e 2015–16 |");
        System.out.println("|   5x    | Copa da Liga Inglesa           | 1991–92, 2005–06, 2008–09, 2009–10 e 2016–17                                                                |");
        System.out.println("|   21x   | Supercopa da Inglaterra        | 1908, 1911, 1952, 1956, 1957, 1965, 1967, 1977, 1983, 1990, 1993                                            |");
        System.out.println("|                                            1994, 1996, 1997, 2003, 2007, 2008, 2010, 2011, 2013 e 2016                                                 |");
        System.out.println("|   2x    | Campeonato Ingles - 2ª Divisao | 1935–36 e 1974–75                                                                                           |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }
    public void ManchesterCity() {
        System.out.println("███    ███  █████  ███    ██  ██████ ██   ██ ███████ ███████ ████████ ███████ ██████       ██████ ██ ████████ ██    ██ \n" +
                "████  ████ ██   ██ ████   ██ ██      ██   ██ ██      ██         ██    ██      ██   ██     ██      ██    ██     ██  ██  \n" +
                "██ ████ ██ ███████ ██ ██  ██ ██      ███████ █████   ███████    ██    █████   ██████      ██      ██    ██      ████   \n" +
                "██  ██  ██ ██   ██ ██  ██ ██ ██      ██   ██ ██           ██    ██    ██      ██   ██     ██      ██    ██       ██    \n" +
                "██      ██ ██   ██ ██   ████  ██████ ██   ██ ███████ ███████    ██    ███████ ██   ██      ██████ ██    ██       ██    \n" +
                "                                                                                                                    ");
        System.out.println();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                           Sobre                                                                                                                                                                               |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("Manchester City Football Club ou simplesmente Manchester City é um clube de futebol inglês, fundado em 1880 sob o nome de FC St. Mark's (West Gorton) tornando-se posteriormente Ardwick Association Football Club, e finalmente, no dia 16 de abril de 1894, no seu nome atual.");
        System.out.println("Disputa atualmente a Premier League, tendo a sua sede em Manchester, no Noroeste da Inglaterra.");
        System.out.println("É considerado um dos maiores clubes da Inglaterra. O City é um dos clubes mais antigos e tradicionais da Inglaterra, passou a maior parte de sua história na Primeira Divisão do futebol inglês, nesse tempo são 92 temporadas na primeira divisão até a Temporada 2020-21,");
        System.out.println("a primeira delas sendo na temporada 1899–1900, 25 temporadas na segunda, e uma temporada na terceira; já na Premier League essa é sua 23ª temporada na principal divisão do futebol inglês, desde a criação da Liga (1992-93, o clube foi um dos seus 22 membros fundadores).");
        System.out.println("No ranking de pontos conquistados na história do Campeonato Inglês o City é o sexto colocado.");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                   Titulos                                                          |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |           Campeonato           |                               Temporadas                                |");
        System.out.println("|   8x    | Campeonato Ingles              | 1936–37, 1967–68, 2011–12, 2013–14, 2017–18, 2018–19, 2020–21 e 2021–22 |");
        System.out.println("|   6x    | Copa da Inglaterra             | 1903–04, 1933–34, 1955–56, 1968–69, 2010–11 e 2018–19                   |");
        System.out.println("|   8x    | Copa da Liga Inglesa           | 1969–70, 1975–76, 2013–14, 2015–16, 2017–18, 2018–19, 2019–20 e 2020–21 |");
        System.out.println("|   6x    | Supercopa da Inglaterra        | 1937, 1968, 1972, 2012, 2018 e 2019                                     |");
        System.out.println("|   7x    | Campeonato Ingles - 2ª Divisao | 1898–99, 1902–03, 1909–10, 1927–28, 1946–47, 1965–66 e 2001–02          |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }
    public void Chelsea() {
        System.out.println(" ██████ ██   ██ ███████ ██      ███████ ███████  █████  \n" +
                "██      ██   ██ ██      ██      ██      ██      ██   ██ \n" +
                "██      ███████ █████   ██      ███████ █████   ███████ \n" +
                "██      ██   ██ ██      ██           ██ ██      ██   ██ \n" +
                " ██████ ██   ██ ███████ ███████ ███████ ███████ ██   ██ \n" +
                "                                                        ");
        System.out.println();
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                              Sobre                                                                                                                                                 |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O Chelsea Football Club (pronúncia em inglês: [tʃɛlsi]) é um dos maiores clubes de futebol da Inglaterra, sediado na cidade de Londres, fundado em 10 de março de 1905.");
        System.out.println("Internacionalmente, é um dos três clubes mais vitoriosos do futebol inglês, ao lado do Liverpool e Manchester United. Conquistou o Mundial de Clubes da FIFA em 2021, a Liga dos Campeões da UEFA em 2012 e 2021,");
        System.out.println("a Liga Europa da UEFA em 2013 e 2019, a Recopa Europeia da UEFA em 1971 e 1998 e a Supercopa da UEFA em 1998 e 2021. No âmbito nacional, é um dos cinco clubes mais bem-sucedidos da Inglaterra, com seis títulos do Campeonato Inglês,");
        System.out.println("oito títulos da Copa da Inglaterra, cinco títulos da Copa da Liga Inglesa, dois títulos da Copa de Membros Ingleses e quatro títulos da Supercopa da Inglaterra.");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                    Titulos                                                         |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |           Campeonato           |                             Temporadas                                  |");
        System.out.println("|   1x    | Mundial de Clubes              | 2021                                                                    |");
        System.out.println("|   2x    | Liga dos Campeoes da UEFA      | 2011-12 e 2020-21                                                       |");
        System.out.println("|   2x    | Liga Europa da UEFA            | 2012-13 e 2018-19                                                       |");
        System.out.println("|   2x    | Supercopa da UEFA              | 1998 e 2021                                                             |");
        System.out.println("|   6x    | Campeonato Ingles              | 1954–55, 2004-05, 2005–06, 2009–10, 2014–15 e 2016–17                   |");
        System.out.println("|   8x    | Copa da Inglaterra             | 1969–70, 1996–97, 1999–00, 2006–07, 2008–09, 2009–10, 2011–12 e 2017–18 |");
        System.out.println("|   5x    | Copa da Liga Inglesa           | 1964–65, 1997–98, 2004–05, 2006–07 e 2014–15                            |");
        System.out.println("|   4x    | Supercopa da Inglaterra        | 1955, 2000, 2005 e 2009                                                 |");
        System.out.println("|   2x    | Campeonato Ingles - 2ª Divisao | 1983–84 e 1988–89                                                       |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }

    public void Arsenal() {
        System.out.println(" █████  ██████  ███████ ███████ ███    ██  █████  ██      \n" +
                "██   ██ ██   ██ ██      ██      ████   ██ ██   ██ ██      \n" +
                "███████ ██████  ███████ █████   ██ ██  ██ ███████ ██      \n" +
                "██   ██ ██   ██      ██ ██      ██  ██ ██ ██   ██ ██      \n" +
                "██   ██ ██   ██ ███████ ███████ ██   ████ ██   ██ ███████ \n" +
                "                                                          ");
        System.out.println();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                           Sobre                                                                       |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("Arsenal Football Club é um clube de futebol, fundado e baseado em Londres, capital da Inglaterra.");
        System.out.println("O clube disputa a Premier League e é um dos mais bem sucedidos do futebol de seu país, tendo ganho por 13 vezes o título de campeão do Campeonato Inglês,");
        System.out.println("sendo o terceiro em número de conquistas, e por 14 vezes a Copa da Inglaterra (recorde), é o único a ganhar a Premier League de maneira invicta,");
        System.out.println("sendo também detentor do recorde de maior período de invencibilidade na liga nacional. No plano internacional, conquistou a Recopa Europeia da UEFA e");
        System.out.println("a Taça das Cidades com Feiras, já tendo sido finalista da Liga dos Campeões da UEFA, a principal competição europeia de clubes.");
        System.out.println();
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                       Titulos                                                                                    |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |        Campeonato       |                                                 Temporadas                                                                   |");
        System.out.println("|   13x   | Campeonato Ingles       | 1930–31, 1932–33, 1933–34, 1934–35, 1937–38, 1947–48, 1952–53, 1970–71, 1988–89, 1990–91, 1997–98, 2001–02, 2003–04          |");
        System.out.println("|   14x   | Copa da Inglaterra      | 1929–30, 1935–36, 1949–50, 1970–71, 1978–79, 1992–93, 1997–98, 2001–02, 2002–03, 2004–05, 2013–14, 2014–15, 2016–17, 2019–20 |");
        System.out.println("|   2x    | Copa da Liga Inglesa    | 1986-87, 1992-93                                                                                                             |");
        System.out.println("|   16x   | Supercopa da Inglaterra | 1930, 1931, 1933, 1934, 1938, 1948, 1953, 1991, 1998, 1999, 2002, 2004, 2014, 2015, 2017, 2020                               |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }
    public void Tottenham() {
        System.out.println("████████  ██████  ████████ ████████ ███████ ███    ██ ██   ██  █████  ███    ███ \n" +
                "   ██    ██    ██    ██       ██    ██      ████   ██ ██   ██ ██   ██ ████  ████ \n" +
                "   ██    ██    ██    ██       ██    █████   ██ ██  ██ ███████ ███████ ██ ████ ██ \n" +
                "   ██    ██    ██    ██       ██    ██      ██  ██ ██ ██   ██ ██   ██ ██  ██  ██ \n" +
                "   ██     ██████     ██       ██    ███████ ██   ████ ██   ██ ██   ██ ██      ██");
        System.out.println();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                              Sobre                                                                                                                                            |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O Tottenham Hotspur Football Club (mais conhecido como Tottenham ou Spurs) é um clube de futebol inglês, com sede no bairro de Tottenham, no norte de Londres.");
        System.out.println("O Tottenham Hotspur Football Club conquistou o Campeonato Inglês 2 vezes, a Copa da Inglaterra 8 vezes, a Copa da Liga 4 vezes, a Supercopa da Inglaterra 7 vezes, a Copa da UEFA 2 vezes e a Recopa Europeia da UEFA 1 vez.");
        System.out.println("Além dos títulos de campeão conquistados o Tottenham foi vice-campeão inglês em 1922, 1952, 1957, 1963 e 2017, vice da Copa da Inglaterra em 1987, vice da Copa da Liga em 1982, 2002 e 2009, além de vice da Copa da UEFA em 1973-74.");
        System.out.println("Na Liga dos Campeões da UEFA, principal competição de clubes da Europa, suas melhores colocações foram o terceiro lugar em 1962, derrotado pelo campeão Benfica nas semifinais pelo placar agregado de 3 a 4 e o vice-campeonato em 2019,");
        System.out.println("na derrota para o também inglês Liverpool por 2 a 0.");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                  Titulos                                                           |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |         Campeonato             |                         Temporadas                                      |");
        System.out.println("|   2x    | Liga Europa da UEFA            | 1971–72 e 1983–84                                                       |");
        System.out.println("|   2x    | Campeonato Ingles              | 1950–51 e 1960–61                                                       |");
        System.out.println("|   8x    | Copa da Inglaterra             | 1900–01, 1920–21, 1960–61, 1961–62, 1966–67, 1980–81, 1981–82 e 1990–91 |");
        System.out.println("|   4x    | Copa da Liga Inglesa           | 1970–71, 1972–73, 1998–99 e 2007–08                                     |");
        System.out.println("|   7x    | Supercopa da Inglaterra        | 1921, 1951, 1961, 1962, 1967, 1981 e 1991                               |");
        System.out.println("|   2x    | Campeonato Ingles - 2ª Divisao | 1919–20 e 1949–50                                                       |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }

    public void Newcastle() {
        System.out.println("███    ██ ███████ ██     ██  ██████  █████  ███████ ████████ ██      ███████ \n" +
                "████   ██ ██      ██     ██ ██      ██   ██ ██         ██    ██      ██      \n" +
                "██ ██  ██ █████   ██  █  ██ ██      ███████ ███████    ██    ██      █████   \n" +
                "██  ██ ██ ██      ██ ███ ██ ██      ██   ██      ██    ██    ██      ██      \n" +
                "██   ████ ███████  ███ ███   ██████ ██   ██ ███████    ██    ███████ ███████ \n" +
                "                                                                             ");
        System.out.println();
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                                                    Sobre                                                                                                                                                                                                                             |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O clube foi fundado em 1892 após a fusão de dois clubes locais: o Newcastle East End Football Club e o West End Newcastle Football Club. Desde a sua fundação, a equipe sempre jogou as suas partidas no St. James' Park e ganhou por quatro vezes o Campeonato Inglês, além de seis títulos da Copa da Inglaterra e, o mais relevante, a Taça das Cidades com Feiras.");
        System.out.println("Suas cores tradicionais são o preto e branco em camisas listradas, com calção e meias pretas. Seus torcedores se auto denominam como o Toon Army.[1] Sua crista tem elementos da cidade brasão de armas, que apresenta dois Cavalos-Marinhos cinza.");
        System.out.println("Antes de cada jogo em casa, a equipe entra em campo com a música (local hero) \"Herói local\", e \"Corridas de Blaydon\" também é cantado durante os jogos.");
        System.out.println("O filme de 2005 GOL! - O sonho impossível. Destaca o Newcastle United, e muitos creditam o filme por aumentar a popularidade do clube entre jogadores e fãs.");
        System.out.println("Newcastle tem uma rivalidade de longa data com as proximidades Sunderland, com o qual contesta o Tyne – Wear derby desde 1898. Além desse, o Middlesbrough, com quem disputa o clássico Tyne–Tees derby.");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------------------------------|");
        System.out.println("|                                             Titulos                                              |");
        System.out.println("|--------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |           Campeonato           |                     Temporadas                        |");
        System.out.println("|   4x    | Campeonato Ingles              | 1904–05, 1906–07, 1908–09 e 1926–27                   |");
        System.out.println("|   6x    | Copa da Inglaterra             | 1909–10, 1923–24, 1931–32, 1950–51, 1951–52 e 1954–55 |");
        System.out.println("|   1x    | Supercopa da Inglaterra        | 1909                                                  |");
        System.out.println("|   4x    | Campeonato Ingles - 2ª Divisao | 1964–65, 1992–93, 2009–10 e 2016–17                   |");
        System.out.println("|--------------------------------------------------------------------------------------------------|");
        System.out.println();
    }

    public void NottinghamForest() {
        System.out.println("███    ██  ██████  ████████ ████████ ██ ███    ██  ██████  ██   ██  █████  ███    ███     ███████  ██████  ██████  ███████ ███████ ████████ \n" +
                "████   ██ ██    ██    ██       ██    ██ ████   ██ ██       ██   ██ ██   ██ ████  ████     ██      ██    ██ ██   ██ ██      ██         ██    \n" +
                "██ ██  ██ ██    ██    ██       ██    ██ ██ ██  ██ ██   ███ ███████ ███████ ██ ████ ██     █████   ██    ██ ██████  █████   ███████    ██    \n" +
                "██  ██ ██ ██    ██    ██       ██    ██ ██  ██ ██ ██    ██ ██   ██ ██   ██ ██  ██  ██     ██      ██    ██ ██   ██ ██           ██    ██    \n" +
                "██   ████  ██████     ██       ██    ██ ██   ████  ██████  ██   ██ ██   ██ ██      ██     ██       ██████  ██   ██ ███████ ███████    ██    \n" +
                "                                                                                                                                          ");
        System.out.println();
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                                      Sobre                                                                                                                                                                                                                        |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O Nottingham Forest Football Club é um clube inglês da região de Nottingham. Venceu a Premier League 1 vez e a Liga dos Campeões por 2 ocasiões. O clube é frequentemente referido simplesmente como Forest, nome presente no símbolo do clube. Eles também são apelidados de “Reds”, devido à cor da sua camisa.");
        System.out.println("Os maiores rivais da equipa são o Derby County e o Leicester City, embora o seu vizinho mais próximo seja o Notts County.");
        System.out.println("Fundado em 1865, o Forest se tornou membro fundador da Aliança de Futebol em 1888 e seu primeiro grande sucesso veio quando venceu a Copa da Inglaterra em 1898. O clube passou boa parte da primeira metade do século XX jogando a segunda divisão inglesa e o seu próximo título veio em 1959, quando ganhou novamente a Copa da Inglaterra.");
        System.out.println();
        System.out.println("|---------------------------------------------------------------------------------------|");
        System.out.println("|                                            Titulos                                    |");
        System.out.println("|---------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |              Campeonato               |              Temporadas             |");
        System.out.println("|   2x    | Liga dos Campeoes da UEFA             | 1978–79 e 1979–80                   |");
        System.out.println("|   1x    | Supercopa da UEFA                     | 1979                                |");
        System.out.println("|   1x    | Campeonato Ingles                     | 1977-78                             |");
        System.out.println("|   2x    | Copa da Inglaterra                    | 1897–98 e 1958–59                   |");
        System.out.println("|   4x    | Copa da Liga Inglesa                  | 1977–78, 1978–79, 1988–89 e 1989–90 |");
        System.out.println("|   1x    | Supercopa da Inglaterra               | 1978                                |");
        System.out.println("|   3x    | Campeonato Ingles - 2ª Divisao        | 1906–07, 1921–22 e 1997–98          |");
        System.out.println("|   1x    | Campeonato Ingles - 3ª Divisao Acesso | 1950-51                             |");
        System.out.println("|---------------------------------------------------------------------------------------|");
        System.out.println();
    }
    public void AstonVilla() {
        System.out.println(" █████  ███████ ████████  ██████  ███    ██     ██    ██ ██ ██      ██       █████  \n" +
                "██   ██ ██         ██    ██    ██ ████   ██     ██    ██ ██ ██      ██      ██   ██ \n" +
                "███████ ███████    ██    ██    ██ ██ ██  ██     ██    ██ ██ ██      ██      ███████ \n" +
                "██   ██      ██    ██    ██    ██ ██  ██ ██      ██  ██  ██ ██      ██      ██   ██ \n" +
                "██   ██ ███████    ██     ██████  ██   ████       ████   ██ ███████ ███████ ██   ██ ");
        System.out.println();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                            Sobre                                                                                                                  |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O Aston Villa Football Club (por vezes apelidado de Villa, The Villa, The Villans e The Lions) é um clube de futebol inglês sediado na cidade de Birmingham, que atualmente joga a Premier League.");
        System.out.println("Fundado em 21 de novembro de 1874 por membros de um time de críquete, manda os jogos em seu estádio, o Villa Park, desde 1897. O Villa foi um dos fundadores da primeira liga de futebol do mundo, a Football League,");
        System.out.println("em 1888 e também foi um dos membros fundadores da Premier League em 1992.");
        System.out.println();
        System.out.println("|-----------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                     Titulos                                               |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |          Campeonato            |                           Temporadas                           |");
        System.out.println("|   1x    | Liga dos Campeoes da UEFA      | 1981-82                                                        |");
        System.out.println("|   1x    | Supercopa da UEFA              | 1982                                                           |");
        System.out.println("|   7x    | Campeonato Ingles              | 1893–94, 1895–96, 1896–97, 1898–99, 1899–00, 1909–10 e 1980–81 |");
        System.out.println("|   7x    | Copa da Inglaterra             | 1886–87, 1894–95, 1896–97, 1904–05, 1912–13, 1919–20 e 1956–57 |");
        System.out.println("|   5x    | Copa da Liga Inglesa           | 1960–61, 1974–75, 1976–77, 1993–94 e 1995–96                   |");
        System.out.println("|   2x    | Supercopa da Inglaterra        | 1957 e 1981                                                    |");
        System.out.println("|   2x    | Campeonato Ingles - 2ª Divisao | 1937–38 e 1959–60                                              |");
        System.out.println("|   2x    | Campeonato Ingles - 3ª Divisao | 1971-72                                                        |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }
    public void LeicesterCity() {
        System.out.println("██      ███████ ██  ██████ ███████ ███████ ████████ ███████ ██████       ██████ ██ ████████ ██    ██ \n" +
                "██      ██      ██ ██      ██      ██         ██    ██      ██   ██     ██      ██    ██     ██  ██  \n" +
                "██      █████   ██ ██      █████   ███████    ██    █████   ██████      ██      ██    ██      ████   \n" +
                "██      ██      ██ ██      ██           ██    ██    ██      ██   ██     ██      ██    ██       ██    \n" +
                "███████ ███████ ██  ██████ ███████ ███████    ██    ███████ ██   ██      ██████ ██    ██       ██  ");
        System.out.println();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                                Sobre                                                                                                                                                                                                                          |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O Leicester City Football Club (AFI: /ˌlɛstər ˈsɪti/) é um clube de futebol inglês da cidade de Leicester, que manda seus jogos no King Power Stadium, cuja capacidade é de 32.273 pessoas.");
        System.out.println("Atualmente participa da Premier League, tendo sido promovido da Segunda Divisão na Temporada de 2013-14. O Leicester City conquistou o Campeonato Inglês na Temporada de 2015-16 com uma surpreendente campanha de 38 jogos, 23 vitórias, 12 empates e apenas 3 derrotas, após quase ter sido rebaixado na Temporada de 2014-15.");
        System.out.println("O Leicester City ainda possuí 3 conquistas da Copa da Liga Inglesa nas temporadas 1963–64, 1996–97 e 1999–00, também tem 2 títulos conquistados da Supercopa da Inglaterra na temporadas 1971 e 2021 e 1 conquista da Copa da Inglaterra na temporada 2020–21, considerando os seus títulos mais importantes.");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------------------|");
        System.out.println("|                                         Titulos                                      |");
        System.out.println("|--------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |              Campeonato               |              Temporadas            |");
        System.out.println("|   1x    | Campeonato Ingles                     | 2015-16                            |");
        System.out.println("|   1x    | Copa da Inglaterra                    | 2020-21                            |");
        System.out.println("|   3x    | Copa da Liga Inglesa                  | 1963–64, 1996–97 e 1999–00         |");
        System.out.println("|   2x    | Supercopa da Inglaterra               | 1971 e 2021                        |");
        System.out.println("|   7x    | Campeonato Ingles - 2ª Divisao Acesso | 1924–25, 1936–37, 1953–54, 1956–57 |");
        System.out.println("|                                                   1970–71, 1979–80 e 2013–14         |");
        System.out.println("|   1x    | Campeonato Ongles - 3ª Divisao Acesso | 2008–09                            |");
        System.out.println("|--------------------------------------------------------------------------------------|");
        System.out.println();
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
