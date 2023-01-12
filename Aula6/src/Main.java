public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaF = new PessoaFisica();
        System.out.println("Pessoa Fisica");
        pessoaF.setNome("Breno");
        pessoaF.setCpf("123.132.123-12");
        System.out.println("CPF " + pessoaF.getCpf());
        pessoaF.setIdade(32);
        System.out.println(pessoaF.getIdade() + " anos");
        pessoaF.setSexo('M');
        System.out.println(pessoaF.getSexo());
        pessoaF.setPeso(60);
        System.out.println(pessoaF.getPeso());
        pessoaF.andar();
        pessoaF.dormir();
        pessoaF.respirar();
        pessoaF.comer();
        pessoaF.pagarImposto();

        PessoaJuridica pessoaJ = new PessoaJuridica();
        System.out.println();
        System.out.println("Pessoa Juridica");
        pessoaJ.setCnpj("213132132");
        System.out.println(pessoaJ.getCnpj());
        pessoaJ.setNome("Cleiton");
        System.out.println(pessoaJ.getNome());
        pessoaJ.pagarImposto();
        pessoaJ.contrarFuncionario();
    }
}