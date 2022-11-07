/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa;

/**
 *
 * @author eric
 */
public class FilaPrivada {
   
    private char[] q;  // esse array contem a fila
    private int putloc, getloc; //is índices de put e get

    FilaPrivada(int size) {
        q = new char[size]; // aloca memoria para a fila
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queu is full. ");
            return;
        }
        q[putloc++] = ch;
       
    }

    char get() {
        if (getloc == putloc) {
            System.out.println("A fila está vazia.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
