/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseString;

/**
 *
 * @author eric
 */
public class StringArrays {

    public static void main(String[] args) {

        String strs[] = {"this", "is", "a", "test."};

        System.out.println("Array original: ");

        for (String s : strs) {
            System.out.print(s + " ");
        }

        // altere um String
        strs[1] = "was";
        strs[2] = "test, too!";

        System.out.println("\n\nModificando um array: ");
        for (String s : strs) {
            System.out.print(s + " ");
            
        }
    }
}
