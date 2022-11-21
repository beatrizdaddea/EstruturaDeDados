
/* Implemente  um  TAD  que  tenha  as  informações  sobre  um  carro.  O  carro  deve  ter  as seguintes informações */ 
package ExercicioCarro;

public class Exercicio1 {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setAno(2020);
        c1.setMarca("Fiat");
        c1.setCor("Preto");
        c1.setKm_rodados(9.5);
        c1.setMotor(1.6);
        
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Ano: " + c1.getAno());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Km_Rodados: " + c1.getKm_rodados());
        System.out.println("Tipo do Motor: " + c1.getMotor());
        
    }
    
}
