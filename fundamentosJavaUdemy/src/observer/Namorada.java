/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author eric
 */
public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Apagar as luzes...");
        System.out.println("Fazer silêncio...");
        System.out.println("Surpresa!!!");
    }

}
