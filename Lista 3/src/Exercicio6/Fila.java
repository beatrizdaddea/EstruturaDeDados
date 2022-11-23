package Exercicio6;

import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Fila {

    public Queue<Integer> getFila_original() {
        return fila_original;
    }

    public void setFila_original(Queue<Integer> fila_original) {
        this.fila_original = fila_original;
    }

    public Queue<Integer> getElementos_repetidos() {
        return elementos_repetidos;
    }

    public void setElementos_repetidos(Queue<Integer> elementos_repetidos) {
        this.elementos_repetidos = elementos_repetidos;
    }

    public Queue<Integer> getFila_final() {
        return fila_final;
    }

    public void setFila_final(Queue<Integer> fila_final) {
        this.fila_final = fila_final;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    private int tam;
    private int valor;
    private Queue<Integer> fila_original = new LinkedList();
    private Queue<Integer> elementos_repetidos = new LinkedList();
    private Queue<Integer> fila_final = new LinkedList();

    public void montar_fila() {
        Scanner teste = new Scanner(System.in);

        System.out.print("Qual tamanho da sua fila: ");
        setTam(teste.nextInt());
        System.out.println("Insira os números da sua fila: ");
        System.out.println("OBS: Pode repetir números! ");

        for (int i = 0; i <= (getTam() - 1); i++) {
            setValor(teste.nextInt());
            this.getFila_original().add(getValor());

            if (Collections.frequency(fila_original, getValor()) >= 2) {
                this.getElementos_repetidos().add(getValor());
            } else if (Collections.frequency(fila_original, getValor()) == 1) {
                this.getFila_final().add(getValor());
            }
        }

        System.out.println("Fila original: " + getFila_original());
        System.out.println("Valores repetidos: " + getElementos_repetidos());
        System.out.println("Quantas vezes aparece os valores repetidos: " + getElementos_repetidos().size());
        System.out.print("Fila sem os valores repetidos: " + getFila_final());
    }
}
