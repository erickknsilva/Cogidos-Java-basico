package estruturascontroles;

public class WhileSoma {
	public static void main(String[] args) {
		
		int i, j;
		i = 1; 
		j = 0;
		
		while(i <= 10) {
			j = j + i;
			i = i + 1;
                        System.out.println(j);
		}
		System.out.println("Soma = " + j );
		
	}
}
