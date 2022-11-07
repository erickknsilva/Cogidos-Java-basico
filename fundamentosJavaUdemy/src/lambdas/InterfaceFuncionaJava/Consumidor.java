/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas.InterfaceFuncionaJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author eric
 */
public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimirNome = prod -> System.out.println(prod.nome);

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        //imprimir.accept(p1);

        Produto p2 = new Produto("Caderno", 22.50, 0.25);
        Produto p3 = new Produto("Notebook", 3212.34, 0.09);
        Produto p4 = new Produto("Lapis", 3.34, 0.05);
        Produto p5 = new Produto("Borracha", 4, 0.09);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);//cria uma lista para receber os produtos

        System.out.println("Lista Produtos");
        produtos.forEach(imprimirNome);

        System.out.println("\nLista Preços");
        produtos.forEach(p -> System.out.println(p.preco));

        System.out.println("\nLista Descontos");
        produtos.forEach(d -> System.out.println(d.desconto));

        System.out.println();
        produtos.forEach(System.out::println);
        System.out.println();

        produtos.forEach(imprimirNome);

    }
}
