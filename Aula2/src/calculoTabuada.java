import java.util.Scanner;

public class calculoTabuada {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        tabuada tab = new tabuada();
    do {
        tab.entrdaDados();
        tab.calculadora();

        System.out.println("Deseja calcular novamente? S/N");
    } while (ler.nextLine().equalsIgnoreCase("S"));

    }
}
