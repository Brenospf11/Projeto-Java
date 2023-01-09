import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean continuar;
        String Endereco, Telefone, RG, DataDeNascimento, CPF, NomeCompleto;

        do {
            continuar = false;
            try {
                System.out.println("--------------------------");
                System.out.println("[1] Pessoa Fisica");
                System.out.println("[2] Pessoa Juridica");
                System.out.println("[3] Sair");
                System.out.println("Escolha qual vc é: ");
                int Pessoas = ler.nextInt();
                switch (Pessoas) {
                    case 1:
                        System.out.println("------------------------");
                        System.out.println("[1] Conta Corrente");
                        System.out.println("[2] Conta Poupanca");
                        System.out.println("[3] Conta Invesntimento");
                        System.out.println("[4] Sair");
                        System.out.println("Escolha o que voce precisa (PF) : ");
                        int PF = ler.nextInt();
                        switch (PF) {
                            case 1:

                                break;

                            case 2:

                                break;

                            case 3:

                                break;

                            case 4:
                                System.exit(0);

                            default:
                                System.out.println(" Selecione um numero valido! ");
                        }

                    case 2:
                        System.out.println("------------------------");
                        System.out.println("[1] Conta Corrente");
                        System.out.println("[2] Conta Investimento");
                        System.out.println("[3] Sair");
                        System.out.println("Escolha o que voce precisa (PJ) : ");
                        int PJ = ler.nextInt();
                        switch(PJ) {
                            case 1:

                                break;

                            case 2:

                                break;

                            case 3:
                                System.exit(0);

                            default:
                                System.out.println(" Selecione um numero valido! ");
                        }
                    case 3:
                        System.exit(0);

                    default:
                        System.out.println(" Selecione um numero valido! ");
                }
            } catch (Exception e){}
        } while (!continuar);
    }
}