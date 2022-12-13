import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 4 numero: ");

        int[] numeroLista = new int[4];
        int maior = numeroLista[0], menor = Integer.MAX_VALUE;

        for(int i = 0; i < numeroLista.length; i++) {
            numeroLista[i] = ler.nextInt();
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
