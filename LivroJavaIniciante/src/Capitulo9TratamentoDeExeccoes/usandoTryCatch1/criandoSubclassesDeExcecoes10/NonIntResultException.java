/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  Capitulo9TratamentoDeExeccoes.usandoTryCatch1.criandoSubclassesDeExcecoes10;

/**
 *
 * @author eric
 */
public class NonIntResultException extends Exception {

    int n, d;
    String nome;

    public NonIntResultException(int a, int b) { //contrutor com parametro de 2 inteiros
        n = a;
        d = b;
    }


    public String toString() { //retorna o erro
        return "Resultado de " + n + " / " + d + " e fracionario.";
    }

}
