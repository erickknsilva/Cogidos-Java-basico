/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.ExerciciosDoCap6;

/**
 *
 * @author eric
 */
public class SumIt {

    int sum(int... v) {
        System.out.println("Numeros de argumentos " + v.length);
        System.out.println("Cóntem: ");
        int resul = 0;

        for (int i = 0; i < v.length; i++) {
            System.out.println("Valores dos argumentos: " + v[i]);
            resul += v[i];
        }
        return resul;
    }
}
