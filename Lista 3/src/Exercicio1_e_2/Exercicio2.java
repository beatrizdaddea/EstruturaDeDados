package Exercicio1_e_2;

import java.util.ArrayList;

public class Exercicio2 {

    public static void main(String[] args) {
        // Exercicio 2 --> métodos 
        ArrayList<Alunos> lista_alunos = new ArrayList();
        lista_alunos.add(new Alunos("Beatriz Chieffi", "N6957-F4", 8.0, 9.0));
        lista_alunos.add(new Alunos("Julia Santos", "N6758-T4", 6.0, 9.0));
        lista_alunos.add(new Alunos("Pedro Silva", "L67P8-I4", 10.0, 6.0));
        lista_alunos.add(new Alunos("Ana Silva", "L0788-I9", 8.0, 9.0));
        // System.out.println("Lista de Alunos: " + lista_alunos);
        
        Alunos b = new Alunos(); // metodos 
        b.MostrarAlunos(lista_alunos);
        //lista_alunos.size();
        b.OrdenarAlunos(lista_alunos);
        b.PesquisarAlunos(lista_alunos, "N6957-84");
        b.PesquisarAlunos(lista_alunos, "N6957-F4");

        b.MediaAlunos(lista_alunos);

    }

}
