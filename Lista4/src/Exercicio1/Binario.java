package Exercicio1;

public class Binario {
    public int Conversao(int n) {
        if (n > 0) {
            Conversao(n / 2);
            System.out.println(n % 2);
        }
        return n;
    }
}
