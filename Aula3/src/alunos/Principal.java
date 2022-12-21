package alunos;

/* Construir uma aplicacao de calculo de notas de um aluno sabendo que ele pode
ser aluno da Univille ou UFSC, que possuem formas de avaliacao diferentes.
Mostrar os dados e a media do aluno

HERANCA = possibilidade de se reutilizar os atributos e os metodos em
outra calsse. É possivel fazer heranca unica, nao existe heranca
multipla no Java, mas uma classe pode gerar varias outras classes-filhas

*/



public class Principal {
    public static void main(String[] args) {

        AlunoUFSC aluno1 = new AlunoUFSC();
        aluno1.setProva1(7.5);
        aluno1.setProva2(6.5);

        System.out.println(aluno1.getNomeAluno());
        System.out.println(aluno1.getMatricula());
        System.out.println(aluno1.toString());
        aluno1.calcMedia();

        AlunoUniville alunos = new AlunoUniville();


        alunos.setProva1(7);
        alunos.setProva2(6);
        alunos.setProva3(6);

        System.out.println(alunos.getNomeAluno());
        System.out.println(alunos.getMatricula());
        System.out.println(alunos.toString());
        alunos.calcMedia();
    }
}
