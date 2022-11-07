/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author eric
 */
public class AniversarioSurpresa {

    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();
        
        porteiro.addChegadaAniversarinte(namorada);
        
        porteiro.start();
    }

}
