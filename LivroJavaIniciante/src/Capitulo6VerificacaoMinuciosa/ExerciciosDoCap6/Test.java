/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.ExerciciosDoCap6;

/**
 *
 * @author eric
 */
public class Test {

    int a;

    Test() {
    }

    Test(int i) {
        a = i;
    }

    void swap(Test ob1, Test ob2) {
        int t;
        t = ob1.a;
        ob1.a = ob2.a;
        System.out.println(ob1.a);
        ob2.a = t;

        System.out.println(ob2.a);
    }

    int somaArgs(int... v) {
        System.out.println("Numeros de argumentos " + v.length);
        System.out.println("Cóntem: ");
        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            System.out.println("Valores dos argumentos: " + v[i]);
            soma += v[i];
        }
        int resultado = soma;
        System.out.println("\nA soma total dos argumentos = " + resultado);
        return soma;
    }

//    String meth(int e, int b) {
//        a = e + b;
//
//        int soma = +a;
//        return "A soma de A + B = ";
//    }
}
