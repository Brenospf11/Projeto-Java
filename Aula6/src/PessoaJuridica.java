public class PessoaJuridica implements Pessoa {
    private String cnpj;
    private String nome;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void contrarFuncionario(){
        System.out.println("Contrar é bom");
    }

    @Override
    public void pagarImposto() {
        System.out.println("É a vida");
    }

    @Override
    public void comer() {
    }

    @Override
    public void respirar() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void andar() {

    }
}
