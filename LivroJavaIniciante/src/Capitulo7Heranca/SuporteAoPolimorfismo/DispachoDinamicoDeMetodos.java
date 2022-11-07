/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuporteAoPolimorfismo;

/**
 *
 * @author eric
 */
public class DispachoDinamicoDeMetodos {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 superOb1 = new Sub1();
        Sub2 superOb2 = new Sub2();
        
        Sup supRef;
        
        supRef = superOb2;
        supRef.who();
        
        supRef = superOb1;
        supRef.who();
        
        supRef = superOb;
        supRef.who();
        
    }
}
