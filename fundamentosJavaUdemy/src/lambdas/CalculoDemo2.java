/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author eric
 */
public class CalculoDemo2 {

    public static void main(String[] args) {
        // (a, b) sao parametro
        //  return a + b é o tipo de retorno

        //essa função implementa o metodo executar da interface calculo
        /*isso é labda = functions uma labda so pode sobreescrever um metodo 
        da interface functional*/
        //forma explicita
        Calculo calculo = (a, b) -> {
            return a + b;
        };//isso é uma sentença de codigo precisa ter ; no final
        System.out.println(calculo.executar(6, 4));

        //forma implicita
        /*quando nao coloca chave automaticamente existe um return associado
        ele ja vai retorna o resultado de acordo com a expressao escrita.
         */
        calculo = (a, b) -> a * b;
        System.out.println(calculo.executar(8, 3));

        calculo = (a, b) -> {
            double res = a * b;
            return res / 2;
        };
        System.out.println(calculo.executar(5, 6));

        System.out.println(calculo.legal());
        System.out.println(Calculo.muitoLegal());

    }
}
