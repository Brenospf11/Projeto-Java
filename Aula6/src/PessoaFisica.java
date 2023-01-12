public class PessoaFisica implements Pessoa {
    private String cpf;
    private int idade;
    private int peso;
    private char sexo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public void pagarImposto() {
        System.out.println("Soneguei sem querer");
    }

    @Override
    public void andar() {
        System.out.println("Andei");
    }

    @Override
    public void dormir() {
        System.out.println("Dormi");
    }

    @Override
    public void comer() {
        System.out.println("Comi");
    }

    @Override
    public void respirar() {
        System.out.println("As vezes é bom respirar");
    }
}
