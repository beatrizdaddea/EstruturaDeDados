/* 7. Implemente um algoritmo para controlar uma urna eletrônica
São 4 candidatos: Huguinho, Zezinho, Luizinho e Joãozinho.
Deve perguntar ao usuário em quem ele deve votar. A entrada será o número do candidato.
Quanto o for digitado 999, significa que a eleição acabou.
Os números dos candidatos são Huguinho (54), Zezinho (67), Luizinho (32) e Joãozinho (51).
Após o voto deve ser exibido uma mensagem que o voto foi computado com sucesso. Se for
digitado um número inválido, este deve ser salvo como voto inválido.
Após o término dos votos, deve ser apresentado na tela a quantidade de votos obtidos por cada
candidato
*/
package Exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public int candidato;

    public static void main(String[] args) {

        Candidatos cand = new Candidatos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Huguinho = 54 / Zezinho = 67 / Luizinho = 32 / Joãozinho = 51");

        while (cand.candidato != 999) {
            System.out.println("Insira o código do candidato desejado: ");
            cand.candidato = scanner.nextInt();
            if (cand.candidato == 67) {
                cand.z += 1;
                //System.out.print("Voto Computado" + z);
            } else if (cand.candidato == 54) {
                cand.h += 1;
                //System.out.print("Voto Computado" + h);
            } else if (cand.candidato == 32) {
                cand.l += 1;
                //System.out.print("Voto Computado" + l);
            } else if (cand.candidato == 51) {
                cand.j += 1;
                //System.out.print("Voto Computado" + j);
            } else if (cand.candidato == 999) {
                System.out.println("Votação Encerrada");
                break;
            } else {
                System.out.println("Inválido");
            }

        }

        System.out.println("Zezinho = " + cand.z);
        System.out.println("Huguinho = " + cand.h);
        System.out.println("Luizinho = " + cand.l);
        System.out.println("Joãozinho = " + cand.j);
    }

}
