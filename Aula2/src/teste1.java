import java.util.Scanner;

public class teste1 { // NOME DA CLASSE
    Scanner ler = new Scanner(System.in);
    int numero; // ATRIBUTOS
    int op;
    int resultado;

    public void calculartabuada() { // METODO
        for (op = 1; op <= 10; op++) {
            resultado = numero * op;
            System.out.println(numero + "X" + op + "=" + resultado);
        }
    }

    public void entradaDados() {
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();
    }
}
