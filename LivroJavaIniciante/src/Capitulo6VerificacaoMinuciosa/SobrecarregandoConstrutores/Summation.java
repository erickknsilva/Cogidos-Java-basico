/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.SobrecarregandoConstrutores;

/**
 *
 * @author eric
 */
public class Summation {

    int sum;

    Summation(int x) {//
        sum = 0;
        for (int i = 1; i <= x; i++)//
        {
            this.sum += i;//referencia a variavel de instacia sum
        }
    }

    Summation(Summation ob) //para um construtor receber um objeto
    {
        this.sum = ob.sum; //referencia a variavel de instacia sum

    }

}
