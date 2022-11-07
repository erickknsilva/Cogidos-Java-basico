package fundamentos.operadores;

public class DesafioAritimetico {
	public static void main(String[] args) {
		
		double numA = Math.pow(6 * (3 +2), 2);
		double denA = 3 * 2;
		System.out.println(numA);
		System.out.println(denA);
		
		double numB = (1 - 5) * ( 2 -7);
		double denB = 2;
		System.out.println(numB);
		System.out.println(denB);
		
		double superiorA = numA / denA;
		System.out.println(superiorA);
		double superiorB = Math.pow(numB / denB, 2);
		System.out.println(superiorB);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		System.out.println(superior);
		double inferior = Math.pow(10, 3); 
		System.out.println(inferior);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é: " + resultado);
		
		//eu
		System.out.println("\n ");
		int a = (3 + 2);
		int b = (int) Math.pow(a, 2);
		int c = (6 * b);
		System.out.println(c);
		
		int d = 3 * 2;
		System.out.println(d);
		
		int e = (1 - 5);
		int  f = (2 - 7);
		int g = (int) Math.pow(f, 2);
		int h = e * g;
		System.out.println(h);
		
	    int i = 2;
	    int j = (int) Math.pow(i, 2);
	    System.out.println(j + "\n");
	    
	    System.out.println(c + h );
	    System.out.println(d + j + "\n");
	    
	    int l = c + h;
	    int n = (int)Math.pow(l, 3);
	    System.out.println(n);
	    int m = d + j;
	    int o = (int)Math.pow(m, 3);
	   System.out.println(o + "\n");
	    
	    System.out.println("O Resultado é: " + n / o);
	    
	}

}
