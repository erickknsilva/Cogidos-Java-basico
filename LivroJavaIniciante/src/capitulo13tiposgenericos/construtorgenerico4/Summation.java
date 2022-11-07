/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.construtorgenerico4;

/**
 *
 * @author eric
 */
public class Summation {

    private int sum;

    //construtor pode receber qualquer valor Numerico pq extends a classe Number,
    // superclasse de todas classe numericas Integer,float,double,long etc
    <T extends Number> Summation(T args) {//contrutor recebe uma referencia de tipo T 0
        sum = 0;
        for (int i = 0; i <= args.intValue(); i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }

}
