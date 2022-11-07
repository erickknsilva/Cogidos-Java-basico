/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.abstrato5;

/**
 *
 * @author eric
 */
public class Cachorro extends Mamifero {

    @Override
    public String respirar() {
        return "Oxigênio";
    }

    @Override
    public String mamar() {
        return "Usando leite";
    }

    @Override
    public String mover() {
        return "Usando as patas";
    }

}
