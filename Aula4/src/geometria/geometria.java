package geometria;

public class geometria {
    public double raio;
    public double ladoA;
    public double ladoB;

    // Calculo do Area (Circulo)
    public double calcular (double raio) {
        this.raio = 3.14 * (raio * raio);
        return (this.raio);
    }

    // Calculo do Retangulo
    public double calcular(double ladoA, double ladoB) {
        double area = ladoA * ladoB;
        return area;
    }
}
