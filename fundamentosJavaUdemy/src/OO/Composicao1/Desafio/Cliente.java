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
public class Cliente {

    final String nome;

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    final ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
        return nome;
    }
    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    double getValorTotal() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.getValorTotal();
        }
        return total;
    }

}
