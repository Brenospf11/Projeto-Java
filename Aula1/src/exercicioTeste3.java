import java.util.Scanner;

public class exercicioTeste3 {
    public static void main(String[] args){
        boolean continuar;

        String[] nomes = new String[3];
        int[] idades = new int[3];
        double maisNova = 99;
        String nomeMaisNova = "";
        double maisVelha = 0;
        String nomeMaisVelha = "";

        Scanner ler = new Scanner(System.in);

        for (int i =0; i < 3; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] = ler.next();
            do {
                continuar = false;
                try {
                    Scanner ler1 = new Scanner(System.in);
                    System.out.println("Digite a idade: ");
                    idades[i] = ler1.nextInt();
                    if (idades[i] < 0) {
                        continuar = false;
                    } else {
                        continuar = true;
                    }
                } catch (Exception e) {
                }
            } while (!continuar);
        }

        for (int j = 0; j < 3; j++) {
            if (idades[j] < maisNova) {
                maisNova = idades[j];
                nomeMaisNova = nomes[j];
            }
            if (idades[j] > maisVelha) {
                maisVelha = idades[j];
                nomeMaisVelha = nomes[j];
            }
        }
        double resultado = (maisNova + maisVelha) / 2;

        System.out.println("Nome da pessoa mais nova: " + nomeMaisNova);
        System.out.println("idade  da pessoa mais nova: " + maisNova);
        System.out.println("Nome da pessoa mais velha: " + nomeMaisVelha);
        System.out.println("Idade da pessoa mais velha: " + maisVelha);
        System.out.println("A media da idade é: " + resultado);

    }
}
