package fundamentos.strings;

import java.awt.DisplayMode;

public class TipoString {

    public static void main(String[] args) {

        String s = "Boa tarde";
        System.out.println(s.concat("!!!")); //Addiciona palavra a uma string
        System.out.println(s + "!!!"); //startsWith verifica se a String come�a com o valor especificado.
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa")); // startsWith() determina se uma string come�a com os caracteres especificados, retornando true ou false .
        System.out.println(s.toUpperCase().endsWith("tarde")); // O m�todo endsWith verifica se a String termina com o valor especificado, por outro lado o startsWith verifica se a String come�a com o valor especificado.
        System.out.println(s.length()); // quantidade de caracteres que pertencer a string
        System.out.println(s.toLowerCase().equals("boa tarde")); // deixa as letras miniscula
        System.out.println(s.equalsIgnoreCase("boa tarde")); //Verifica se duas strings s�o iguais.

        String nome = "Erick";
        String sobrenome = "silva";
        int idade = 22;
        double salario = 12345.897;

        System.out.printf("O senhor %s %s tem %d anos e ganha %.2f ", nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha %.2f", nome, sobrenome, idade, salario);
        System.out.println(frase);

    }
}
