/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseEObjetoSubclasse;

/**
 *
 * @author eric
 */
public class X {

    int a;

    X() {

    }

    X(int i) {
        a = i;
    }

    int getA() {
        System.out.println("O valor: " + a);
        return this.a;
    }

    void listaDeNomes(String... nome) {
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nome " + (i + 1) + " " + nome[i]);
        }
    }
}
