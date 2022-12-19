import java.util.Scanner;

public class boletim {
    Scanner ler = new Scanner(System.in);
    boolean continuar;
    double nota1;
    double nota2;
    double nota3;
    double total;
    int materia;
    String materias = "";
    public void entradaDadosNovo(){

                System.out.println("---------Materias a calcular-----------");
                System.out.println("---------------[1]Artes ---------------");
                System.out.println("--------------[2]Química --------------");
                System.out.println("------------- [3] Física --------------");
                System.out.println("-------------[4] Biologia -------------");
                System.out.println("------------[5] Matemática ------------");
                System.out.println("--------------[6] Inglês --------------");
                System.out.println("-------------[7] Português ------------");
                System.out.println("-------------[8] Geografia ------------");
                System.out.println("-------------[9] Filosofia ------------");
                System.out.println("------------[10] Sociologia -----------");
                System.out.println("---------[11] Educacao Física ---------");
                System.out.println("-------------[12] História ------------");

                do {
                    continuar = false;
                    try {
                        ler = new Scanner(System.in);
                        System.out.println("      Digite o numero da matéria: ");
                        materia = ler.nextInt();

                switch (materia) {
                    case 1:
                        materias = "Artes";
                        continuar = true;
                        break;
                    case 2:
                        materias = "Química";
                        continuar = true;
                        break;
                    case 3:
                        materias = "Física";
                        continuar = true;
                        break;
                    case 4:
                        materias = "Biologia";
                        continuar = true;
                        break;
                    case 5:
                        materias = "Matemática";
                        continuar = true;
                        break;
                    case 6:
                        materias = "Inglês";
                        continuar = true;
                        break;
                    case 7:
                        materias = "Português";
                        continuar = true;
                        break;
                    case 8:
                        materias = "Geografia";
                        continuar = true;
                        break;
                    case 9:
                        materias = "Filosofia";
                        continuar = true;
                        break;
                    case 10:
                        materias = "Sociologia";
                        continuar = true;
                        break;
                    case 11:
                        materias = "Educacao Física";
                        continuar = true;
                        break;
                    case 12:
                        materias = "História";
                        continuar = true;
                        break;
                    default:
                        continuar = false;
                        break;
                }
            } catch (Exception e) {
            }
        } while(!continuar);

            do {
                continuar = false;
                try {
                    ler = new Scanner(System.in);
                    System.out.println("Digite a primeira nota: ");
                    nota1 = ler.nextDouble();
                    if (nota1 < 0 || nota1 > 10){
                        continuar = false;
                    } else {
                        continuar = true;
                    }
                } catch (Exception e){
                }
            } while (!continuar);

        do {
            continuar = false;
            try {
                ler = new Scanner(System.in);
                System.out.println("Digite a segunda nota: ");
                nota2 = ler.nextDouble();
                if (nota1 < 0 || nota1 > 10){
                    continuar = false;
                } else {
                    continuar = true;
                }
            } catch (Exception e){
            }
        } while (!continuar);

        do {
            continuar = false;
            try {
                ler = new Scanner(System.in);
                System.out.println("Digite a terceira nota: ");
                nota3 = ler.nextDouble();
                if (nota1 < 0 || nota1 > 10){
                    continuar = false;
                } else {
                    continuar = true;
                }
            } catch (Exception e){
            }
        } while (!continuar);

    }
        public void calculoMedia() {
            total = (nota1 + nota2 + nota3) / 3;

            if (total >= 7) {
                System.out.println("Parabens voce foi aprovado!!" + " Sua nota em " + materias + " foi: " + total);
            } else if (total < 7 || total >= 6) {
                System.out.println("Voce esta em recuperacao!!" + " Sua nota em " + materias + " foi: " + total);
            } else if (total < 6) {
                System.out.println("Voce reprovou!!" + " Sua nota em " + materias + " foi: " + total);
            }
        }
    }
