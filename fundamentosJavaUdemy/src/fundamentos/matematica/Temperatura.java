package fundamentos.matematica;

public class Temperatura {

	public static void main(String[] args) {
		 final double x = 5 / 9.0;
		 final double y = 32;
		 
		 double fareinheit = 86;
	
		double celsius = (fareinheit - y) * x;
		 
		 System.out.println(celsius);
		 
		 fareinheit = 90;
		 celsius = (fareinheit - y) * x;
		 
		 System.out.printf("Calor em São Paulo = %.2f ºC", celsius);
				
	}
}
 