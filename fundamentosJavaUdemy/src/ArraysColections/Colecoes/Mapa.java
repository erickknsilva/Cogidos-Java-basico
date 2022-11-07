/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysColections.Colecoes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author eric
 */
public class Mapa {

    public static void main(String[] args) {
        //Chaves e valores, Chaves sao do tipo Numerico
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Ana");
        usuarios.put(2, "Tuany");
        usuarios.put(3, "Erick");
        usuarios.put(4, "Gilson");

        System.out.println(usuarios.size());//Mostra o tamanho
        System.out.println(usuarios.isEmpty());//verifica se a fila esta vazia 

        System.out.println(usuarios.keySet());//Mostra todas chaves.
        System.out.println(usuarios.values());//Mostra os valore(valores aqui é o nome da pessoa)
        System.out.println(usuarios.entrySet());//Mostra todas chaves e valores

        System.out.println(usuarios.containsKey(2));//verifica se tem o valor na chave retornando True ou False
        System.out.println(usuarios.containsValue("Tuany"));//verifica se tem o valor na chave retornando True ou False
        System.out.println(usuarios.get(4));//é verificado em cima da chave passa e retorna o valor que tem nela

        System.out.println();
        System.out.println("Laços ForEach para impressao");
        for (String nome : usuarios.values())//laço para imprimir os valores 
        {
            System.out.print(nome + " ");
        }
        System.out.println();
        for (int chave : usuarios.keySet())//laço para imprimir as chaves
        {
            System.out.print(chave + " ");
        }
        System.out.println();
        
        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) //
        {
            System.out.print(registro.getKey() + " -> ");//Imprimir as chaves
            System.out.println(registro.getValue());//imprimi os valores 
        }
        System.out.println();
        for(Map.Entry<Integer, String> registro2: usuarios.entrySet()){
            System.out.println(registro2);
        }
    }
}
