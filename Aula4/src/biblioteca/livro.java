package biblioteca;

// CLASSE ABSTRATA: uma classe do Java que nao pode ser instanciada,ou seja,
// nao e possivle gerar objetos dela. A ideia e que sejam geradas apenas
// objetos das classes-filhas

import java.util.Scanner;

public abstract class livro {
    Scanner ler = new Scanner(System.in);
    public String nome;
    public String autor;

    public void entradaDados() {
        System.out.println("Informe o nome do livro: ");
        nome = ler.nextLine();
        System.out.println("Informe o autor do livro: ");
        autor = ler.nextLine();
    }

    public void imprimeDados() {
        System.out.println("Livro: " + nome);
        System.out.println("Autor: " + autor);
    }
}
