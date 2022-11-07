
import java.math.MathContext;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author eric
 */
public class NewClass {

    public static void main(String[] args) {

        int[] v = new int[30];

        Random num = new Random();

        int a, b;
        a = 1;
        b = 101;

        for (int i = 0; i < v.length; i++) {
            v[i] = num.nextInt(b);
            System.out.println("Indice [" + i + "] = " + v[i]);
        }
    }
}
