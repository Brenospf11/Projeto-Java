import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;


public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de nomes que voce quer (tem que ser divisivel por 3): ");
        int limite = ler.nextInt();

        if (limite % 3 != 0){
            System.out.println("O numero tem que ser divisivel por 3!");
        } else {
            int quantidades = limite / 3;

            String[] nomesPedidos = new String[limite];
            for (int i = 0; i < limite; i++){
                System.out.println("digite o proximo nome: ");
                nomesPedidos[i] = ler.next();
            }

            List<String> nomesLista = Arrays.asList(nomesPedidos);
            Collections.shuffle(nomesLista);
            String[] nomesEmbaralhados = nomesLista.toArray(nomesPedidos);

            int indexador = 0;
            for (int j = 0; j < quantidades; j++) {
                int numeroGrupo = j + 1;
                System.out.printf("Grupo %d: \n", numeroGrupo);
                for (int k = 0; k < 3; k++) {
                    System.out.println(nomesEmbaralhados[indexador]);
                    indexador++;
                }
            }
        }
    }

}
