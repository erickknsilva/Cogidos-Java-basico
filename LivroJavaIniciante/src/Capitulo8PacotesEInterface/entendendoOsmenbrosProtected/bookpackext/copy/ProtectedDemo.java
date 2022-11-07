/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.entendendoOsmenbrosProtected.bookpackext.copy;

/**
 *
 * @author eric
 */
public class ProtectedDemo {

    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[3];

        books[0] = new ExtBook("Java: A beginner's Guide", "Schildt", 2014, "Mcgraw-Hill Professional");
        books[1] = new ExtBook("Java: comleto referenc", "Schildt", 2014, "McGraw-Hill professional");
        books[2] = new ExtBook("The art of Java", "Schildt", 2003, "McGraw-Hill professional");

        
        System.out.println("Mostrando todos os livros de schildt.");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == "Schildt") {
                System.out.println(books[i].getTitle());
            }
        }
    }
}
