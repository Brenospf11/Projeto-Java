import  java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int[] valor = new int[4];
        int maior = 0;

        for(int i = 0; i < valor.length; i++){
            System.out.print("Digite o " +(i+1)+"º preco: ");
            valor[i] = sc.nextInt();
            if(valor[i] > maior){
                maior = valor[i];
            }
        }


        System.out.println("Maior valor = "+ maior);
    }
}
