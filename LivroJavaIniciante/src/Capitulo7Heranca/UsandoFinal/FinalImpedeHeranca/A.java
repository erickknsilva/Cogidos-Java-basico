/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.UsandoFinal.FinalImpedeHeranca;

/**
 *
 * @author eric
 */
public final class A {

	/*
	 * Voce pode impedir que a classe seja herdada precedendo sua declaração com
	 * final A declaraçao de uma classe como final tambem declara implicidamente
	 * todos os seus metodos com final e nao pode ser usado abstract e final juntos,
	 * ja que absctract é uma classe incompleta e depende da suas subclasse para
	 * fornecer implementações.
	 */
	void ola() {
		System.out.println("Seja Bem-Vindo.");
	}
}
