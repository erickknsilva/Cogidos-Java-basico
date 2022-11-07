/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.polimorfismo4;

/**
 *
 * @author eric
 */
public class Pessoa {

    private double peso;

    Pessoa(double peso) {
        setPeso(peso);
    }

    void comer(Comida ob) {
        this.peso += ob.getPeso();
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
