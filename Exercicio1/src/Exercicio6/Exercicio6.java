/*6. Leia uma matriz 4 x 4, imprima a matriz e retorne à localização (linha e a coluna) do maior
valor*/
package Exercicio6;

import java.util.Random;

public class Exercicio6 {

    public static void main(String[] args) {

        Random rnd = new Random();

        int[][] a = new int[4][4]; // matriz 4x4
        int maior = 0;
        int l = 0; // linha 0 a 3 = 4 
        int c = 0; // coluna de 0 a 3 = 4

        for (int lin = 0; lin < a.length; lin++) {
            for (int col = 0; col < a[lin].length; col++) { 
                a[lin][col] = rnd.nextInt(100);
                System.out.print(a[lin][col]+" "); 
            }
                System.out.println("\n");
        }

        for (int lin = 0; lin < a.length; lin++) {
            for (int col = 0; col < a[lin].length; col++) {
                if (a[lin][col] > maior) {
                    maior = a[lin][col];
                    l = lin;
                    c = col;
                    //System.out.print(a[lin][col] + " ");
                }
            }
            //System.out.println("\n ");
        }

        System.out.printf("O maior valor está na linha: %d , coluna: %d\n", l, c);
    }

}
