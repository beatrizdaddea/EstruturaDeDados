
package Exercicio3;

import java.util.Scanner;

public class BuscaBinaria {

    Integer[] vetor;

    public BuscaBinaria(Integer[] vetor) {
        this.vetor = vetor;
    }

    public Integer[] getVetor() {
        return vetor;
    }

    public void setVetor(Integer[] vetor) {
        this.vetor = vetor;
    }

    public void buscabinaria() {

        System.out.println("Digite um numero");
        Scanner teste = new Scanner(System.in);
        int buscado = teste.nextInt();

        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        //int count = 0;
        while (inicio <= fim) {
            
            meio = (int) ((inicio + fim) / 2);
            contador++;
            if (vetor[meio] == buscado) {
                achou = true;
                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;
                //System.out.println("Valor diferente");
            } else {
                fim = meio - 1;
                //System.out.println("Valor diferente");
            }

        }
        System.out.println("Quantidade de divisões: " + contador);
        if (achou == true) {
            System.out.println("Achou o elemento " + buscado);
        } else {
            System.out.println("Não achou o elemento " + buscado);
        }
    }

}
