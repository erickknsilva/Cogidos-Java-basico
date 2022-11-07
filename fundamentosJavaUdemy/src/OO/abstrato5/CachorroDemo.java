/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.abstrato5;

/**
 *
 * @author eric
 */
public class CachorroDemo {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        dog.setNomeAnimal("Blade");
        System.out.println("Nome animal " + dog.getNomeAnimal());
        System.out.println("Cachorro respira " + dog.respirar());
        System.out.println("Cachorro se move " + dog.mover());
        System.out.println("Se alimenta " + dog.mamar());
    }
}
