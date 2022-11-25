/*
2- O  máximo  divisor  comum  (MDC)  de  dois  números  inteiros  x  e  y  pode  ser  calculadousando-se uma definição recursiva:
•MDC(x, y) = x, se x = y
•MDC(x,y) = MDC(y, x), se x < y
•MDC(x, y) = MDC(x -y, y),se x > y
Exemplo:Entrada: MDC(10,6)Saída: 2
Explicação: MDC(10, 6)= MDC(4,6)= MDC(6,4)= MDC(2,4)= MDC(4,2)= MDC(2,2)= 2
Então, pede-se que seja criada uma função recursiva para descrever tal definição. 
 */
package Exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        Mdc resp1 = new Mdc();
        resp1.calculo(20, 24);
        System.out.println("O MDC é: " + resp1.getResultado());
    }

}
