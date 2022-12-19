import java.util.Scanner;

public class exercicio13novo {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        boolean continuar;
        int valor = 0;

        do {
            continuar = false;
            try {
                ler = new Scanner(System.in);
                System.out.printf("Digite um numero: ");
                valor = ler.nextInt();
                continuar = valor > 0;
            } catch(Exception e){
            }
        } while(!continuar);

        for (int i = 1; i <= valor; i++) {
            System.out.print(i + "-");

            for (int ia = 1; i >= ia; ia++) {
                System.out.print("#");
            }

            System.out.printf("\n");
        }

    }
}
