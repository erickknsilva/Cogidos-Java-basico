/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseString;

/**
 *
 * @author eric
 */
public class CriandoString {

    public static void main(String[] args) {
        //String é um objeto
        String str = new String("Ol� Erick, tudo bem ?");
        String str2 = new String(str);
        String str3 = new String("tranquilo");

        int a = 10, b = 5;

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str.equals(str2));// equals é um tipo booleano e verifica se as variaveis é igual
        System.out.println(str.length()); // length é do tipo inteiro e verifica o tamanho do String
        System.out.println(str.charAt(2)); // charAt é do tipo char e obtém o caractere do indice especificado.
        System.out.println(str.compareTo(str2)); /* compareTo é do tipo int retorna >0 e se o string chamador,
        for maior, e se o string chamado for menor retorna <0*/
        System.out.println(str.indexOf("rick")); /*Procura no string chamador o substring especificado por str.
        Retorna o indice da mesma ocorrência ou -1 em caso de falha.*/
        System.out.println(str.lastIndexOf("e"));/*procura no string chamador especifado por str.
        Retorna o indice da ultima ocorrência em caso de falha*/
        

    }
}
