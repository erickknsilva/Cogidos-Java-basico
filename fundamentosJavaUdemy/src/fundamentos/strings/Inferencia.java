package fundamentos.strings;

import java.io.Reader;

public class Inferencia {

    public static void main(String[] args) {

        int y = 22;
        y = 10;
        System.out.println(y);

        double x = 1.730;
        x = 1.53;
        System.out.println(x);

        double b = 1.73;
        System.out.println(b);

        String nome = "erick";
        nome = nome.replace("erick", "Erick Silva").toUpperCase();
        System.out.println(nome);

        String name = "erick silva";
        System.out.println(name);
    }
}
