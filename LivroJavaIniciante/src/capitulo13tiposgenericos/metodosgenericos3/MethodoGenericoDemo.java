/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.metodosgenericos3;

//Demonstra um método genérico simples.
import java.text.DecimalFormat;

public class MethodoGenericoDemo {

    //T extends Comparable<T> é o primeiro parametro e extends a classe comparable<T>
    // V extends T é o segundo parametro e extends T
    //metodo generico os parametro de tipos devem ser declarados antes do seu tipo de retorno
    static <T extends Comparable<T>, V extends T>
            boolean arraysEquals(T[] x, V[] y) //metodo generico
    {
        //se o tamanho dos arrays for diferentes, os arrays tabem serão
        if (x.length != y.length) { //se o tamanho de arrays for diferente retorna falso
            return false;
        }

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) {//verifica se os valores sao diferentes
                //se !x[i].equals[i] for diferente, retorna falso
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,0");
        Integer[] nums = {1, 2, 3, 4, 5};
        Integer[] nums2 = {1, 2, 3, 4, 5};
        Integer[] nums3 = {1, 2, 7, 4, 5};
        Integer[] nums4 = {1, 2, 7, 4, 5, 6};

        if (arraysEquals(nums, nums)) {
            System.out.println("nums eh igual a nums");
        }

        if (arraysEquals(nums, nums2)) {
            System.out.println("nums eh igual a nums2");
        }

        if (arraysEquals(nums, nums3)) {
            System.out.println("nums eh diferente de nums3");
        }

        if (arraysEquals(nums, nums4)) {
            System.out.println("nums he diferente de nums4");
        }

        //essa parte não sera compilada, porque nums
        //e dvals nao sao do mesmo tipo.
//        Double dvals[] = {1.0, 2.0, 3.0, 4.0, 5.0};
//        if (arraysEquals(nums, dvals)) {
//            System.out.println("dvals e igual dvals2");
//        }
    }
}
