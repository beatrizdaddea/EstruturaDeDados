/* 4. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui. */
package Exercicio4;

import java.util.Random;

public class Exercicio4 {

    public static void main(String[] args) {
        Random random = new Random();

        int matriz[][] = new int[4][4];
        int maior10 = 0;

        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[lin].length; col++) {
                matriz[lin][col] = random.nextInt(30);
                System.out.print(matriz[lin][col] + " ");

                if (matriz[lin][col] > 10) {

                    maior10 += 1;
                }
            }
            System.out.println("\n");

        }

        System.out.println("A matriz possui " + maior10 + " valores maiores do que DEZ.");
    }

}
