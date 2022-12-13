import java.util.Scanner;

public class exercicioTeste2 {
    public static void main(String[] args){
      int numero = 0;
      int num;
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

      for (num = 0; num < 10; num++){
          System.out.println(numero + " x " + num + " = " + numero * num);
      }
    }
}
