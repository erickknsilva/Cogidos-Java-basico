/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo9TratamentoDeExeccoes.usandoTryCatch1.usandothrows9;

import java.io.IOException;

/**
 *
 * @author eric
 */
public class ThrowsDemo {

    public static char prompt(String str)
            throws java.io.IOException {

        System.out.println(str + ":");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Digite uma letra"); // ja que o metodo prompt() pode lançar
            //uma exceçao uma chamada a ele deve ser inserida
        }//
        catch (IOException obh) {
            System.out.println("I/O exception occurred.");
            ch = 'X';
        }
        System.out.println("Você pressionou " + ch);
    }
}
