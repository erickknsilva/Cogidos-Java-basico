/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseString;

/**
 *
 * @author eric
 */
public class AlterandoString {

    public static void main(String[] args) {

        String orgstr = "Java makes the Web move";

        // controi um substring
        String substr = orgstr.substring(5, 18); //Essa linha cria um novo string contendo o substring desejado.

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);

        String a = "Erick";
        String b = orgstr.replace("Java", a);

        System.out.println(b);
    }
}
