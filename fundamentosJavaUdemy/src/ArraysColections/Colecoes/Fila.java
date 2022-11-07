/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysColections.Colecoes;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author eric
 */
public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        /*Offer e add adicionam elementos na fila 
        a diferença é no comportamento quando a fila esta cheia 
        */
        fila.add("ana");//Caso a fila esteja cheia e tente adicionar alguem vai gerar um erro
        fila.offer("Bia");/*caso a fila esteja cheia e tente adicionar alguem offer, 
                            não vai conseguir adicionar e nao vai apresentar erro, vai gerar mais um exceção*/
        fila.add("Carlos");
        fila.add("Daniel");
        fila.add("Rafaela");
        fila.add("Gui");
        
        //Peek e element -> obtem o proximo elemento da fila sem remover
        //Diferença é o comportamento ocorre quando a fila está vazia 
        
        System.out.println(fila.peek());/*peek() Recupera, mas não remove, o cabeçalho desta fila ou
                                          retorna null se esta fila estiver vazia.
                                          return:a cabeça desta fila, ou null se esta fila for vazia*/
        System.out.println(fila.peek());
        System.out.println(fila.element());//Lança uma exceção quando a fila está vazia
        System.out.println(fila.element());//
        System.out.println();
//        fila.size();//para saber o tamanho da fila
//        fila.clear();// limpa a fila
//        fila.isEmpty();//para saber se a fila esta vazia 
//        file.contains();

          System.out.println(fila.poll());//se a fila estiver vazia ele retorna nulo 
          System.out.println(fila.remove()); //lança uma exeção
          System.out.println(fila.poll());
          System.out.println(fila.poll());
          System.out.println(fila.poll());
          System.out.println(fila.poll());
          System.out.println(fila.poll());
          System.out.println(fila.poll());
          System.out.println(fila.poll());
//          System.out.println(fila.remove());
    }
}
