/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa;

/**
 *
 * @author eric
 */
public class FailSoftArray {

    private int[] a;//referencia o array
    private int errval;//valor que vai ser retornado se get falhar
    int length;

    /*Controi o array dados seu tamanho e o valor*/
    FailSoftArray(int size, int errv) {
        this.a = new int[size];
        this.errval = errval;
        this.length = size;
    }

    boolean indexOk(int index) {
        if (index >= 0 & index < length) {
            return true;
        }
        return false;
    }

    //retorna o valor do indice especificado
    public int get(int index) {
        if (indexOk(index)) {
            return a[index];
        }
        return errval;
    }

    boolean put(int index, int val) {
        if (indexOk(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

}
