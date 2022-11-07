package estruturascontroles;

import java.util.Scanner;

public class IfElseDesafio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = entrada.next().toUpperCase();

        //int d = Integer.parseInt(dia);
        if (dia.equalsIgnoreCase("Domingo")) {
            System.out.println("1");
        } else if (dia.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        } else if (dia.equalsIgnoreCase("terça")
                || "terca".equalsIgnoreCase(dia)) {
            System.out.println("3");
        } else if (dia.equalsIgnoreCase("Quarta")) {
            System.out.println("4");
        } else if (dia.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        } else if (dia.equalsIgnoreCase("Sexta")) {
            System.out.println("6");
        } else if (dia.equalsIgnoreCase("Sabado")) {
            System.out.println("7");
        }

        entrada.close();

    }
}
