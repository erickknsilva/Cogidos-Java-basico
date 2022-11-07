/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padro.obersever;

import java.util.Date;

/**
 *
 * @author eric
 */
public class EventoChegadaAniversariante {

    //declaro uma variavel da Classe Date,
    //momento em que o evento aconteceu
    private final Date momento;

    //construtor recebe uma variavel do tipo Date.
    public EventoChegadaAniversariante(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return this.momento;
    }

}
