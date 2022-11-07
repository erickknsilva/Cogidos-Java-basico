/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas.InterfaceFuncionaJava;

import java.util.function.Predicate;

/**
 *
 * @author eric
 */
public class Predicado {

    public static void main(String[] args) {

        //Predicate é do tipo boolean
        //prod é um parametro do tipo da classe produto ou seja uma instancia da classe produto
        Predicate<Produto> isCaro = prod -> false;

        isCaro = prod -> prod.preco * (1 - prod.desconto) >= 750;

        Produto produto = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isCaro.test(produto));

    }
}
