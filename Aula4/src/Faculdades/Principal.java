package Faculdades;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);
        UFSC U = new UFSC();
        UNIVILLE UNI = new UNIVILLE();
        int Facu;

        Estudante Edu = new Estudante() {
            @Override
            public void EntradaDados() {
                super.EntradaDados();
            }

            @Override
            public void imprimeDados() {
                super.imprimeDados();
            }
        };

        System.out.println(" [1] UFSC ");
        System.out.println(" [2] UNIVILLE ");
        System.out.println("Digite o numero da sua Faculdade ? ");
        Facu = ler.nextInt();

        switch (Facu){
            case 1:
                Edu.EntradaDados();
                Edu.imprimeDados();
                U.entradaDados();
                U.calcMedia();
                break;

            case 2:
                Edu.EntradaDados();
                Edu.imprimeDados();
                UNI.entradaDados();
                UNI.calcMedia();
                break;

        }


    }
}
