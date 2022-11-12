/*5. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais
elementos. Escreva ao final a matriz obtida.
 */
package exercicio5;

public class Exercicio5 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                matriz[1][coluna] = (linha == coluna) ? 1 : 0;
                System.out.printf("%d", matriz[1][coluna]);
            }
            System.out.printf("\n");
        }
    }

}
