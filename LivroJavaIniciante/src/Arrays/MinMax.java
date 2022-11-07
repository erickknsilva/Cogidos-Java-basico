/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author eric
 */
public class MinMax {

    public static void main(String[] args) {

        int min, max;
        int nums[] = new int[10];

        nums[0] = 10;
        nums[1] = 9;
        nums[2] = 8;
        nums[3] = 7;
        nums[4] = 6;
        nums[5] = 5;
        nums[6] = 4;
        nums[7] = 3;
        nums[8] = 2;
        nums[9] = 1;

        min = max = nums[0];

        for (int i = 1; i < 10; i++) {
            if(nums[i] < min) min  = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("Numero maximo = " + max + " Numero minimo = " + min);
    }

}
