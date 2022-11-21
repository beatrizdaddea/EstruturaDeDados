/*Para evitar erros de digitação de sequências de números de importância fundamental,como a  matrícula  de  um  aluno,  o  CPF  do  Imposto  de  Renda,  o  número  de  contabancária, geralmente adiciona-se ao número um dígito verificador. Vamos considerar a conta bancária 811057, ondeé usadacomo 811057-3, onde 3 é o dígito verificador,calculado da seguinte maneira */
package Exercicio6;

import java.util.ArrayList;

public class Exercicio6 {

 
    public static void main(String[] args) {
        ArrayList<ContaBancaria> dados = new ArrayList<>();
        dados.add(new ContaBancaria("413599", 7, 987.30f, "Jacinto Pereira"));
        dados.add(new ContaBancaria("111118", 3, 121.99f, "Campos Sales"));
        dados.add(new ContaBancaria("765432",1, 355.66f, "Júnia Faria"));
        
        ListaContaBancaria lista = new ListaContaBancaria(dados);
        lista.listar();
    }
    
}
