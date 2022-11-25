package Exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {

        // Exercicio A
        System.out.println("Busca Linear");
        Integer[] vetor = {1, 4, 5, 8, 9, 11};
        BuscaLinear n1 = new BuscaLinear(vetor);
        n1.linearbusca(8);

        // Exercicio B
        System.out.println("Busca Binaria");
        BuscaBinaria n2 = new BuscaBinaria(vetor);
        n2.buscabinaria();

    }

}
