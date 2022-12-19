import java.util.Scanner;

public class exercicio6novo {
    public static void main(String[] args){
        Scanner ler;
        boolean continuar;
        double profI = 0; double profF = 0; double comp = 0; double lar = 0;

        do {
            continuar = false;
            try {
                ler = new Scanner(System.in);
                System.out.print("insira a largura ");
                lar = ler.nextDouble();
                continuar = lar >= 0.1;
            } catch (Exception e){
            }
        } while(!continuar);

        do {
            continuar = false;
            try {
                ler = new Scanner(System.in);
                System.out.print("Insira o comprimento ");
                comp = ler.nextDouble();
                continuar = comp >= 0.1;
            } catch (Exception e){
            }
        } while(!continuar);

        do {
            continuar = false;
            try {
                ler = new Scanner(System.in);
                System.out.print("Insira a profundidade inicial ");
                profI = ler.nextDouble();
                continuar = profI >= 0.1;
            } catch (Exception e){
            }
        } while(!continuar);

        do {
            continuar = false;
            try {
                ler = new Scanner(System.in);
                System.out.print("Insira a profundidade final ");
                profF = ler.nextDouble();
                continuar = profF > 0.1;
            } catch (Exception e){
            }
        } while(!continuar);

        double calc = ((profI * profF) / 2) * lar * comp * 1000;

        System.out.println("O resultado é: " + calc);


    }
}
