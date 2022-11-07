package estruturascontroles;

public class DesafioForString {
	public static void main(String[] args) {
	
		String e = "bala clava";
//		int t = 100;
//		float q = 5.65f;
//		
//		float resu = t + q;
//		System.out.print(resu);
		
//		System.out.printf("toca ninja = %s\n", e);
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
			
		}
		System.out.println();
		String a = "Erick".substring(2,4); 
		// o 3 significa vai pegar letras do indice 2 
		// ate o indice 4 e retorna as letras da string
		System.out.println(a);

	}

}
