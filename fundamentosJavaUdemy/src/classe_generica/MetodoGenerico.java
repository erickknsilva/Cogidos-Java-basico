/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_generica;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author eric
 */
public class MetodoGenerico {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("Js", "Php ", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLangs = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLangs);

        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);

        System.out.println("\nMétodo generico...");
        String ultimaLangs2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLangs);

        Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNumero2);
    }

}
