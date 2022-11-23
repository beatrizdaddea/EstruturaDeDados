package Exercicio9;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public int resposta;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    private String palavra;

    public void palindromo() {
        do {
            Scanner txt = new Scanner(System.in);
            System.out.println("Insira uma palavra qualquer: ");
            setPalavra(txt.next());
            String[] Palavra_separada = getPalavra().split("");

            // System.out.println(Arrays.toString(Palavra_separada));
            Stack<String> texto_verificador = new Stack();
            Stack<String> texto_temp = new Stack();
            Stack<String> texto_invertido = new Stack();

            for (int i = 0; i < getPalavra().length(); i++) {
                for (char c : Palavra_separada[i].toCharArray()) {
                    if (Character.isLetter(c)) {
                        texto_verificador.push(Palavra_separada[i]);

                    } else if (Character.isDigit(c)) {
                        texto_verificador.push(Palavra_separada[i]);

                    } else {
                        System.out.print("Inválido");
                        break;
                    }
                    //txt_verif.clear();
                }
            }

            for (int i = 0; i < getPalavra().length(); i++) {
                texto_temp.push(Palavra_separada[i]);
            }

            for (int x = 0; x < getPalavra().length(); x++) {
                String temp = texto_temp.peek();
                texto_temp.pop();
                texto_invertido.push(temp);
            }

            System.out.println("Texto Digitado: " + texto_verificador);
            System.out.println("Texto Invertido: " + texto_invertido);

            if (texto_verificador.equals(texto_invertido)) {
                System.out.println("É palíndromo!");
            } else {
                System.out.println("Não é palíndromo!");
            }
            
            Scanner pergunta = new Scanner(System.in);
            System.out.println("Deseja verificar outra palavra ? ");
            System.out.println(" 1 - SIM / 2 - NÃO ");
            resposta = (pergunta.nextInt());

        } while (resposta == 1);
    }
}
