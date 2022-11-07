/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.EstendendoAClasseVeiculo;

/**
 *
 * @author eric
 */
public class Truck extends Veiculo {

    private int cargocap;//capacidade de transporte de carga em libras

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        this.cargocap = c;
    }

    //metodo acessadores para cargocap
    int getCargo() {
        return this.cargocap;
    }

    void putCargo(int c) {
        this.cargocap = c;
    }
}
