package exercicio1;

public class Media {

    double notas[] = {5.4, 6, 10, 7.7, 9};
    double soma_array = 0;

    public void media_notas() {
        int qnt_array = notas.length;
        for (int i = 0; i < qnt_array; i++) {
            soma_array = soma_array + notas[i];
        }
        double media_final = soma_array / qnt_array;
        System.out.printf("A média final é: %.2f %n ", media_final);

    }
}
