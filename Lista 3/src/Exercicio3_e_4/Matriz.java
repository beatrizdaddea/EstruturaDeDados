/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3_e_4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Matriz {
    
public int getLinha_atual() {
        return linha_atual;
    }

    public void setLinha_atual(int linha_atual) {
        this.linha_atual = linha_atual;
    }

    public int getColuna_atual() {
        return coluna_atual;
    }

    public void setColuna_atual(int coluna_atual) {
        this.coluna_atual = coluna_atual;
    }

    public ArrayList getValores() {
        return valores;
    }

    public void setValores(ArrayList valores) {
        this.valores = valores;
    }

    public int getSoma() {
        return Soma;
    }

    public void setSoma(int Soma) {
        this.Soma = Soma;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    private int linha;
    private int coluna;
    private int valor; 
    private int Soma;
    private ArrayList valores;
    private int linha_atual;
    private int coluna_atual;
    
    public void matriz(ArrayList<Matriz> a,int linha, int coluna, int valor2){
        Scanner mat = new Scanner(System.in);
        // valores estão sendo gerados de maneira aleatória
        System.out.print("Insira a quantidade de linhas da sua matriz: ");
        setLinha(mat.nextInt());
        System.out.print("Insira a quantidade de colunas da sua matriz: ");
        setColuna(mat.nextInt());
        System.out.println("Total de Linhas: " + getLinha());
        System.out.println(" Total de Colunas: " + getColuna());
        
        Random valor = new Random();
        
        ArrayList<Integer> valores = new ArrayList<Integer>();
                
        setLinha_atual(0);
        setColuna_atual(0);
        
        int matriz[][] = new int [getColuna()][getLinha()];
        
        for (int l=0; l < getLinha(); l++){
            for (int c=0; c < getColuna(); c++){
                setValor(valor.nextInt(100));
                matriz[c][l] = getValor();
                valores.add(getLinha_atual());
                valores.add(getColuna_atual());
                valores.add(getValor()); 
                System.out.print(" " + matriz[c][l] + " ");
                setLinha_atual(c + 1);
            }
            System.out.println("\n");
            setColuna_atual(l + 1);
        }
        
        System.out.println("Valores: " + valores);
    }
    
    public Matriz(int l, int c, int v){
        setLinha(l);
        setColuna(c);
        setValor(v);
    }
    
    // Exercicio 4 
    public void metodos(){
        Scanner mat4 = new Scanner(System.in);
        // valores estão sendo gerados de maneira aleatória 
        System.out.print("Insira a quantidade de linhas da sua matriz: ");
        setLinha(mat4.nextInt());
        System.out.print("Insira a quantidade de colunas da sua matriz: ");
        setColuna(mat4.nextInt());

        Random valor = new Random();
        ArrayList<Integer> valores2 = new ArrayList<Integer>();
                
        setLinha_atual(0);
        setColuna_atual(0);
        setSoma(0);
        
        int matriz[][] = new int [getColuna()][getLinha()];
        int matriz_transposta[][] = new int [getLinha()][getColuna()];
        
        for (int l=0; l < getLinha(); l++){
            for (int c=0; c < getColuna(); c++){
                setValor(valor.nextInt(100));
                matriz[c][l] = getValor();
                valores2.add(getValor());
                System.out.print(" " + matriz[c][l] + " ");
                setSoma(getSoma() + getValor());
            }
            System.out.println("\n");
        }
        
        System.out.println("Soma dos valores: " + getSoma());
        
        System.out. println("A matriz transposta: ");
        
        for (int c=0; c < getColuna(); c++){
            for (int l=0; l < getLinha(); l++){
                setValor(valor.nextInt(100));
                matriz_transposta[l][c] = matriz[c][l];
                valores2.add(getValor());
                System.out.print(" " + matriz_transposta[l][c] + " ");
            }
            System.out.println("\n");
        }
    }   
}
