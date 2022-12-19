import java.util.Scanner;

public class boletimEntrda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boletim bole = new boletim();

        do {
            bole.entradaDadosNovo();
            bole.calculoMedia();

            System.out.println("Deseja calcular outra materia? (S/N) ");
        } while (ler.nextLine().equalsIgnoreCase("S"));
    }
}