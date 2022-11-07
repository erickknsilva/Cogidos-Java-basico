/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.Composicao1.UmPraUm;

/**
 *
 * @author eric
 */
public class Motor {

    boolean ligado = false;
    double injecaoGasolina = 1;
    Carro carro;
    
   
    Motor (Carro carro){
        this.carro = carro;
    }

    
    int giros() {

        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(injecaoGasolina * 3000);
        }
    }

}
