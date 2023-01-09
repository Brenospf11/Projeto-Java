package Faculdades;
import java.util.Scanner;
public class UNIVILLE extends Estudante {
    Scanner ler = new Scanner(System.in);

    private double prova1;
    private double prova2;
    private double prova3;

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getProva3() {
        return prova3;
    }

    public void setProva3(double prova3) {
        this.prova3 = prova3;
    }

    public void entradaDados(){
        System.out.println("Digite a primeira nota: ");
        prova1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        prova2 = ler.nextDouble();
        System.out.println("Digite a tercira nota: ");
        prova3 = ler.nextDouble();
    }
    public void calcMedia() {
        double media = (prova1 + (prova2 * 2) + (prova3 * 3)) / 6;
        if (media >= 6)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");
    }
}
