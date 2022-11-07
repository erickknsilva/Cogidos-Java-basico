/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo12enumautoboxing.enumeracoes;

/**
 *
 * @author eric
 */
public class EnumDemo2Metodos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Transport tp;

		System.out.println("Aqui estão todas as constantes/lista de transporte...");

		/*
		 * Transport.values() retorna um array contendo uma lista com as constantes de
		 * enumeração e armazena em na variavel Transport allTransport[]
		 */
		// usa values()
		Transport allTransport[] = Transport.values();// obtem o array da constante Transport

		for (Transport t : Transport.values()) { // elimina a necessidade de criacao de allTransport[]
			System.out.println(t);
		}

//        for (Transport t : allTransport) {
//            System.out.println(t);
//        }
		System.out.println();
		// usa valueOF()
		/*
		 * valueOf() retorna o valor de enumeraçao associado ao nome da constante
		 * representado com string
		 */
		tp = Transport.valueOf("AIRPLANE");// obtem a constante de nome AIRPLANE
		System.out.println("tp contem " + tp);

		tp = Transport.AIRPLANE;
		System.out.println(tp.ordinal());

	}
}
