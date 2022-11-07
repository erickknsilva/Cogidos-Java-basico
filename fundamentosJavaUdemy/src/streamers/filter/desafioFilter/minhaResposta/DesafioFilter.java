/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamers.filter.desafioFilter.minhaResposta;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author eric
 */
public class DesafioFilter {

    public static void main(String[] args) {

        Produto p1 = new Produto("Moto g9,", 2500, 0.30, 10);
        Produto p2 = new Produto("Moto g11,", 3500, 0.30, 0);
        Produto p3 = new Produto("Notebook Dell,", 4000, 0.10, 0);
        Produto p4 = new Produto("Maquina de Lavar,", 3250, 0.10, 0);
        Produto p5 = new Produto("Samsung a41,", 1200, 0.30, 0);
        Produto p6 = new Produto("Bicileta aro 20,", 1500, 0.30, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Predicate<Produto> temDesconto = d -> d.desconto >= 0.3;

        Predicate<Produto> freteGratis = p -> p.frete == 0;

        Predicate<Produto> prodRelevante = p -> p.preco >= 500;

        Function<Produto, String> chamadaPromocao = s
                -> "Aproveite! " + s.nome + " de R$" + s.preco
                + "\npor preco R$" + (s.preco * (1 - s.desconto)) + " Super promoção\n";

        produtos.stream()
                .filter(temDesconto)
                .filter(freteGratis)
                .filter(prodRelevante)
                .map(chamadaPromocao)
                .forEach(System.out::println);

    }
}
