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
        for(int l = 0; l < 3; l++)
    }
}

