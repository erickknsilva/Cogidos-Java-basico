/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.Composicao1.UmPraMuitos;

/**
 *
 * @author eric
 */
public class Item {

    String nome; //receber o nome do item
    int quantidade; //receber a quantidade do item
    double preco; //o preco do item
    Compra compra;

    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

    }
    

}
