/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.AcessandoObjetos;

/**
 *
 * @author eric
 */
public class PassOb {

    int a, b;

    PassOb() {

    }

    PassOb(int i, int j) {
        a = i;
        b = j;
    }

    void change(PassOb ob) {//recebe um objeto
        ob.a = ob.a + ob.b; //
        ob.b = -ob.b;
    }

}
