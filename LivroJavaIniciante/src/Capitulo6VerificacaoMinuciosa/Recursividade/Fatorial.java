/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.Recursividade;

/**
 *
 * @author eric
 */
public class Fatorial {

    Fatorial() {

    }

    //está é um função recursiva
    int factR(int n) {
        int result;

        if (n == 1) {
            return 1;
        }
        result = factR(n - 1) * n;
        return result;
    }

    //Este é um equivalente interativo
    int factI(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
