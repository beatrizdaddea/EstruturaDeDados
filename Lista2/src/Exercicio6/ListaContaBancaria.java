
package Exercicio6;

import java.util.ArrayList;

public class ListaContaBancaria {
    ArrayList<ContaBancaria> contas;
    ArrayList<String> validas;
    ArrayList<String> invalidas;

    public void listar(){
        for (ContaBancaria conta: this.contas) {
            if (conta.verificar()) {
                this.validas.add(conta.toString());
            } else {
                this.invalidas.add(conta.toString());
            }
        }
            System.out.println("CONTA DE NUMERO CORRETA");
            for (String contaValida:this.validas) {
                System.out.println(contaValida);
            }
            System.out.println();
            System.out.println("CONTA DE NUMERO ERRADO");
            for (String contaInvalida:this.invalidas) {
                System.out.println(contaInvalida);
            }
        }

    public ListaContaBancaria(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
        this.validas = new ArrayList<>();
        this.invalidas = new ArrayList<>();
    }
}
