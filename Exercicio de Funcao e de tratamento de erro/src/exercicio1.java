import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o valor da temperatura? ");
        int temp = ler.nextInt();

        boolean continuar;
        String valor = "";

        do {
            continuar = false;
            try {
                Scanner ler1 = new Scanner(System.in);
                System.out.println("Qual a medida? ");
                valor = ler1.nextLine();
                if (valor.toLowerCase().equals('f') || valor.toLowerCase().equals('c')){
                    continuar = true;

                }
            } catch(Exception e) {
            }
        } while (!continuar);


        if (valor.equals("F")) {
            calcularFahreint(temp);
        }
        else if (valor.equals("C")) {
            calcularCelsius(temp);
        }
    }
    static void calcularFahreint(double temp) {
        double F = temp * 1.8 + 32;
        System.out.println("O resultado de Celsius para Fahrenheit é: " + F + "F°");
    }

    static void calcularCelsius(double temp){
        double C = (temp - 32) / 1.8;
        System.out.println("O resultado de Fahrenheit para Celsius é: " + C + "C°");
    }
}