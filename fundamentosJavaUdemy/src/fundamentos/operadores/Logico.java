package fundamentos.operadores;

public class Logico {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2 ); // tabela E
		System.out.println(condicao1 || condicao2 ); // Tabela ou 
		System.out.println(condicao1 ^ condicao2); // tabela ou exclusivo
		System.out.println(!condicao1); // tabel ou exclusivo
		System.out.println(!condicao2); // tabela negaçao
		
		System.out.println("\ntabela verdade E = && (and) ");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\ntabela verdade OU  = ||(or)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\ntabela verdade OU = ^ exclusivo(xor)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\ntabela verdade = ! NOT(negaçao)");
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
