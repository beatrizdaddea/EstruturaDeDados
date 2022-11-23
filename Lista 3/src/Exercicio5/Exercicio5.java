/*
5 -  Dada uma sequência de caracteres formada por uma sequência alternada de letras e dígitos, construa  um  método  utilizando Queue  ou uma  implementação  de  filaque  imprima  todas  as letras primeiro e depois os números
 */
package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner fila = new Scanner(System.in);
        System.out.println("Digite uma frase com letras e números: ");
        String s1 = fila.next();
        Fila n1 = new Fila(s1);
        n1.separar_elementos();
    }
    
}
