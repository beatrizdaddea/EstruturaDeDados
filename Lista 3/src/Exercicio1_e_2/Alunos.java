/* Escreva  uma  classe  que  utilize  ArrayList  para  armazenar  as  informações  de  alunos.  
As informações de cada aluno são:
•Nome
•RA
•NP1
•NP2*/
package Exercicio1_e_2;

import java.util.ArrayList;
import java.util.Collections;

public class Alunos implements Comparable<Alunos> {

    /* Exercicio 1 */
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public double getNp1() {
        return np1;
    }

    public void setNp1(double np1) {
        this.np1 = np1;
    }

    public double getNp2() {
        return np2;
    }

    public void setNp2(double np2) {
        this.np2 = np2;
    }
    private String Nome;
    private String RA;
    private double np1;
    private double np2;

    public Alunos() {

    }

    public Alunos(String nome, String matricula, double nota1, double nota2) {
        setNome(nome);
        setRA(matricula);
        setNp1(nota1);
        setNp2(nota2);
    }

    public int compareTo(Alunos aluno) {
        return Nome.compareTo(aluno.getNome());
    }

    /* Exercicio 2 */
    public void MostrarAlunos(ArrayList<Alunos> aluno) {
        System.out.println("Lista Total de Alunos da Sala: ");
        for (Alunos i : aluno) {
            System.out.println(i.toString());

        }
        System.out.println("Total de Alunos: " + aluno.size());
        System.out.println();
    }

    public void PesquisarAlunos(ArrayList<Alunos> aluno, String matricula) {
        System.out.println("Achar o aluno pelo RA (matrícula): ");
        for (Alunos i : aluno) {
            if (matricula == i.getRA()) {
                System.out.println(i.toString());
                break;
            } 
            else {
                System.out.println("Aluno não encontrado na base de Dados");
            }
        }
        System.out.println();
    }

    public void OrdenarAlunos(ArrayList<Alunos> aluno) {
        Collections.sort(aluno);
        System.out.println("Lista Ordenada de Alunos: ");
        for (Alunos i : aluno) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    public void MediaAlunos(ArrayList<Alunos> aluno) {
        double media_final;
        System.out.println("Lista de Alunos pela Média Final: ");
        for (Alunos i : aluno) {
            media_final = ((i.getNp1() + i.getNp2()) / 2);
            System.out.println(i.toString() + "Média Final: " + media_final);
        }
        System.out.println();
    }

    public String toString() {
        return ("Nome: " + getNome() + " RA/Matrícula: " + getRA() + " Nota 1(NP1): " + getNp1() + " Nota 2(NP2): " + getNp2());
    }
}
