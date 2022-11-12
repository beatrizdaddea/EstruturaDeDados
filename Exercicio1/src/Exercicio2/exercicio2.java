/* 2. Criar um vetor de 80 posições. Para cada posição, sortear um número inteiro aleatório.
Após a definição dos valores, o vetor deve ser impresso na tela. */
package Exercicio2;

import java.util.Random;

public class exercicio2 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[80];

        for (int linha = 0; linha < vetor.length; linha++) {
            vetor[linha] = random.nextInt(100);
            System.out.print(vetor[linha] + " ");
        }
    }

}
