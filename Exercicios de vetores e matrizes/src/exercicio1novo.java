import java.util.Scanner;

public class exercicio1novo {
    public static void main(String[] args) {
        Scanner ler1 = new Scanner(System.in);
        boolean continuar;
            do {
                continuar = false;
                try {
                    Scanner ler = new Scanner(System.in);
                    System.out.println("Digite 4 numeros: ");
                    int num = ler.nextInt();
                    if (num < 0) {
                        continuar = false;
                    } else {
                        continuar = true;
                    }
                } catch (Exception e) {
                }
            } while (!continuar);

            int[] numeroLista = new int[4];
            int maior = numeroLista[0], menor = Integer.MAX_VALUE;

            for (int i = 0; i < numeroLista.length; i++) {
                numeroLista[i] = ler1.nextInt();
                if (numeroLista[i] > maior) {
                    maior = numeroLista[i];
                }
            }
            for (int j = 0; j < numeroLista.length; j++) {
                if (numeroLista[j] < menor) {
                    menor = numeroLista[j];
                }
            }
            System.out.println("O maior valor = " + maior);
            System.out.println("O menor valor = " + menor);
    }
}