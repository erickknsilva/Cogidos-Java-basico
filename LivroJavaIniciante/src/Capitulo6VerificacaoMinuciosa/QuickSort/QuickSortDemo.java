/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.QuickSort;

/**
 *
 * @author eric
 */
public class QuickSortDemo {

    public static void main(String[] args) {
        int[] nums = new int[10];;
        
        System.out.println("Numeros gerados: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.round(Math.random() * 50 - 20); 
        }
        for (int impressao : nums) {
            System.out.print(impressao + " ");
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("Numeros ordenados:");
        QuickSort.qsorts(nums);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.print(num + " ");            
        }
    }

}
