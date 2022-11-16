public class exercicio7 {
    public static void main(String[] args) {
        int nota1 = 5;
        int nota2 = 8;
        int nota3 = 6;
        int nota4 = 7;

        double notaF = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A nota foi: " + notaF);

        int aprovado = 6;
        if (aprovado >= 6) {
            System.out.println("Aprovado");
        }

        int nota5 = 2;
        int nota6 = 4;
        int nota7 = 3;
        int nota8 = 1;

        double notaF1 = (nota5 + nota6 + nota7 + nota8) / 4;
        System.out.println("A nota foi: " + notaF1);

        int reprovado = 5;
        if (reprovado < 6) {
            System.out.println("Reprovado");
        }

    }
}
