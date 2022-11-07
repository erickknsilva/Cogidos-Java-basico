package fundamentos.operadores;

public class unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a ++; // a = a + 1
		a --; // a = a - 1
		
		b ++; // b = a + 1
		b --; // b = a - 1
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("mini desafio ");
		System.out.println(++a == b--); // pre-fixado soma primeiro depois compara 
		//e pos fixada nao tem pressa, primeiro compara depois soma 
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);

	}

}
