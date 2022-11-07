/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.fundamentosMetodosPadraoDeInterface;

/**
 *
 * @author eric
 */
public class DefaultMethodDemo {

    public static void main(String[] args) {

        MyIfImp obj = new MyIfImp();
        MyIFImp2 ob = new MyIFImp2();

        //pode chamar o metodo getUserID(), porque ele é
        //implementado explicitamente por MyIFImp
        System.out.println("User ID is " + obj.getUserID());

        //tambem pode chamar getAdmin, por causa da implementaçao da
        //implementação padrão
        System.out.println("Administrator ID é " + obj.getAdminID());

        System.out.println("\nUser ID is " + ob.getUserID());
        System.out.println("Administrator ID é " + ob.getAdminID());

    }
}
