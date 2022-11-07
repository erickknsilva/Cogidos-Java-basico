/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.polimorfismo4;

/**
 *
 * @author eric
 */
public abstract class Comida { //classe abstrata nao pode ser instanciada

    private double peso;

    Comida(double peso) {
        setPeso(peso);
    }

    double getPeso() {
        return this.peso;
    }

    void setPeso(double p) {
        if (p >= 0) {
            this.peso = p;
        }
    }

}
