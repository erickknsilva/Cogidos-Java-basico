package fundamentos.matematica;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author eric
 */

public class SalarioHora {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.print(d);
		System.out.println("\n");

		Double QtdHorasTrabalhadas;
		Double SalarioBruto;
		Double ValorHora;
		Double Salariohora;

		System.out.println("Informe quantidade de horas trabalhadas do funcionario no mes ");
		QtdHorasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe Horas Trabalhadas nomes"));

		System.out.println("Informe o total de horas na semana ");
		ValorHora = Double.parseDouble(JOptionPane.showInputDialog("Total Horas na semana"));

		SalarioBruto = (QtdHorasTrabalhadas * ValorHora);
		
		Salariohora = (SalarioBruto / 180);

		System.out.println("O salário bruto do funcionário é: " + SalarioBruto);
		System.out.println("O salário hora é: " + Salariohora);
	}
}
