import java.util.Scanner;

public class exercicioTeste2 {
    public static void main(String[] args){
      int numero;
      int num;
      numero = teste();

      for (num = 0; num < 10; num++){

          System.out.println(numero + " x " + num + " = " + numero * num);
      }
    }
    static int teste (){
        int numero = 0;
        boolean continuar;
        do {
            try {
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite um numero: ");
                numero = ler.nextInt();
                continuar = true;

//        Numero negativos
//              if (numero < 0) {
//                  continuar = false;
//              } else {
//                  continuar = true;
//              }

            } catch (Exception e){
                continuar = false;
            }
        } while (!continuar);
        return numero;
    }
}
