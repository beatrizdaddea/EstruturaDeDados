package Exercicio5;

import static java.lang.Character.valueOf;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Fila {

    public String getElementos() {
        return elementos;
    }

    public void setElementos(String elementos) {
        this.elementos = elementos;
    }

    public Queue<Character> getLetras() {
        return letras;
    }

    public void setLetras(Queue<Character> letras) {
        this.letras = letras;
    }

    public Queue<Character> getNumeros() {
        return numeros;
    }

    public void setNumeros(Queue<Character> numeros) {
        this.numeros = numeros;
    }

    private String elementos;
    private Queue<Character> letras = new LinkedList<>();
    private Queue<Character> numeros = new LinkedList<>();

    public Fila(String dados) {
        this.elementos = dados;
    }

    public void separar_elementos() {
        Character[] numeros_array = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        Queue<Character> fila = new LinkedList<>();
        fila.addAll(Arrays.asList(numeros_array));
        // vai separar letra de numero
        for (int x = 0; x < this.getElementos().length(); x++) {
            this.getElementos().charAt(x);

            if (fila.contains(this.getElementos().charAt(x))) {
                this.getNumeros().add(valueOf(this.getElementos().charAt(x)));
            } else {
                this.getLetras().add(valueOf(this.getElementos().charAt(x)));
            }
        }

        for (Character letra : this.getLetras()) {
            System.out.print(letra);
        }

        for (Character num : this.getNumeros()) {
            System.out.print(num);
        }
    }
}
