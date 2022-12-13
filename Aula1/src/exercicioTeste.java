import java.util.Scanner;

public class exercicioTeste {
    public static void main(String[] args) {
        boolean continuar;
        String meses;
        int mes = 0;
        int ano = 0;

        do {
            continuar = false;
            try {
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite um o numero do mes: ");
                mes = ler.nextInt();
                continuar = mes > 0 && mes <= 12;
            } catch (Exception e){
            }
        } while (!continuar);

        do {
            try {
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite o ano: ");
                ano = ler.nextInt();
                continuar = ano > 0;
            } catch (Exception e){
            }
        } while (!continuar);

        switch (mes) {
            case 1: meses = "Janeiro";
                    break;
            case 2: meses = "Fevereiro";
                    break;
            case 3: meses = "Marco";
                break;
            case 4: meses = "Abril";
                break;
            case 5: meses = "Maio";
                break;
            case 6: meses = "Junho";
                break;
            case 7: meses = "Julho";
                break;
            case 8: meses = "Agosto";
                break;
            case 9: meses = "Setembro";
                break;
            case 10: meses = "Outubro";
                break;
            case 11: meses = "Novembro";
                break;
            case 12: meses = "Dezembro";
                break;
            default: meses = "Mes invalido";
                break;
        }
        System.out.println(meses);

        int numDias = 0;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDias = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDias = 30;
                break;
            case 2:
                if (((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0))
                    numDias = 29;
                else
                    numDias = 28;
                break;
            default:
                System.out.println("Mes Invalido");
                break;
        }
        System.out.println("Numero de dias: " + numDias);
    }
}