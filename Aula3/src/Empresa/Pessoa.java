package Empresa;

public class Pessoa {
    private String nome;
    private String telefone;
    private String data_de_admissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_de_admissao() {
        return data_de_admissao;
    }

    public void setData_de_admissao(String data_de_admissao) {
        this.data_de_admissao = data_de_admissao;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                " Nome = '" + nome + '\'' +
                ", Telefone = '" + telefone + '\'' +
                ", Data de admissao = '" + data_de_admissao + '\'' +
                '}';
    }
}
