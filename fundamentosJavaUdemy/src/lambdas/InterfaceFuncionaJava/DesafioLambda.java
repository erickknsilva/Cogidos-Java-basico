/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas.InterfaceFuncionaJava;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author eric
 */
public class DesafioLambda {

    public static void main(String[] args) {

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        Function<Produto, Double> precoProduto
                = prod -> prod.preco * (1 - prod.desconto);
//        System.out.printf("%.2f", precoProduto.apply(p));

        UnaryOperator<Double> impostoMunicipal = m -> m >= 2500 ? m * 1.085 : m;

        UnaryOperator<Double> frete = f -> f >= 3000 ? f + 100 : f + 50;

        UnaryOperator<Double> arredondar
                = preco -> Double.parseDouble(String.format("%.2f", preco));

        Function<Double, String> formatar = preco -> ("R$ " + preco).replace(",", ".");

        double precoFinal = precoProduto
                .andThen(impostoMunicipal)
                .andThen(frete)
                .apply(p);

        System.out.printf("Valor final do produto %.2f\n", precoFinal);

    }
}
