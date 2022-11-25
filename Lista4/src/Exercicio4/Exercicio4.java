/*
4 - Considerando a árvore abaixo exiba o resultado de sua busca em Pré-Ordem, Em-Ordem e Pós-Ordem
 */
package Exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {
        Arvore a = new Arvore();
        Noh Noh1 = new Noh(8);
        a.setInicio(Noh1);
        Noh Noh2 = new Noh(5);
        Noh Noh3 = new Noh(4);
        Noh1.setEsq(Noh2);
        Noh1.setDir(Noh3);
        Noh Noh4 = new Noh(9);
        Noh Noh5 = new Noh(7);
        Noh2.setEsq(Noh4);
        Noh2.setDir(Noh5);
        Noh Noh6 = new Noh(11);
        Noh3.setDir(Noh6);
        Noh Noh7 = new Noh(1);
        Noh Noh8 = new Noh(12);
        Noh5.setEsq(Noh7);
        Noh5.setDir(Noh8);
        Noh Noh9 = new Noh(3);
        Noh6.setEsq(Noh9);
        Noh Noh10 = new Noh(2);
        Noh8.setEsq(Noh10);
        
        System.out.print("Em-ordem: ");
        a.emOrdem(Noh1);
        System.out.println();
        System.out.print("Pré-Ordem: ");
        a.preOrdem(Noh1);
        System.out.println();
        System.out.print("Pós-Ordem: ");
        a.posOrdem(Noh1);
    }
}
