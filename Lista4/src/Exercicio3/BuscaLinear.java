
package Exercicio3;

public class BuscaLinear {
     Integer[] vetor;

    public BuscaLinear(Integer[] vetor) { // construtor para chamar a lista
        this.vetor = vetor;
    }

    public Integer[] getVetor() {
        return vetor;
    }

    public void setVetor(Integer[] vetor) {
        this.vetor = vetor;
    }

    public void linearbusca(int valor) {
        int count = 0; 

        for (Integer el : this.vetor) {
            System.out.println("Elemento: "+ el +" "+ "Posição: " + (count + 1) ); // vai imprimindo a lista até achar o elemento buscado
            if (el == valor){
                 System.out.println("Encontrou o elemento!");
                 break;
            }

            if ( el != valor) {
                System.out.println("Elemento não encontrado");
            }

            count++;
        }
    }
}
