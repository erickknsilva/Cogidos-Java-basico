/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package padro.obersever;

/**
 *
 * @author eric
 */
@FunctionalInterface
public interface ObservadorChegadaAniversariante {

    //recebe uma classe EventoChegadaAniversariante
    public void chegou(EventoChegadaAniversariante evento);
}
