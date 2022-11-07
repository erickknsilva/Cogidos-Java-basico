/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.encapsulamento3.teste;

import OO.heranca2.Heroi;
import OO.heranca2.Heroi;
import OO.heranca2.Monstro;
import OO.heranca2.Monstro;

/**
 *
 * @author eric
 */
public class Jogo {

    public static void main(String[] args) {

        Monstro monstro = new Monstro(10, 10);

        Heroi heroi = new Heroi(10, 11);

        System.out.println("Vida do monstro = " + monstro.getVida());
        System.out.println("Vida do heroi = " + heroi.getVida());

        heroi.atacar(monstro);
        heroi.atacar(monstro);
        heroi.atacar(monstro);

        System.out.println();
        System.out.println("Vida do monstro = " + monstro.getVida());
        System.out.println(heroi.danoHeroi());

        monstro.atacar(heroi);
        monstro.atacar(heroi);
        monstro.atacar(heroi);
        System.out.println("\nVida do heroi = " + heroi.getVida());
        System.out.println(monstro.danoMonstro());

    }
}
