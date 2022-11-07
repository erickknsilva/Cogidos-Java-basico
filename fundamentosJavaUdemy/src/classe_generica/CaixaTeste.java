/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_generica;

/**
 *
 * @author eric
 */
public class CaixaTeste {
    
    public static void main(String[] args) {
        
        Caixa<String> caixaA = new Caixa<>();
        
        caixaA.guardar("Erick Silva");
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);
        
        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(003.08);
        
        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
        
        
    }
}
