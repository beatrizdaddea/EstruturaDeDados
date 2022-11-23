/*
3 - Escreva  uma  classe  que  utilize  um  ArrayList  para  armazenar  as  informações  de  uma Matriz. As informações são:•Linha•Coluna•Valor
 */
package Exercicio3_e_4;


import java.util.ArrayList;

public class Exercicio3 {


    public static void main(String[] args) {
        Matriz m1 = new Matriz(0,0,0);
        ArrayList<Matriz> a = new ArrayList<Matriz>();
        m1.matriz(a, 0, 0, 0);
    }
    
}
