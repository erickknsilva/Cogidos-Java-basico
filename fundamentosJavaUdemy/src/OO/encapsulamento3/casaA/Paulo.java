/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.encapsulamento3.casaA;

/**
 *
 * @author eric
 */
public class Paulo {

    void testeAcesso() {
        Ana esposa = new Ana();

        //segredo = privado
        //facoDentroDeCasa Package
        //formaDeFalar proetected package ou herança
        //todosSabem publico para todos classes pacotes e herança
//        System.out.println(esposa.segredo); //private visivel so dentro da classe
        System.out.println(esposa.facoDentroDeCasa); //acessivel pq esta no mesmo pacote
        System.out.println(esposa.formaDeFalar); //acessivel pq é a nivel de pacote e herança
        System.out.println(esposa.todosSabem); //acessivel pq é publico 
    }

}
