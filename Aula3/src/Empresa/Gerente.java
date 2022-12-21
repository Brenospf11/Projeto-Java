package Empresa;

public class Gerente extends Pessoa {
    private double salario;
    private double horas;
    private double dias;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    public double calcGer() {
        double salarioF = salario * horas * dias;
        System.out.println("O seu salario é: " + salarioF);
        return 0;
    }

    @Override
    public String toString() {
        return "Gerente {" +
                " Salario = " + salario +
                ", Horas=" + horas +
                ", Dias = " + dias +
                '}';
    }
}
