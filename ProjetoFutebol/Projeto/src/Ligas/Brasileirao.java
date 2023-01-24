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
        } else if(clube.equalsIgnoreCase("Saopaulo")){
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
        System.out.println(" ██████  ██████  ███████ ███    ███ ██  ██████  \n" +
                "██       ██   ██ ██      ████  ████ ██ ██    ██ \n" +
                "██   ███ ██████  █████   ██ ████ ██ ██ ██    ██ \n" +
                "██    ██ ██   ██ ██      ██  ██  ██ ██ ██    ██ \n" +
                " ██████  ██   ██ ███████ ██      ██ ██  ██████ ");
        System.out.println();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                                            Sobre                                                                                                                                                  |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O Grêmio Foot-Ball Porto Alegrense (conhecido apenas por Grêmio e cuja sigla é FBPA) é um clube de futebol brasileiro da cidade de Porto Alegre, no Rio Grande do Sul, fundado em 15 de setembro de 1903 por ");
        System.out.println("Candido Dias da Silva. É considerado um dos maiores clubes do Brasil e da América do Sul. Suas cores são azul, preto e branco. O clube tem como alcunhas ");
        System.out.println("Imortal Tricolor, Tricolor dos Pampas, Tricolor Gaúcho, Rei de Copas e Clube de Todos.");
        System.out.println("Já foi campeão da Copa Libertadores da América em três ocasiões, o que o torna o clube brasileiro com mais conquistas nesta competição, ao lado dos paulistas Palmeiras, São Paulo e Santos, e vice em duas outras oportunidades.");
        System.out.println("Foi o primeiro clube fora da região Sudeste a conquistar títulos de dimensão continental e mundial, sendo campeão da América e do Mundo em 1983. Também é bicampeão da Recopa Sul-Americana, tendo conquistado este torneio em todas as vezes em que o disputou.");
        System.out.println("Conquistou ainda dois Campeonatos Brasileiros da Série A, um Campeonato Brasileiro da Série B, cinco Copas do Brasil e uma Supercopa do Brasil, além de uma Copa Sul e um Campeonato Sul-Brasileiro.");
        System.out.println("No âmbito estadual, já foi campeão quarenta e uma vezes do Campeonato Gaúcho, três vezes da Recopa Gaúcha e uma vez da Copa FGF.");
        System.out.println("O clube ocupa, em 2021, a terceira colocação no ranking da CBF e a mesma colocação no ranking da Conmebol.");
        System.out.println("Além do time profissional de futebol masculino, o clube conta com categorias de base masculinas do sub-8 ao sub-20, uma equipe de transição e uma equipe feminina.");
        System.out.println("O clube já revelou vários futebolistas de renome internacional ao longo de sua história, como Arthur, Everton, Emerson, Lucas Leiva, Douglas Costa, Renato Portaluppi, Anderson, Ânderson Polga e Ronaldinho Gaúcho.");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------------------------------|");
        System.out.println("|                                           Titulos                                                |");
        System.out.println("|--------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |          Competicao             |                    Temporadas                        |");
        System.out.println("|   1x    | Copa Intercontinental           | 1983                                                 |");
        System.out.println("|   3x    | Copa Libertadores da America    | 1983, 1995 e 2017                                    |");
        System.out.println("|   2x    | Recopa Sul-Amricana             | 1996 e 2018                                          |");
        System.out.println("|   2x    | Campeonato Brasileiro           | 1981 e 1996                                          |");
        System.out.println("|   5x    | Copa do Brasil                  | 1989, 1994, 1997, 2001 e 2016                        |");
        System.out.println("|   1x    | Campeonato Brasileiro - Serie B | 2005                                                 |");
        System.out.println("|   4x    | Recopa Gaucha                   | 2019, 2021, 2022 e 2023                              |");
        System.out.println("|   41x   | Campeonato Gaucho               | 1921, 1922, 1926, 1931, 1932, 1946, 1949, 1956       |");
        System.out.println("|                                             1957, 1958, 1959, 1960, 1962, 1963, 1964, 1965       |");
        System.out.println("|                                             1966, 1967, 1968, 1977, 1979, 1980, 1985, 1986       |");
        System.out.println("|                                             1987, 1988, 1989, 1990, 1993, 1995, 1996, 1999, 2001 |");
        System.out.println("|                                             2006, 2007, 2010, 2018, 2019, 2020, 2021 e 2022      |");
        System.out.println("|--------------------------------------------------------------------------------------------------|");
        System.out.println();
    }
    public void Flamengo() {
        System.out.println("███████ ██       █████  ███    ███ ███████ ███    ██  ██████   ██████  \n" +
                "██      ██      ██   ██ ████  ████ ██      ████   ██ ██       ██    ██ \n" +
                "█████   ██      ███████ ██ ████ ██ █████   ██ ██  ██ ██   ███ ██    ██ \n" +
                "██      ██      ██   ██ ██  ██  ██ ██      ██  ██ ██ ██    ██ ██    ██ \n" +
                "██      ███████ ██   ██ ██      ██ ███████ ██   ████  ██████   ██████  ");
        System.out.println();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                                                           Sobre                                                                                                                 |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O Clube de Regatas do Flamengo (mais conhecido simplesmente como Flamengo, e popularmente pelos apelidos de Mengo, Mengão e Fla) é uma agremiação poliesportiva brasileira com sede na cidade do Rio de Janeiro, capital do estado de mesmo nome.");
        System.out.println("Fundado no bairro do Flamengo para disputas do esporte remo em 17 de novembro de 1895, tornou-se um dos clubes mais bem-sucedidos e populares do esporte brasileiro, especialmente pelo futebol.");
        System.out.println("Tem como suas cores tradicionais o vermelho e o preto e como seus maiores rivais esportivos o Vasco da Gama, o Fluminense e o Botafogo.");
        System.out.println("Dentre suas maiores glórias no futebol, destacam-se as conquistas da Copa Intercontinental (único time carioca a ter conquistado um título de dimensão mundial reconhecido pela FIFA) ");
        System.out.println("e das Copas Libertadores da América de 1981, 2019 e 2022 (único time carioca a ter conquistado por três vezes a competição,");
        System.out.println("e um dos sete do Brasil a tê-la conquistado mais de uma vez), além de uma Recopa Sul-Americana, uma Copa Mercosul e uma Copa de Ouro Nicolás Leoz, o que lhe confere a quarta posição no ranking de títulos internacionais de clubes brasileiros.");
        System.out.println("Em se tratando de Copa Libertadores da América o Flamengo é o quarto com maior aproveitamento na competição, além de ser o clube com o melhor desempenho considerando apenas duelos entre equipes brasileiras até 2019.");
        System.out.println();
        System.out.println("|------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                Titulos                                                           |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |          Competicao          |                                 Temporadas                              |");
        System.out.println("|   1x    | Copa Intercontinental        | 1981                                                                    |");
        System.out.println("|   3x    | Copa Libertadores da America | 1981, 2019 e 2022                                                       |");
        System.out.println("|   1x    | Recopa Sul-Americana         | 2020                                                                    |");
        System.out.println("|   7x    | Campeonato Brasileiro        | 1980, 1982, 1983, 1992, 2009, 2019 e 2020                               |");
        System.out.println("|   4x    | Copa do Brasil               | 1990, 2006, 2013 e 2022                                                 |");
        System.out.println("|   2x    | Supercopa do Brasil          | 2020 e 2021                                                             |");
        System.out.println("|   9x    | Taca Rio                     | 1983, 1985, 1986, 1991, 1996, 2000, 2009, 2011 e 2019                   |");
        System.out.println("|   23x   | Taca Guanabara               | 1970, 1972, 1973, 1978, 1979, 1980, 1981, 1982, 1984, 1988, 1989        |");
        System.out.println("|                                          1995, 1996, 1999, 2001, 2004, 2007, 2008, 2011, 2014, 2018, 2020 e 2021 |");
        System.out.println("|   37x   | Campeonato Carioca           | 1914, 1915, 1920, 1921, 1925, 1927, 1939, 1942, 1943, 1944              |");
        System.out.println("|                                          1953, 1954, 1955, 1963, 1965, 1972, 1974, 1978                          |");
        System.out.println("|                                          1979, 1979, 1981, 1986, 1991, 1996, 1999, 2000, 2001, 2004, 2007        |");
        System.out.println("|                                          2008, 2009, 2011, 2014, 2017, 2019, 2020 e 2021                         |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }
    public void Internacional() {
        System.out.println("██ ███    ██ ████████ ███████ ██████  ███    ██  █████   ██████ ██  ██████  ███    ██  █████  ██      \n" +
                "██ ████   ██    ██    ██      ██   ██ ████   ██ ██   ██ ██      ██ ██    ██ ████   ██ ██   ██ ██      \n" +
                "██ ██ ██  ██    ██    █████   ██████  ██ ██  ██ ███████ ██      ██ ██    ██ ██ ██  ██ ███████ ██      \n" +
                "██ ██  ██ ██    ██    ██      ██   ██ ██  ██ ██ ██   ██ ██      ██ ██    ██ ██  ██ ██ ██   ██ ██      \n" +
                "██ ██   ████    ██    ███████ ██   ██ ██   ████ ██   ██  ██████ ██  ██████  ██   ████ ██   ██ ███████ ");
        System.out.println();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                            Sobre                                                                                                                                    |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("O Sport Club Internacional (mais conhecido como Internacional e popularmente pelos apelidos de Colorado e Inter de Porto Alegre) é um clube multiesportivo brasileiro com sede na cidade de Porto Alegre, capital do Rio Grande do Sul.");
        System.out.println("Foi fundado em 4 de abril de 1909, pelos irmãos Poppe, com o objetivo de ser uma instituição democrática e sem preconceitos. Tem como suas cores o vermelho e o branco e seus torcedores são conhecidos como Colorados.");
        System.out.println("No futebol, é um dos clubes mais vitoriosos do Brasil e das Américas, sendo o terceiro maior campeão internacional do país, com sete conquistas oficiais, superado somente por Santos e São Paulo.[12][13] ");
        System.out.println("Suas maiores conquistas foram as do Mundial de Clubes da FIFA, em 2006, e os dois títulos da Copa Libertadores da América, em 2006 e 2010, além de uma Copa Sul-Americana de forma invicta, em 2008,");
        System.out.println("dois títulos da Recopa Sul-Americana, em 2007 e 2011, e uma Levain Cup/CONMEBOL (Copa Suruga Bank), em 2009.");
        System.out.println();
        System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                               Titulos                                                           |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |          Campeonato          |                                Temporadas                              |");
        System.out.println("|   1x    | Mundial de Clubes            | 2006                                                                   |");
        System.out.println("|   2x    | Copa Libertadores da America | 2006 e 2010                                                            |");
        System.out.println("|   1x    | Copa Sul-Americana           | 2008                                                                   |");
        System.out.println("|   2x    | Recopa Sul-Americana         | 2007 e 2011                                                            |");
        System.out.println("|   3x    | Campeonato Brasileiro        | 1975, 1976, 1979                                                       |");
        System.out.println("|   1x    | Copa do Brasil               | 1992                                                                   |");
        System.out.println("|   2x    | Recopa Caucha                | 2016 e 2017                                                            |");
        System.out.println("|   45x   | campeonato Gaucho            | 1927, 1934, 1940, 1941, 1942, 1943, 1944, 1945, 1947, 1948, 1950, 1951 |");
        System.out.println("|                                          1952, 1953, 1955, 1961, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976 |");
        System.out.println("|                                          1978, 1981, 1982, 1983, 1984, 1991, 1992, 1994, 1997, 2002, 2003, 2004 |");
        System.out.println("|                                          2005, 2008, 2009, 2011, 2012, 2013, 2014, 2015 e 2016                  |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }

    public void Vasco() {
        System.out.println("██    ██  █████  ███████  ██████  ██████  \n" +
                "██    ██ ██   ██ ██      ██      ██    ██ \n" +
                "██    ██ ███████ ███████ ██      ██    ██ \n" +
                " ██  ██  ██   ██      ██ ██      ██    ██ \n" +
                "  ████   ██   ██ ███████  ██████  ██████ ");
        System.out.println();
        System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                                             Sobre                                                                                                                                                                                  |");
        System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("Club de Regatas Vasco da Gama ComC • MHM • EmMJK • MNVG • MMDM • MAPAM • MT • MSFA (mais conhecido apenas por Vasco e cujo acrônimo é CRVG) é uma entidade sócio-poliesportiva brasileira com sede na cidade do Rio de Janeiro, fundada em 21 de agosto de 1898 por um grupo de remadores.");
        System.out.println("Inspirados nas celebrações do quarto centenário da descoberta do caminho marítimo para as Índias, ocorrida em 1498, batizaram a nova agremiação com o nome do navegador português que alcançou tal feito, Vasco da Gama.");
        System.out.println("Apesar de ter sido fundado como um \"clube de regatas\", consagrando-se no remo como um dos maiores campeões do continente, o Vasco da Gama ainda abrange outras modalidades como atletismo, vôlei de praia, basquete, futebol de areia, dentre outros, ");
        System.out.println("tendo como esporte mais tradicional o futebol. As cores do Vasco guardam forte significação: o preto remete aos mares desconhecidos do Oriente, desbravados por Vasco da Gama, enquanto o branco da faixa diagonal refere-se à rota descoberta pelo almirante.");
        System.out.println("Além disso, estas são cores que se encaixam na ideia de uma comunhão de etnias (já que foi o primeiro clube do Brasil a lutar contra preconceitos raciais e sociais),");
        System.out.println("tendo sido o primeiro na história dos clubes esportivos do Brasil a ter elegido um presidente \"não branco\" (em 1904, numa época em que o racismo contra negros era prática comum no esporte, os vascaínos tiveram a honra de conduzir o mulato Cândido José de Araújo ao degrau mais alto do clube).");
        System.out.println("A Cruz, principal símbolo, tem forte aspecto religioso, porque a Ordem Militar de Cristo era ao mesmo tempo religiosa e guerreira.");
        System.out.println();
        System.out.println("|---------------------------------------------------------------------------------------------|");
        System.out.println("|                                            Titulos                                          |");
        System.out.println("|---------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |           Campeonato            |                  Temporadas                     |");
        System.out.println("|   1x    | Copa Libertadores da America    | 1998                                            |");
        System.out.println("|   1x    | Copa Mercosul                   | 2000                                            |");
        System.out.println("|   4x    | Campeonato Brasileiro           | 1974, 1989, 1997 e 2000                         |");
        System.out.println("|   1x    | Copa do Brasil                  | 2011                                            |");
        System.out.println("|   1x    | Campeonato Brasileiro - Serie B | 2009                                            |");
        System.out.println("|   12x   | Taca Guanabara                  | 1976, 1977, 1986, 1987, 1990, 1992              |");
        System.out.println("|                                             1994, 1998, 2000, 2003, 2016 e 2019             |");
        System.out.println("|   11x   | Taca Rio                        | 1984, 1988, 1992, 1993, 1998, 1999              |");
        System.out.println("|                                             2001, 2003, 2004, 2017 e 2021                   |");
        System.out.println("|   24x   | Campeonato Carioca              | 1923, 1924, 1929, 1934, 1936, 1945, 1947, 1949  |");
        System.out.println("|                                             1950, 1952, 1956, 1958, 1970, 1977, 1982, 1987  |");
        System.out.println("|                                             1988, 1992, 1993, 1994, 1998, 2003, 2015 e 2016 |");
        System.out.println("|---------------------------------------------------------------------------------------------|");
    }
    public void Fluminense() {
        System.out.println("███████ ██      ██    ██ ███    ███ ██ ███    ██ ███████ ███    ██ ███████ ███████ \n" +
                "██      ██      ██    ██ ████  ████ ██ ████   ██ ██      ████   ██ ██      ██      \n" +
                "█████   ██      ██    ██ ██ ████ ██ ██ ██ ██  ██ █████   ██ ██  ██ ███████ █████   \n" +
                "██      ██      ██    ██ ██  ██  ██ ██ ██  ██ ██ ██      ██  ██ ██      ██ ██      \n" +
                "██      ███████  ██████  ██      ██ ██ ██   ████ ███████ ██   ████ ███████ ███████ \n" +
                "                                                                                  ");
        System.out.println();
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                                       Sobre                                                                                                                                         |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("Fluminense Football Club é uma agremiação poliesportiva e cultural sediada no bairro de Laranjeiras, Zona Sul da cidade do Rio de Janeiro, no Brasil, fundada em 21 de julho de 1902.");
        System.out.println("É uma sociedade civil de caráter desportivo, que tem como principal atividade o futebol.");
        System.out.println("Um dos quatro grandes clubes do Rio de Janeiro, primeiro entre os doze grandes do futebol brasileiro a entrar em campo e a ostentar a palavra futebol no nome, ");
        System.out.println("o Fluminense é o clube que mais disputou campeonatos estaduais no Brasil, tendo sido presente em todas as edições do Campeonato Carioca de Futebol desde 1906, vencendo em trinta e duas ocasiões.");
        System.out.println("Em competições nacionais é um dos times mais bem-sucedidos, com quatro títulos do Campeonato Brasileiro de Futebol, no qual o Fluminense é também o clube do Rio de Janeiro com mais presenças entre os quatro primeiros, e uma Copa do Brasil,");
        System.out.println("tendo participado de três finais. Em competições internacionais, além da conquista da Copa Rio de 1952 o Fluminense ostenta dois vice-campeonatos em competições da Conmebol, na Copa Libertadores da América de 2008 e na Copa Sul-Americana de 2009.");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                Titulos                                                       |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos | Campeonato                      |                           Temporadas                             |");
        System.out.println("|   4x    | Campeonato Brasileiro           | 1970, 1984, 2010 e 2012                                          |");
        System.out.println("|   1x    | Copa do Brasil                  | 2007                                                             |");
        System.out.println("|   1x    | Campeonato Brasileiro - Serie C | 1999                                                             |");
        System.out.println("|   3x    | Taca Guanabara                  | 1966, 1969 e 1971                                                |");
        System.out.println("|   32x   | Campeonato Carioca              | 1906, 1907, 1908, 1909, 1911, 1917, 1918, 1919, 1924, 1936, 1937 |");
        System.out.println("|                                             1938, 1940, 1941, 1946, 1951, 1959, 1964, 1969, 1971, 1973, 1975 |");
        System.out.println("|                                             1976, 1980, 1983, 1984, 1985, 1995, 2002, 2005, 2012 e 2022      |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }
    public void Palmeiras() {
        System.out.println("██████   █████  ██      ███    ███ ███████ ██ ██████   █████  ███████ \n" +
                "██   ██ ██   ██ ██      ████  ████ ██      ██ ██   ██ ██   ██ ██      \n" +
                "██████  ███████ ██      ██ ████ ██ █████   ██ ██████  ███████ ███████ \n" +
                "██      ██   ██ ██      ██  ██  ██ ██      ██ ██   ██ ██   ██      ██ \n" +
                "██      ██   ██ ███████ ██      ██ ███████ ██ ██   ██ ██   ██ ███████ \n" +
                "                                                                      ");
        System.out.println();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                            Sobre                                                                                                                        |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("Sociedade Esportiva Palmeiras (pronúncia em português: [sosiedˈadʒi ispoɾtʃˈivə pawmˈejɾəs], conhecida popularmente como Palmeiras) é um clube poliesportivo brasileiro da cidade de São Paulo, capital do estado homônimo.");
        System.out.println("Foi fundado em 26 de agosto de 1914 e suas cores, presentes no escudo e bandeira oficial, são o verde e branco. O vermelho, presente desde sua fundação em 1914,");
        System.out.println("foi excluído durante a Segunda Guerra Mundial, por pressão do governo nacional, na mesma reunião que formalizou a mudança de nome de Palestra Itália para Palmeiras.");
        System.out.println("Tem como modalidade esportiva principal o futebol, como um dos clubes mais vencedores e de maior relevância em todo o continente, além de estar entre aqueles com maior torcida do país.");
        System.out.println("Seus títulos mais importantes conquistados no futebol são as Copas Libertadores da América de 1999, 2020 e de 2021, e a Copa Rio de 1951, considerado na época como um Mundial de Clubes de futebol e");
        System.out.println("reconhecido como tal pela FIFA, por meio do presidente da entidade, Joseph Blatter, em agosto de 2014, sendo uma decisão do Comitê Executivo da FIFA de 7 de junho e");
        System.out.println("por meio de documento encaminhado ao Ministério do Esporte do Brasil em novembro do mesmo ano. A entidade, no entanto, não reconhece a competição como um torneio FIFA e reforçou este posicionamento em outubro de 2017,");
        System.out.println("quando reconheceu os vencedores da Copa Intercontinental como campeões mundiais, sem, também, promover a unificação da Copa Intercontinental com a sua atual competição.");
        System.out.println();
        System.out.println("|---------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                     Titulos                                                         |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |            Campeonato           |                                Temporadas                               |");
        System.out.println("|   3x    | Copa Libertadores da America    | 1999, 2020 e 2021                                                       |");
        System.out.println("|   1x    | Copa Mercosul                   | 1998                                                                    |");
        System.out.println("|   1x    | Recopa Sul-Americana            | 2022                                                                    |");
        System.out.println("|   11x   | Campeonato Brasileiro           | 1960, 1967, 1967, 1969, 1972, 1973, 1993, 1994, 2016, 2018 e 2022       |");
        System.out.println("|   4x    | Copa do Brasil                  | 1998, 2012, 2015 e 2020                                                 |");
        System.out.println("|   2x    | Campeonato Brasileiro - Serie B | 2003 e 2013                                                             |");
        System.out.println("|   24x   | Campeonato Paulista             | 1920, 1926, 1927, 1932, 1933, 1934, 1936, 1940, 1942, 1944, 1947, 1950  |");
        System.out.println("|                                             1959, 1963, 1966, 1972, 1974, 1976, 1993, 1994, 1996, 2008, 2020 e 2022 |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
    }

    public void Corinthias() {
        System.out.println(" ██████  ██████  ██████  ██ ███    ██ ████████ ██   ██ ██  █████  ███████ \n" +
                "██      ██    ██ ██   ██ ██ ████   ██    ██    ██   ██ ██ ██   ██ ██      \n" +
                "██      ██    ██ ██████  ██ ██ ██  ██    ██    ███████ ██ ███████ ███████ \n" +
                "██      ██    ██ ██   ██ ██ ██  ██ ██    ██    ██   ██ ██ ██   ██      ██ \n" +
                " ██████  ██████  ██   ██ ██ ██   ████    ██    ██   ██ ██ ██   ██ ███████ \n" +
                "                                                                        ");
        System.out.println();
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                                        Sobre                                                                                                     |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("Sport Club Corinthians Paulista ( português brasileiro:  [isˈpɔɾtʃi ˈklubi koˈɾĩtʃɐ̃s pawˈlistɐ]) é um clube esportivo brasileiro com sede no distrito de Tatuapé , em São Paulo.");
        System.out.println("Apesar de competir em vários esportes diferentes, o Corinthians é conhecido principalmente por seu time de futebol profissional que joga no Campeonato Brasileiro Série A, a primeira divisão do futebol brasileiro,");
        System.out.println("bem como no Campeonato Paulista Série A1, primeira divisão da tradicional competição estadual.");
        System.out.println("Fundado em 1910 por cinco ferroviários inspirados no Corinthian Football Club, de Londres, o Corinthians se tornou um dos clubes brasileiros de maior sucesso , tendo conquistado o título nacional sete vezes,");
        System.out.println("além de três troféus da Copa do Brasil , uma Supercopa do Brasil e um recorde de 30 campeonatos paulistas.");
        System.out.println("No cenário internacional, o clube conquistou o primeiro Mundial de Clubes da FIFA em 2000 , conquistando-o pela segunda vez em 2012 após sagrar-se campeão da Copa Libertadores da América pela primeira vez naquele mesmo ano.");
        System.out.println();
        System.out.println("|---------------------------------------------------------------------------------------------------|");
        System.out.println("|                                              Titulos                                              |");
        System.out.println("|---------------------------------------------------------------------------------------------------|");
        System.out.println("| Titulos |            Campeonato           |                        Temporadas                     |");
        System.out.println("|   1x    | Copa Libertadores da America    | 2012                                                  |");
        System.out.println("|   1x    | Recopa Sul-Americana            | 2013                                                  |");
        System.out.println("|   2x    | Mundial de Clubes               | 2000 e 2012                                           |");
        System.out.println("|   7x    | Campeonato Brasileiro           | 1990, 1998, 1999, 2005, 2011, 2015 e 2017             |");
        System.out.println("|   3x    | Copa do Brasil                  | 1995, 2002 e 2009                                     |");
        System.out.println("|   1x    | Supercopa do Brasil             | 1991                                                  |");
        System.out.println("|   1x    | Campeonato Brasileiro - Serie B | 2008                                                  |");
        System.out.println("|   30x   | Campeonato Paulista             | 1914 , 1916 , 1922 , 1923 , 1924 , 1928 , 1929 , 1930 |");
        System.out.println("|                                             1937 , 1938 , 1939 , 1941 , 1951 , 1952 , 1954 , 1977 |");
        System.out.println("|                                             1979 , 1982 , 1983 , 1988 , 1995 , 1997 , 1999 , 2001 |");
        System.out.println("|                                             2003 , 2009 , 2013, 2017 , 2018 , 2019                |");
        System.out.println("|---------------------------------------------------------------------------------------------------|");
        System.out.println();
    }
    public void SaoPaulo() {
        System.out.println("███████  █████   ██████      ██████   █████  ██    ██ ██       ██████  \n" +
                "██      ██   ██ ██    ██     ██   ██ ██   ██ ██    ██ ██      ██    ██ \n" +
                "███████ ███████ ██    ██     ██████  ███████ ██    ██ ██      ██    ██ \n" +
                "     ██ ██   ██ ██    ██     ██      ██   ██ ██    ██ ██      ██    ██ \n" +
                "███████ ██   ██  ██████      ██      ██   ██  ██████  ███████  ██████  \n" +
                "                                                                       ");
        System.out.println();
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                                                                                                                                 Sobre                                                                                                                                     |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("São Paulo Futebol Clube é um clube poliesportivo brasileiro da cidade de São Paulo, capital do estado homônimo. Foi fundado em 25 de janeiro de 1930,");
        System.out.println("tendo interrompido suas atividades em maio de 1935, e as retomado em dezembro do mesmo ano.");
        System.out.println("No futebol, é um dos clubes mais bem sucedidos do Brasil, sendo que, dentre seus principais títulos, destacam-se três Mundiais (recorde absoluto a nível nacional), três Copas Libertadores (recorde nacional compartilhado com Flamengo, Grêmio, Palmeiras e Santos),");
        System.out.println("uma Copa Sul-Americana, seis Campeonatos Brasileiros e vinte e dois Campeonatos Paulistas. Quanto a títulos internacionais, o São Paulo, com 12 conquistas, é o terceiro clube da América do Sul com o maior número de troféus, ficando atrás somente de Boca Juniors e Independiente.");
        System.out.println("No que diz respeito ao somatório de títulos oficiais de abrangência nacional e internacional de clubes brasileiros, em janeiro de 2021, o São Paulo figurava como o maior campeão do Brasil, com dezoito conquistas. A agremiação também possui tradição em outros esportes que não o futebol,");
        System.out.println("como no atletismo, no qual seu atleta na modalidade salto triplo, Adhemar Ferreira da Silva, foi o primeiro bicampeão olímpico do país (Olimpíadas de Helsinque em 1952 – em que superou o recorde mundial na modalidade – e Olimpíadas de Melbourne em 1956).");
        System.out.println("Depois de Helsinque, Adhemar superou pela segunda vez o recorde mundial na modalidade, nos Jogos Pan-Americanos do México em 1955. Esses recordes são representados pelas duas estrelas douradas no escudo do clube.");
        System.out.println();
        System.out.println("|----------------------------------------------------------------------------------------|");
        System.out.println("|                                              Titulo                                    |");
        System.out.println("|----------------------------------------------------------------------------------------|");
        System.out.println("| Titulo |           Campeonato         |                     Temporadas                 |");
        System.out.println("|   1x   | Mundial de Clubes            | 2005                                           |");
        System.out.println("|   2x   | Copa Intercontinental        | 1992 e 1993                                    |");
        System.out.println("|   3x   | Copa Libertadores da America | 1992, 1993 e 2005                              |");
        System.out.println("|   1x   | Copa Sul-Americana           | 2012                                           |");
        System.out.println("|   2x   | Recopa Sul-Americana         | 1994 e 1994                                    |");
        System.out.println("|   6x   | Campeonato Brasileiro        | 1977, 1986, 1991, 2006, 2007 e 2008            |");
        System.out.println("|   22x  | Campeonato Paulista          | 1931, 1943, 1945, 1946, 1948, 1949, 1953, 1957 |");
        System.out.println("|                                         1970, 1971, 1975, 1980, 1981, 1985, 1987       |");
        System.out.println("|                                         1989, 1991, 1992, 1998, 2000, 2005 e 2021      |");
        System.out.println("|----------------------------------------------------------------------------------------|");
        System.out.println();
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
        System.out.println("|                         Campeonato Brasileiro de 2022                       |");
        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.println("|      Clube           | Pts  |  PJ  | VIT  |  E   | DER |  GM  |  GC  |  SG  |");
        System.out.println("| 1  Palmeiras         |  81  |  38  |  23  |  12  |  3  |  66  |  27  |  39  |");
        System.out.println("| 2  Internacional     |  73  |  38  |  20  |  13  |  5  |  58  |  31  |  27  |");
        System.out.println("| 3  Fluminense        |  70  |  38  |  21  |  7   |  10 |  63  |  41  |  22  |");
        System.out.println("| 4  Corinthias        |  65  |  38  |  18  |  11  |  9  |  44  |  36  |  8   |");
        System.out.println("| 5  Flamengo          |  62  |  38  |  18  |  8   |  12 |  60  |  39  |  21  |");
        System.out.println("| 6  Athletico-PR      |  58  |  38  |  16  |  10  |  12 |  48  |  48  |  0   |");
        System.out.println("| 7  Atletico-MG       |  58  |  38  |  15  |  13  |  10 |  45  |  37  |  8   |");
        System.out.println("| 8  Fortaleza         |  55  |  38  |  15  |  10  |  13 |  46  |  39  |  7   |");
        System.out.println("| 9  Sao Paulo         |  54  |  38  |  13  |  15  |  10 |  55  |  42  |  13  |");
        System.out.println("| 10 America-MG        |  53  |  38  |  15  |  8   |  15 |  40  |  40  |  0   |");
        System.out.println("| 11 Botafogo          |  53  |  38  |  15  |  8   |  15 |  41  |  43  | -2   |");
        System.out.println("| 12 Santos            |  47  |  38  |  12  |  11  |  15 |  44  |  41  |  3   |");
        System.out.println("| 13 Goais             |  46  |  38  |  11  |  13  |  14 |  40  |  53  | -13  |");
        System.out.println("| 14 Bragantino        |  44  |  38  |  11  |  11  |  16 |  49  |  59  | -10  |");
        System.out.println("| 15 Coritiba          |  42  |  38  |  12  |  6   |  20 |  39  |  60  | -21  |");
        System.out.println("| 16 Cuiaba            |  41  |  38  |  10  |  11  |  17 |  31  |  42  | -11  |");
        System.out.println("| 17 Ceara SC          |  37  |  38  |  7   |  16  |  15 |  34  |  41  | -7   |");
        System.out.println("| 18 Atletico-GO       |  36  |  38  |  8   |  12  |  18 |  39  |  57  | -18  |");
        System.out.println("| 19 Avai              |  35  |  38  |  9   |  8   |  21 |  34  |  60  | -26  |");
        System.out.println("| 20 Juventude         |  22  |  38  |  3   |  13  |  22 |  29  |  69  | -40  |");
        System.out.println("|-----------------------------------------------------------------------------|");
    }
    public void tabela2021(){

        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.println("|                          Capeonato Brasileiro de 2021                       |");
        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.println("|      Clube           | Pts  |  PJ  | VIT  |  E   | DER |  GM  |  GC  |  SG  |");
        System.out.println("| 1  Atletico-MG       |  84  |  38  |  26  |  6   |  6  |  67  |  34  |  33  |");
        System.out.println("| 2  Flamengo          |  71  |  38  |  21  |  8   |  9  |  69  |  36  |  33  |");
        System.out.println("| 3  Palmeiras         |  66  |  38  |  20  |  6   |  12 |  58  |  43  |  15  |");
        System.out.println("| 4  Fortaleza         |  58  |  38  |  17  |  7   |  14 |  44  |  45  | -1   |");
        System.out.println("| 5  Corinthias        |  57  |  38  |  15  |  12  |  11 |  40  |  36  |  4   |");
        System.out.println("| 6  Bragantino        |  56  |  38  |  14  |  14  |  10 |  55  |  46  |  9   |");
        System.out.println("| 7  Fluminense        |  54  |  38  |  15  |  9   |  14 |  38  |  38  |  0   |");
        System.out.println("| 8  America-MG        |  53  |  38  |  13  |  14  |  11 |  41  |  37  |  4   |");
        System.out.println("| 9  Atletico-GO       |  53  |  38  |  13  |  14  |  11 |  33  |  36  | -3   |");
        System.out.println("| 10 Santos            |  50  |  38  |  12  |  14  |  12 |  35  |  40  | -5   |");
        System.out.println("| 11 Ceara SC          |  50  |  38  |  11  |  17  |  10 |  39  |  38  |  1   |");
        System.out.println("| 12 Internacional     |  48  |  38  |  12  |  12  |  14 |  44  |  42  |  2   |");
        System.out.println("| 13 Sao Paulo         |  48  |  38  |  11  |  15  |  12 |  31  |  39  | -8   |");
        System.out.println("| 14 Athletico_PR      |  47  |  38  |  13  |  8   |  17 |  41  |  45  | -4   |");
        System.out.println("| 15 Cuiaba            |  47  |  38  |  10  |  17  |  11 |  34  |  37  | -3   |");
        System.out.println("| 16 Juventude         |  46  |  38  |  11  |  13  |  14 |  36  |  44  | -8   |");
        System.out.println("| 17 Gremio            |  43  |  38  |  12  |  7   |  19 |  44  |  51  | -7   |");
        System.out.println("| 18 Bahia             |  43  |  38  |  11  |  10  |  17 |  42  |  51  | -9   |");
        System.out.println("| 19 Sport Recife      |  38  |  38  |  9   |  11  |  18 |  24  |  37  | -13  |");
        System.out.println("| 20 Chapecoense       |  15  |  38  |  1   |  12  |  25 |  27  |  67  | -40  |");
        System.out.println("|-----------------------------------------------------------------------------|");
    }
}