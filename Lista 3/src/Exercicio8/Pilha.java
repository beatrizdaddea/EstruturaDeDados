package Exercicio8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra_separada() {
        return palavra_separada;
    }

    public void setPalavra_separada(String palavra_separada) {
        this.palavra_separada = palavra_separada;
    }

    public String getPalavra_invertida() {
        return palavra_invertida;
    }

    public void setPalavra_invertida(String palavra_invertida) {
        this.palavra_invertida = palavra_invertida;
    }

    private String palavra;
    private String palavra_separada;
    private String palavra_invertida;
    public int resposta;

    public void frase_invertida() {
        do {
            // Stack<String> texto_original = new Stack();
            Stack<String> texto_invertido = new Stack();
            Stack<String> texto_temp = new Stack();

            Scanner teste = new Scanner(System.in);
            System.out.print("Digite uma palavra: ");
            setPalavra(teste.next());
            String[] Palavra_separada = getPalavra().split("");
            ;
            /*for(int i = 0; i < getPalavra().size(); i++){ // erro  
           frase= texto_original.push(Palavra_separada[i]);
           System.out.println(frase.split(" "));
            // System.out.println(getPalavra());
            // System.out.println(Arrays.toString(Palavra_separada))

        }*/

            for (int i = 0; i < getPalavra().length(); i++) {
                texto_temp.push(Palavra_separada[i]);
            }

            for (int x = 0; x < getPalavra().length(); x++) {
                String temp = texto_temp.peek();
                texto_temp.pop();
                texto_invertido.push(temp);
            }

            System.out.println("A palavra invertida é: " + texto_invertido);
            // System.out.println(texto_invertido);
            Scanner pergunta = new Scanner(System.in);
            System.out.println("Deseja verificar outra palavra ? ");
            System.out.println(" 1 - SIM / 2 - NÃO ");
            resposta = (pergunta.nextInt());

        } while (resposta == 1);
    }

}
