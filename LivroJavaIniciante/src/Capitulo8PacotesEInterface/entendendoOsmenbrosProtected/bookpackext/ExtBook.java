/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.entendendoOsmenbrosProtected.bookpackext;

import Capitulo8PacotesEInterface.entendendoOsmenbrosProtected.bookpack.Book;

/**
 *
 * @author eric
 */
public class ExtBook extends Book {

    private String publisher;

    //construtor da classe ExtBook e implementando publisher
    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() { //metodo de retorno sobreposto
        super.show();//chama o metodo da super classe + o da subclasse
        System.out.println("publiser");
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }


    /*essa instrução esta correta poruqe 
    subclasse podem acessar um menbro protegido
     */
    public String getTitle() {
        return title;// title é protected na classe pai e nao private
    }

    public String getAuthor() {
        return author;
    }

    public int getDate() {
        return pubDate;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void SetDate(int d) {
        pubDate = d;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

}
