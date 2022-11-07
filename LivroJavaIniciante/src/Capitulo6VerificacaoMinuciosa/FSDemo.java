/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa;

/**
 *
 * @author eric
 */
public class FSDemo {

    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        //exibe as falhas silenciosas
        System.out.println("Falhou em silencio");

        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            }
        }
    }
}
