/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.Composicao1.Desafio;

/**
 *
 * @author eric
 */
public class Sistema {

    public static void main(String[] args) {

        Compra compra1 = new Compra();

        compra1.adicionarItem("Caneta", 1, 100);
        compra1.adicionarItem(new Produto("Notebook", 2000), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 1000), 1);
        
        Cliente cliente = new Cliente("Erick Nunes da Silva");
        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        Cliente nome = cliente;
        
        System.out.println("Valor total da compra de: " + nome + "\nfoi de: " + cliente.getValorTotal());
       
        
       
    }
}
