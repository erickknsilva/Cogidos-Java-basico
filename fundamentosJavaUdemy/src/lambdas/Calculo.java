/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lambdas;

@FunctionalInterface //marca como uma interface funcional
public interface Calculo {

    /*essa é uma interface funcional, pq tem so um metodo, e consegue ter seus
    metodos sobrescrevido atraves de lambdas/functions
     */
    double executar(double a, double b);

    //metodo default/padrao nao inviabiliza a classe funcional
    default String legal() {
        return "Legal.";
    }

    //metodo static tambem nao inviabiliza a classe funcional
    static String muitoLegal() {
        return "Muito legal.";
    }
}
