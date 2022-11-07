/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers;

import java.util.function.UnaryOperator;

/**
 *
 * @author eric
 */
public class Funcoes {

    public final static UnaryOperator<String> maiuscula = m -> m.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = p -> p.charAt(0) + "";

    public final static String grito(String g) {
        return g + "!!! ";
    }

}
