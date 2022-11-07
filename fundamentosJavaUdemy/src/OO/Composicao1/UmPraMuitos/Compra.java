/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.Composicao1.UmPraMuitos;

import java.util.ArrayList;

/**
 *
 * @author eric
 */
public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>(); //Criar uma lista do tipo classe = Objeto Item

    Compra() {
    }

    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    double getValorTotal() {//metodo para calcular o valor total da compra
        double total = 0;
        for (Item item : itens) { //laço forEach para calcular o valor total dos produtos
            total += item.quantidade * item.preco; //taotal recebe item.quantidade x item.preco
        }
        return total; //retornar o valor total
    }

}
