/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.encapsulamento3.casaB;

import OO.encapsulamento3.casaA.Ana;

/**
 *
 * @author eric
 */
public class Pedro extends Ana {

    Ana mae = new Ana();

    void testeAcesso() {
        //segredo = privado
        //facoDentroDeCasa Package
        //formaDeFalar proetected package ou herança
        //todosSabem publico para todos classes pacotes e herança

//        System.out.println(esposa.segredo); //private visivel so dentro da classe
//        System.out.println(facoDentroDeCasa); //Só acessivel no msm package
//
        System.out.println(formaDeFalar); //acessivel pq é a nivel de pacote e herança
        System.out.println(todosSabem); //acessivel pq é publico 
    }
}
