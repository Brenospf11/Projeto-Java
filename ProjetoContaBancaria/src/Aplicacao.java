import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean continuar;
        ContaInvestimentoPJ INPJ = new ContaInvestimentoPJ();
        ContaInvestimentoPF INPF = new ContaInvestimentoPF();
        ContaCorrentePJ CONPJ = new ContaCorrentePJ();
        ContaCorrentePF CONPF = new ContaCorrentePF();
        ContaPoupanca POU = new ContaPoupanca();

        do {
            continuar = false;
            try {
                System.out.println("\n----------*** BEM VINDO AO BANCO START TECH ***----------");
                System.out.println();
                System.out.println("[1] Pessoa Física");
                System.out.println("[2] Pessoa Jurídica");
                System.out.println("[3] Sair");
                System.out.println("\nEscolha qual tipo de conta você deseja atendimento: ");
                int Dados = ler.nextInt();
                switch (Dados) {
                    case 1:
                        POU.Perguntas();
                        System.out.println("\nDigite 1 para acessar o menu da conta:");
                        int numero = ler.nextInt();
                        switch (numero) {
                            case 1:
                                POU.imprimir();
                                System.out.println("\n________________________________________");
                                System.out.println("[1] Conta Corrente");
                                System.out.println("[2] Conta Poupança");
                                System.out.println("[3] Conta Investimento");
                                System.out.println("[4] Voltar");
                                System.out.println("[5] Sair");
                                System.out.println("\nEscolha qual operação você deseja realizar (PF):");
                                int PF = ler.nextInt();
                                switch (PF) {
                                    case 1:
                                        CONPF.operacao();
                                        CONPF.realizar();
                                        break;
                                    case 2:
                                        POU.operacao();
                                        POU.realizar();
                                        break;
                                    case 3:
                                        INPF.operacao();
                                        INPF.realizar();
                                        break;
                                    case 4:


                                    case 5:
                                        System.exit(0);

                                    default:
                                        System.out.println("\nSELECIONE UMA OPÇÃO VALIDA!!!");
                                }
                        }

                    case 2:
                        INPJ.Perguntas();
                        System.out.println("Digite 1");
                        int Pessoas1 = ler.nextInt();
                        switch (Pessoas1) {
                            case 1:
                            System.out.println("________________________________________");
                            System.out.println("[1] Conta Corrente");
                            System.out.println("[2] Conta Investimento");
                            System.out.println("[3] Voltar");
                            System.out.println("[4] Sair");
                            System.out.println("\nEscolha qual operação você deseja realizar (PJ):");
                            int PJ = ler.nextInt();
                            switch (PJ) {
                                case 1:
                                    CONPJ.operacao();
                                    CONPJ.realizar();
                                    break;
                                case 2:
                                        System.out.println(INPJ.toString());
                                        INPJ.operacao();
                                        INPJ.realizar();
                                        break;
                                case 3:


                                case 4:
                                    System.exit(0);

                                default:
                                    System.out.println("");
                            }
                        }
                }
            }   catch(Exception e){}

                System.out.println("\nVocê deseja realizar mais alguma operação ? (S/N)");

            } while(ler.next().equalsIgnoreCase("S"));
        }
    }
