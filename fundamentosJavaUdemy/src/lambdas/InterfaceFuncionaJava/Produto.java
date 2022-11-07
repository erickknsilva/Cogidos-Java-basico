/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas.InterfaceFuncionaJava;

/**
 *
 * @author eric
 */
public class Produto {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        double precoFinal = preco * (1 - desconto);
        System.out.printf("%s tem preço de R$ %.2f ", nome, precoFinal);
//        return nome + " tem preço de R$ " + precoFinal;
        return "";
    }
}
