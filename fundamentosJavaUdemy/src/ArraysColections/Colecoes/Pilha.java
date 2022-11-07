/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysColections.Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author eric
 */
public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.push("O pequeno Principe");
        livros.push("O hobbit");
        livros.push("Harry Potter");
        livros.push("Game of Trones");

        System.out.println(livros.poll());
        System.out.println(livros.poll());

        for (String livro : livros) {
            System.out.println(livro + ", ");
        }
//        Deque<String> livros = new ArrayDeque<>();
//        //Pirmeiro a entra ultimo a sair FILO First in, First out.
//
//        livros.add("Pequeno principe"); //1 a entrar =  ultimo a sair
//        livros.push("Don quixote");
//        livros.push("O hobbit"); //ultimo a entrar 1  asair
//        livros.push("O principe da persia");
//        livros.push("Harry Potter");
//        
//        for(String livro: livros){
//            System.out.println(livro);
//        }
//        
//        System.out.println();
//        System.out.println(livros.peek());//retorna valor null
//        System.out.println(livros.element());//retorna execeçao
//        System.out.println();
//
//        System.out.println(livros.poll());
//        System.out.println(livros.poll());
//        System.out.println(livros.poll());
//        System.out.println(livros.poll());
//        System.out.println(livros.poll());
//        
    }

}
