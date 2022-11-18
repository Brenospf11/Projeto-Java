import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a idade: ");
        int idade = ler.nextInt();

        if (idade < 18 || idade > 65) {
            System.out.println("Reprovado");
        } else if (idade >= 18 && idade <= 65) {

            System.out.println("Salario:");
            int salario = ler.nextInt();

            System.out.println("Quanto de emprestimo: ");
            int emprestimo = ler.nextInt();

            System.out.println("Quantas parcelas: ");
            int parcelas = ler.nextInt();

            if (parcelas >= 3 && parcelas <= 24) {
                System.out.println("Aprovado");
            }
            if (parcelas < 3 || parcelas > 24){
                System.out.println("Reprovado");
            }

            double nemp = salario * 0.3;
            double nparc = emprestimo / parcelas;

            if (nemp > nparc){
                System.out.println("Emprestimo aprovado!");
            } else {
                System.out.println("Emprestimo reprovado!");
            }
        }
    }
}
