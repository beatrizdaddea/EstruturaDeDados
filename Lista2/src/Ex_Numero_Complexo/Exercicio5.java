/* 5 -Implemente as seguintes funções para os números imaginários:
•Valor absoluto: abs(a + bi) =  raiz_quadrada (a² + b²) 
•Soma: (a1+ b1i) + (a2+ b2i) = (a1+ a2) + (b1 + b2)i
•Multiplicação: (a1+ b1i) x (a2+ b2i) = (a1x a2–b1x b2) + (a1x b2+ a2xb1)i
•Inversão: -(a + bi) = -(a) + -(b)i
•Impressão: imprimir um número complexo na forma a + bi */
package Ex_Numero_Complexo;

public class Exercicio5 {

    public static void main(String[] args) {
        NumeroComplexo nc1 = new NumeroComplexo(10.0, 7.0);
        NumeroComplexo nc2 = new NumeroComplexo(14.0, -5.0);

        System.out.println("Equação 1: " + nc1 + "\n Equação 2: " + nc2);
        System.out.println("Soma: " + NumeroComplexo.soma(nc1, nc2));
        System.out.println("Multiplicação: " + NumeroComplexo.multiplicacao(nc1, nc2));
        System.out.println("Valor Invertido ");
        System.out.println("Equação 1: ");
        nc1.inversao();
        System.out.println("Equação 2: ");
        nc2.inversao();
        System.out.println("Valor Absoluto ");
        System.out.println("Equação 1: ");
        nc1.valor_absoluto();
        System.out.println("Equação 2: ");
        nc2.valor_absoluto();

    }

}
