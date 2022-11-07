/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.entendendoOsmenbrosProtected.bookpackext;

//import Capitulo8PacotesEInterface.entendendoOsmenbrosProtected.bookpack.Book; //importa só a classe
import Capitulo8PacotesEInterface.entendendoOsmenbrosProtected.bookpack.*;//importa todas classes dentro do bookpack

/**
 *
 * @author eric
 */
public class Teste  {

    public static void main(String[] args) {
        Book ob[] = new Book[3];

        ob[0] = new Book("Java: A beginner's Guide", "Schildt", 2014);
        ob[1] = new Book("Java: A beginner's Guide", "Schildt", 2014);
        ob[2] = new Book("Java: A beginner's Guide", "Schildt", 2014);

        for (int i = 0; i < ob.length; i++){
            System.out.println(ob[i].getAutor());
        }
    }

}
