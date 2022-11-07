/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.abstrato5;

/**
 *
 * @author eric
 */
public abstract class Animal {

    String nome;

    public abstract String respirar();

    public abstract String mover();

    void setNomeAnimal(String n) {
        nome = n;
    }

    String getNomeAnimal() {
        return this.nome;
    }
}
