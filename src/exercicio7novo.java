import java.util.Scanner;
public class exercicio7novo {
    public static void main(String[] args) {

        float nota1; float nota2; float nota3; float nota4;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        nota1 = ler.nextFloat();
        System.out.println("Insira a segunda nota: ");
        nota2 = ler.nextFloat();
        System.out.println("Insira a terceira nota: ");
        nota3 = ler.nextFloat();
        System.out.println("Insira a quarta nota: ");
        nota4 = ler.nextFloat();

        System.out.println("Sua nota foi: ");
        System.out.print(nota1 + nota2 + nota3 + nota4 /4);

        float resultado;
        resultado = (nota1 + nota2 + nota3 + nota4 /4);

        if (resultado >= 6) {
            System.out.println(" Aprovado");
        }
        else if (resultado < 5.9) {
            System.out.println(" Reprovado");
        }

    }
}
