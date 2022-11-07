package fundamentos.strings;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		String s = new String ("erick nunes da silva");
		s.toUpperCase();		
	
		// tudo no java é Objeto menos os 8 tipos primitivos 
		// que é o byte, short, int, double etc...
		
		//wrappers sao a versao do objeto dos tipos
		//primitivos
		Integer a = 123;
		System.out.println(a);
		
		
	}

}
