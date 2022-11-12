/* 3.Criar um programa para receber um nome informado pelo usuário. Posteriormente, o
programa deverá exibir cada caractere desse nome de forma invertida.
 */
package Exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        String nomenvertido = new StringBuilder(nome).reverse().toString(); //metodo reverse
        System.out.println(nomenvertido);
    }

}
