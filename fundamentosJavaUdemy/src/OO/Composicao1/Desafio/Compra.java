/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.Composicao1.Desafio;

import java.util.ArrayList;

/**
 *
 * @author eric
 */
public class Compra {

    final ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade) {
        this.itens.add(new Item(p, quantidade));
    }

    void adicionarItem(String nome, int quantidade, double preco) {
        Produto produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }

    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
