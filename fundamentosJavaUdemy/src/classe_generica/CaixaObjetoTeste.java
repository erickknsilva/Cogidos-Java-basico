/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_generica;

/**
 *
 * @author eric
 */
public class CaixaObjetoTeste {

    public static void main(String[] args) {

        CaixaObjeto caixaA = new CaixaObjeto();

        //aqui ocorre o auto-boxing passa o valor primitivo para uma classe Wrapper
        caixaA.guarda(2.3);// double -> Double

        //retorno é do tipo Object, por isso precisa fazer o cast para ser do tipo double
        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);

        CaixaObjeto caixaB = new CaixaObjeto();

        caixaB.guarda("Erick");

        //retorno é do tipo Object, por isso precisa fazer o cast para ser do tipo String
        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);
    }
}
