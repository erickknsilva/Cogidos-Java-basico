package fundamentos.operadores;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {

		double a = 150000; // implicita = nao perde informa�ao = transformar do menor para o maior.
		System.out.println(a);

		float b = (float) 1.1234577756454546; // explicita (cast) = perde informa�ao= transofrma do maior para o menor.
		System.out.println(b);

		int c = 340;
		byte d = (byte) c; // explicita (cast) = perde informa�ao
		System.out.println(d);

		double e =  1.242;
		int x = (int) e; // explicita (cast) = perde informa�ao
		System.out.println(x);

	}
}
