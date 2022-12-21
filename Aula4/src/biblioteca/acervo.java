package biblioteca;

import java.util.Scanner;

public class acervo extends livro {
    public int quantidade;
    public String editora;
    Scanner ler = new Scanner(System.in);

    public void entradaDados() {
        super.entradaDados();
        System.out.println("Digite a quantidade de livros: ");
        quantidade = ler.nextInt();
        System.out.println("Informe a editora: ");
        editora = ler.next();
    }

    // SOBREESCRITA (OVERRIDE)
    // Sobreescrita é a sobreposicao de metodos com assinatura
    // e nomes iguais, mas em calsses diferentes, sendo
    // herdadas da classe mae
    // A assinatura é identica ao metodo sobreescrita na classe
    // mae
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Editora: " + editora);
    }
}
