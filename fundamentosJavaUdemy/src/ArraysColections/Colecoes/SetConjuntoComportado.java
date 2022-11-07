/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysColections.Colecoes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author eric
 */
public class SetConjuntoComportado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Set nao respeita a ordem de inserção, nao tem ordenaçao
        HashSet<String> lista = new HashSet<>();

        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Erick");
        lista.add("Pedro");

        for (String nome : lista) {
            System.out.println(nome);
        }

        System.out.println();

        /*TreeSet é pra imprimir ordem alfabetica ou ordem numerica, 
        insercao TreeSet vem da classe SortedSet*/
        SortedSet<String> nomeLista = new TreeSet<>();

        nomeLista.add("Ana");
        nomeLista.add("Abner");
        nomeLista.add("Carlos");
        nomeLista.add("Erick");
        nomeLista.add("Pedro");

        for (String listaNome : nomeLista) {
            System.out.println(listaNome);
        }
        int[][] vetor = new int[5][5];

        Set<Integer> nums = new HashSet<>();

        nums.add(4);
        nums.add(-3);
        nums.add(2);
        nums.add(-1);

        //para imprimir em ordem usar o TreeSet
        System.out.println();
        for (int nums2 : nums) {
            System.out.print(nums2 + " ");
        }

    }

}
