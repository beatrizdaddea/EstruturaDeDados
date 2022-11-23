package Exercicio7;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    private int quantidade;
    private int valor;

    public void comparar_pilha() {
        Stack<Integer> pilha = new Stack();
        Stack<Integer> pilha2 = new Stack();

        // vao ser geradas pilhas com valores aleaatorios 
        Random valor = new Random();

        Scanner p = new Scanner(System.in);
        System.out.print("Insira a quantidade de elementos das pilhas: ");
        setQuantidade(p.nextInt());

        for (int i = 0; i < getQuantidade(); i++) {
            setValor(valor.nextInt(100));
            pilha.push(getValor());
        }

        for (int x = 0; x < getQuantidade(); x++) {
            setValor(valor.nextInt(100));
            pilha2.push(getValor());
        }

        System.out.println("Pilha 1 = " + pilha);
        System.out.println("Pilha 2 = " + pilha2);

        if (pilha == pilha2) {
            System.out.print("As pilhas iguais!");
        } else {
            System.out.print("As pilhas são diferentes!");
        }
    }
}
