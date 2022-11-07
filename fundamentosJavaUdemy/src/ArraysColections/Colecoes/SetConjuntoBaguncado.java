/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysColections.Colecoes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author eric
 */
public class SetConjuntoBaguncado {

    public static void main(String[] args) {

        //Set nao aceita tipos primitivo, nem valores repetidos, nao respeita a ordem de insercao
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);//aqui o tipo é double, mais ele converte pra um Wrapper = Double
        conjunto.add(true);//aqui o tipo é boolean, mais ele converte pra um Wrapper = Boolean
        conjunto.add("Teste");//String ja é um objeto 
        conjunto.add(1); //aqui o tipo é int, mais ele converte pra um Wrapper = Integer
        conjunto.add('x');//aqui o tipo é char, mais ele converte pra um Wrapper = Character

        System.out.println(conjunto.size()); //informa o tamanho do conjunto
        System.out.println(conjunto.remove("Teste"));//remove um elemento
        System.out.println(conjunto.contains(1.2));//verifica se tem o valor passado na lista

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        conjunto.addAll(nums); //faz a uniao de conjunto com nums alterando o valor de conjunto
        System.out.println(conjunto);

        nums.addAll(conjunto);
        System.out.println(nums);//faz a uniao de nums com conjunto alterando o valor de nums

        conjunto.retainAll(nums);/*Intersecao dos valores do conjunto, mostram se eles é igual
                                 para usar esse tem que comentar os de outros*/
        System.out.println(conjunto);

        conjunto.clear();//limpar o conjunto
        System.out.println(conjunto);
    }
}
