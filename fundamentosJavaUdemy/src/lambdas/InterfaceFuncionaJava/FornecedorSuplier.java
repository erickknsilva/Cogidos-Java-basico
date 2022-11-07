/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas.InterfaceFuncionaJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author eric
 */
public class FornecedorSuplier {

    public static void main(String[] args) {

        Supplier<List<String>> umaLista = () -> Arrays.asList("Bia", "lia", "Ana", "Gui");

        System.out.println(umaLista.get());

    }

}
