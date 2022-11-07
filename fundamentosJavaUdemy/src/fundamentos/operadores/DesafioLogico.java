package fundamentos.operadores;

public class DesafioLogico {
	public static void main(String[] args) {
		/*
		 * trabalho 1 terça trabalho 2 quinta tv 32 apenas 1 dos 2 tv 50 os 2 trabalho
		 * da certo tomo sorvete comprando uma das tv irao tomar sorvvete junto nao tomo
		 * sorvete se nenhum der certo nao ira tomar sorvete
		 */

		boolean trabalho1 = false;
		boolean trabalho2 = false;

		boolean comprotv50 = trabalho1 && trabalho2;
		boolean comprotv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean semsorvete = !comprouSorvete; // operador unario = negaçao logica

		System.out.println("Comprou a Tv 50pg\"? " + comprotv50);
		System.out.println("Comprou a Tv 32pg\"? " + comprotv32);
		System.out.println("Comprou sorvete? " + comprouSorvete);

		System.out.println("nao tomou Sorvete ? " + semsorvete);

	}
}
