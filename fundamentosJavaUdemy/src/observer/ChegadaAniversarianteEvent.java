/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.Date;

/**
 *
 * @author eric
 */
public class ChegadaAniversarianteEvent {

    private final Date horaDaChegada;

    public ChegadaAniversarianteEvent(Date horaDaChegada) {
        this.horaDaChegada = horaDaChegada;
    }

    public Date getHoraDaChegada() {
        return horaDaChegada;
    }

}
