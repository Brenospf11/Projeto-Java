import java.util.Scanner;

public class exercicio12novo {
    public static void main(String[] args){
        Scanner ler;
        int valor = 0;
        boolean continuar;

        do {
            continuar = false;
            try {
                ler = new Scanner(System.in);
                System.out.printf("Digite um numero: ");
                valor = ler.nextInt();
                if (valor <= 0){
                    continuar = false;
                } else {
                    continuar = true;
                }
            } catch (Exception e) {
            }
        } while (!continuar);

        for (int i=1; i < valor; i = i + 2) {
            System.out.println(i);
        }
    }
}
