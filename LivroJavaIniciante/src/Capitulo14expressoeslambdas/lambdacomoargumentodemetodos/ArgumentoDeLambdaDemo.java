/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo14expressoeslambdas.lambdacomoargumentodemetodos;

/**
 *
 * @author eric
 */
public class ArgumentoDeLambdaDemo {

    /*metodo statico pertence a essa classe e pode ser chamado sem referencia de
    objeto.
    Esse metodo recebe como parametro uma instancia de interface e uma string
    e o tipo de retorno é um tipo String
     */
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    /*Observacao: metodos static aceitam expressoes lambdas sendo criados direto
    dentro do seu parametro.
     */
    public static void main(String[] args) {

        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Entrada da string " + inStr);

        //define uma expressao lambda que inverte o conteudo da string
        StringFunc reverset = (str) -> {
            String result = new StringBuilder(str).reverse().toString();
//            String result = "";
//            for (int i = str.length() - 1; i >= 0; i--) {
//                result += str.charAt(i);
//            }
            return result;
        };

        /*Passa uma expressao lambda instancia da interface StringFunc, 
        e uma string de entrada como segundo argumento. No metodo changeStr()*/
        outStr = changeStr(reverset, inStr);
        System.out.println("String ao contrario: " + outStr);

        /*esta expressao lambda substitui espacos por hifens, ela está sendo
        criada diretamente dentro do parametro changeStr*/
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("String com hifen: " + outStr);

        StringFunc invererFonte = (str) -> {
            String result = "";
            char ch;

            for (int i = 0; i < str.length(); i++)//
            {
                ch = str.charAt(i); //ch recebe o valor passado para String str

                if (Character.isUpperCase(ch))//determina se um caracter é MAIUSCULO
                {
                    //se o caracter for MAIUSCULO ele vai ser convertido para minusculo
                    result += Character.toLowerCase(ch);
                } //
                else {
                    //se a condicao de cima for falsa, ou seja se o caracter for 
                    //minusculo, ele vai transformar em MAIUSCULO
                    result += Character.toUpperCase(ch);
                }
            }
            return result;
        };

        outStr = changeStr(invererFonte, inStr);
        System.out.println("Letra minuscula para maiuscula: " + outStr);
         
       
    }
}
