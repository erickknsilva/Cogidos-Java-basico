/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.AcessandoObjetos;

/**
 *
 * @author eric
 */
public class PassObRef {

    public static void main(String[] args) {
        PassOb ob = new PassOb(15, 20);

        System.out.println("A and B before call: " + ob.a + " " + ob.b);;

        ob.change(ob);
        System.out.println("A and B before call: " + ob.a + " " + ob.b);;

    }

}
