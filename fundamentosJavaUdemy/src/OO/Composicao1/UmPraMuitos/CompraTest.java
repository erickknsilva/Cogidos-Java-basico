/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.Composicao1.UmPraMuitos;

/**
 *
 * @author eric
 */
public class CompraTest {

    public static void main(String[] args) {
        
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();
        
        compra2.adicionarItem("Tenis", 3, 450);
        
        compra1.adicionarItem("Caneta", 20, 7.45);
        compra1.itens.add(new Item("Borracha", 12, 3.89));
        compra1.itens.add(new Item("Caderno", 3, 18.79));
        
        System.out.println(compra1.getValorTotal());
        System.out.println(compra1.itens.size());
    }
}
