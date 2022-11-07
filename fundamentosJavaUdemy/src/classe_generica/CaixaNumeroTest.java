/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_generica;

/**
 *
 * @author eric
 */
public class CaixaNumeroTest {

    public static void main(String[] args) {

        CaixaNumero<Double> caixaA = new CaixaNumero<>();

        caixaA.guardar(2.3);
        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(23);
        System.out.println(caixaB.abrir());

        CaixaNumero<Long> caixaC = new CaixaNumero<>();
        caixaC.guardar(11153L);
        System.out.println(caixaC.abrir());
    }
}
