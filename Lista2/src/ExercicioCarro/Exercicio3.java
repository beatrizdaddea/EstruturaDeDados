
/* Implemente uma função que calcule quanto dinheiro o dono do carro gastou para dirigir o carro até o momento. Considerando hipoteticamente que o número do tipo de motor impacte diretamente no total gasto e o tendo preço da gasolina como R$ 4,259, o valor da função é:valor gasto = preço da gasolina * quilômetros rodados * tipo de motorNo final, a função deve imprimir uma mensagem ao usuário mostrando o quanto foi gasto. */ 
package ExercicioCarro;

public class Exercicio3 {
    

    public static void main(String[] args) {
        Carro c2 = new Carro();
        c2.setKm_rodados(10.5);
        c2.setMotor(2.0);
        c2.gasolina();
    }
    
}
