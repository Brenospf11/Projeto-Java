import java.util.Scanner;

public class exercicio11novo2 {
    public static void main(String[] args){

         double salario = 0;
         boolean continuar;

         do {
             try {
                 Scanner ler =new Scanner(System.in);
                 System.out.println("Digite o seu Salario: ");
                 salario = ler.nextDouble();
                 continuar = true;
             } catch (Exception e) {
                 continuar = false;
             }
         } while (!continuar);

        if (salario <= 1212 ) {
            calculo1(salario);
        } else if (salario <= 2437.35) {
           calculo2(salario);
        } else if (salario <= 3641.03) {
            calculo3(salario);
        } else if (salario <= 7087.22) {
            calculo4(salario);
        } else {
            System.out.println("A contribuicao do INSS foi: 828.38");
        }
    }
    static void calculo1 (double salario){
        double resultado = salario * 0.075;
        System.out.println("A contribuicao do INSS foi: " + resultado);
    }
    static void calculo2 (double salario){
        double resultado = (salario - 1212) * 0.09 + 90.90;
        System.out.println("A contribuicao do INSS foi: " + resultado);
    }
    static void calculo3 (double salario){
        double resultado = (salario - 2427.35) * 0.12 + 90.90 + 109.38;
        System.out.println("A contribuicao do INSS foi: " + resultado);
    }
    static void calculo4 (double salario){
        double resultado = (salario - 3641.03) * 0.14 + 90.90 + 109.38 + 145.65;
        System.out.println("A contribuicao do INSS foi: " + resultado);
    }
}
