package Empresa;

public class Desenvolvedor extends Pessoa {
    private double horas;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double calcDev() {
        double salario = horas * 255;
        System.out.println("O seu salario é: " + salario);
        return 0;
    }

    @Override
    public String toString() {
        return "Desenvolvedor {" +
                " Horas = " + horas +
                '}';
    }
}
