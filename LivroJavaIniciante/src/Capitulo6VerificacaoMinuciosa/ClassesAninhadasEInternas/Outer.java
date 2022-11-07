/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.ClassesAninhadasEInternas;

/**
 *
 * @author eric
 */
public class Outer {

    int nums[];

    Outer(int[] n) {
        this.nums = n;
    }

    void analyze() {
        Inner inOb = new Inner(); //criacao de um objeto da classe Inner

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximun: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
        
    }

    public class Inner {//começo da classe Inner

        int min() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < m) {
                    m = nums[i];
                }
            }
            return m;
        }

        int max() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > m) {
                    m = nums[i];
                }
            }
            return m;
        }

       private int avg() {
            int a = 0;

            for (int i = 0; i < nums.length; i++) {
                a += nums[i];
            }
            return a / nums.length;
            
        }
    }//Fim da classe Inner
}
