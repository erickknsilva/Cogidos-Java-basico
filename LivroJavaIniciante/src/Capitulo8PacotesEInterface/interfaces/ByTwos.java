/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.interfaces;

/**
 *
 * @author eric
 */
class ByTwos implements Series {

    int previos;
    int start;
    int valor;

    ByTwos() {
        start = 0;
        valor = 0;
        previos = -2;
    }

    public int getNext() {
        previos = valor;
        valor += 2;
        return valor;
    }

    public void reset() {
        valor = start;
        previos = start - 2;
    }

    public void setStart(int x) {
        start = x;
        valor = x;
        previos = x - 2;
    }

    int getValor() {
        return valor;
    }

    int getPrevios() {
        return previos;
    }

}
