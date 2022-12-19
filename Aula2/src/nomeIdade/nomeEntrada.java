package nomeIdade;

import java.util.Scanner;
public class nomeEntrada {
    public static void main(String[] args) {
        idadeNome ent = new idadeNome();
        Scanner ler = new Scanner(System.in);

        do {
            ent.entradaDado();
            ent.resultado();

            System.out.println("Deseja fazer de novo? (S/N)");
        } while (ler.nextLine().equalsIgnoreCase("S"));
    }
}
