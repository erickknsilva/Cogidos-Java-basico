/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesMetodos;

/**
 *
 * @author eric
 */
public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.855); // inicializando o construtor comida e pssando os valores
        Comida c2 = new Comida("Fejao", 1.551); // inicializando o construtor comida e pssando os valores
        Comida c3 = new Comida("Alface", 0.451); // inicializando o construtor comida e pssando os valores

        Pessoa pessoa = new Pessoa("Erick", 68.75); // inicializando o construtor de pessoa e passando seus valores

        System.out.println(pessoa.informar()); //imprimir as caracteristica das pessoas
        pessoa.comer(c1);
        System.out.println(pessoa.informar()); //imprimir as caracteristica das pessoas

        Pessoa pessoa2 = new Pessoa("Toto", 75.75); // inicializando o construtor de pessoa e passando seus valores
        pessoa.comer(c2);
        System.out.println(pessoa2.informar()); //imprimir as caracteristica das pessoas

    }
}
