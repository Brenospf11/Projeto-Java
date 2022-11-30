import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);



        System.out.printf("Digite um nuemro: ");
        int valor = ler.nextInt();

        for (int i = 1; i <= valor; i++) {
            System.out.print(i + "-");

            for (int ia = 1; i >= ia; ia++) {
                System.out.print("#");
            }

            System.out.printf("\n");
        }
    }
}
