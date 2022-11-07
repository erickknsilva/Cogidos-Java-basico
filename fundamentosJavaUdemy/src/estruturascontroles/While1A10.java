package estruturascontroles;

import java.util.Scanner;

public class While1A10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i = 1;

		while (i <= 10) {
				System.out.println("i = " + i);
				i++;
			}
			entrada.close();
		}
	}

