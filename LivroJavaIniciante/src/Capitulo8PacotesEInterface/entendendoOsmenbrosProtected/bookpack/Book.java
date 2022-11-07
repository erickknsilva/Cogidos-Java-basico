/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.entendendoOsmenbrosProtected.bookpack;

/**
 *
 * @author eric
 */
public class Book {// Book faz parte do pacote boockPack

    protected String title;
    protected String author;
    protected int pubDate;

    public Book(String t, String a, int d) {//construtor da classe Book
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() { //metodo de retorno
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
    
    public String getAutor(){
        return author;
    }

}
