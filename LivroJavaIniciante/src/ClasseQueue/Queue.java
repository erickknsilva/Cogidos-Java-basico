package ClasseQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eric
 */
public class Queue {

	private char[] q; // esse array vai conter a fila
	private int putloc, getloc; // Os índices de put e get

	Queue(int size) {

		q = new char[size]; // aloca memoria para a fila
		putloc = getloc = 0;// Iniciando a fia
	}

	void put(char ch) {
		if (putloc == q.length) {
			System.out.println(" - A fila está cheia. ");
			return;
		}
		q[putloc++] = ch;

	}

	char get() {
		if (getloc == putloc) {
			System.out.println("A fila está vazia.");
			return (char) 0;
		}
		return q[getloc++];
	}

}
