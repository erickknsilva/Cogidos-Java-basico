/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.filter.desafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author eric
 */
public class DesafioFilterResposta {

    public static void main(String[] args) {

        Produto2 p1 = new Produto2("Lapis,", 1.99, 0.35, 0);
        Produto2 p2 = new Produto2("Notebook,", 4899.89, 0.32, 0);
        Produto2 p3 = new Produto2("Caderno,", 30, 0.45, 0);
        Produto2 p4 = new Produto2("Impressora,", 1200, 0.40, 0);
        Produto2 p5 = new Produto2("Ipad,", 3100, 0.29, 0);
        Produto2 p6 = new Produto2("Relogio,", 1900, 0.12, 0);
        Produto2 p7 = new Produto2("Monitor,", 800, 0.31, 0);

        List<Produto2> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto2> superDesconto = d -> d.desconto >= 0.3;
        Predicate<Produto2> freteGratis = f -> f.frete == 0;
        Predicate<Produto2> produtoRelevante = p -> p.preco >= 500;

        Function<Produto2, String> chamadaPromocional
                = p -> "Aproveite! " + p.nome + " por " + p.preco;

        produtos.stream()
                .filter(superDesconto)
                .filter(freteGratis)
                .filter(produtoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);

    }
}
