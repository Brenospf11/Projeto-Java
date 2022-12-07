import java.util.Scanner;
public class jogo {
    private int jogo1 [][] = new int[3][3];
    public jogo(){
        for(int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++){
                jogo1[l][c] = 0;
            }
        }
    }
    public void mostrar() {
        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 3; c++){
                System.out.print(jogo1[l][c] + " ");
            }
            System.out.println();
        }
    }

    public int verificarVencedor() {
        for(int l = 0; l < 3; l++) {
            if ((jogo1[l][0] == jogo1[l][1]) && (jogo1[l][0] == jogo1[l][2])) {
                if (jogo1[l][0] != 0) {
                    return jogo1[l][0];
                }
            }
        }
        for (int c = 0; c < 3; c++) {
            if ((jogo1[0][c] == jogo1[1][c]) && (jogo1[0][c] == jogo1[2][c]) && (jogo1[0][c] != 0)) {
                return jogo1[0][c];
            }
        }
        if ((jogo1[0][0] == jogo1[1][1]) && (jogo1[0][0] == jogo1[2][2]) && (jogo1[0][0] != 0)) {
             return jogo1[0][0];
        }
        if ((jogo1[0][2] == jogo1[1][1]) && (jogo1[0][2] == jogo1[2][0]) && (jogo1[0][2] != 0)) {
            return jogo1[0][2];
        }
        for (int l = 0; l < 3; l++) {
            for(int c = 0; c < 3; c++) {
                if (jogo1[l][c] == 0){
                    return 0;
                }
            }
        }
        return 3;
    }
    public boolean jogada(int jogador, int linha, int coluna){
        if ((linha < 0) || (linha > 2)) {
            return false;
        }
        if ((coluna <0) || (coluna > 2)) {
            return false;
        }
        if (jogo1[linha][coluna] != 0) {
            return false;
        }
        jogo1[linha][coluna] = jogador;
        return true;
        }
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        jogo jogo2 = new jogo();
        int jogador = 1;
        int vencedor = jogo2.verificarVencedor();
        jogo2.mostrar();
        while (vencedor == 0) {
            System.out.println("Jogador " + jogador);
            System.out.print("Linha: ");
            int linha = ler.nextInt();
            System.out.print("Coluna: ");
            int coluna = ler.nextInt();
            if (!jogo2.jogada(jogador, linha-1, coluna-1)){
                System.out.println("Jogada invalida...");
            } else {
                jogador = (jogador == 1) ? 2 : 1;
            }
            jogo2.mostrar();
            vencedor = jogo2.verificarVencedor();
        }
        switch (vencedor) {
            case 1 :
                System.out.println("Vencedor Jogador 1");
                break;
            case 2 :
                System.out.println("Vencedor Jogador 2");
                break;
            case 3 :
                System.out.println("Empate");
                break;
        }
        }

    }