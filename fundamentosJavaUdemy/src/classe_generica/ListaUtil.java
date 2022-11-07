/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_generica;

import java.util.List;

/**
 *
 * @author eric
 */
public class ListaUtil {

    //metodo nao generico
    public static Object getUltimo1(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    //metodo generico
    public static <T> T getUltimo2(List<T> lista) {
        return lista.get(lista.size() - 1);
    }

}
