/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysColections.Colecoes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eric
 */
public class Lista {

    public static void main(String[] args) {

        /*Lista
        1 - é Ordenada
        2- Consegue acessar atraves do indice 
         */
        //pode ser List ou ArrayList<>
        List<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3).nome);//Pegar o valor que esta no indice
        System.out.println("Tamanho da lista = " + lista.size());//Mostar o tamanho da lista
        System.out.println(lista.remove(1).imprimirNome() + " Fui excluido."); //para excluir um valor da lista e exibe o valor
        System.out.println(lista.remove(new Usuario("Manu")));//exclui o nome da lista e retorna verdadeiro se ele estiver contido na lista
        System.out.println();

        for (Usuario u : lista) {
            System.out.println(u.imprimirNome());
        }
    }
}
