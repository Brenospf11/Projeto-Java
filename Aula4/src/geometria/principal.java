package geometria;

/* SOBRECARGA (OVERLOAD)
É a possibilidade de se reutilizar metodos com o mesmo nome,
mas com "assinaturas" diferentes, dentro da mesma classe
É uma das formas de se utilizar o Polimorfismo (muitas formas)
 */

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        geometria g = new geometria();
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");
        double r = ler.nextDouble();
        System.out.println("Area calculada: " + g.calcular(r));


        System.out.println("Informe os dois lados do retangulo: ");
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        System.out.println("Area do retangulo: " + g.calcular(a, b));
    }
}