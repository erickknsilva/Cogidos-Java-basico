package estruturascontroles;

public class WhileTabuada {
	public static void main(String[] args) {
		
		int i = 1;
		int r = 2;
		
		while(i <= 10) {
			int t = r * i;
			System.out.println(r + " x " + i + " = " + t);
			i = i + 1;
		}
	}
}
