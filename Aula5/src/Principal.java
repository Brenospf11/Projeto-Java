/* Interfaces
* Se trata de um "contrato" que grandes aplicacoes fazem para que o programador
* sigao padaro do projeto definido no inicio do desenvolvimento.

* 1 -> Declarar a classe com a palavra interface
* 2 -> So pode contar as assinaturas dos metodos, sem corpo
* 3 -> nao pode ser instanciada
* 4 -> A classe que implementa a interface deve implementar todos os seus metodos
* 5 -> Uma classe pode implementar MAIS DE UMA INTERFACE
*               public class ContaCorrente extends Conta
*               public class ContaCorrente implements Conta, Ususario
* 6 -> Uma interface pede implementar/extender diversas outras interfaces
 */

public class Principal {
    public void calcularsalarioGerente(Funcionario funcionario) {
        if(funcionario instanceof Gerente) {

        } else if (funcionario instanceof Administrador){

        } else {
            System.out.println("A classe ");
        }
    }

    public static void main(String[] args) {

    }
    }



