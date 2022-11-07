/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.AcessandoObjetos;

/**
 *
 * @author eric
 */
public class AcessoDemo {

    public static void main(String[] args) {

        Acesso obj = new Acesso();
        
         //o acesso alpja só é permitido por intermedio do seus acessadores
        obj.setAlpha(-99);
        System.out.println("obj.alpha is " + obj.getAlpha());
        
        //Nao pode acessar dessa forma pq a variavel é private
        //obj.alpha = 10;
        
        //aqui consegue pq sao public
        obj.beta = 88;
        obj.gama = 99;
        
    }
}
