
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        DecimalFormat df = new DecimalFormat("#.0");
        float[][] nums = new float[5][5];
        Random rd = new Random();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = 1 + rd.nextFloat() * (0 + 50);
                System.out.print(df.format(nums[i][j]).replace(",", ".") + "\t");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("nums [%d][%d] \n", i, i);
        }

        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("nums [%d] [%d] = %.1f \t", i, j, nums[i][j]);
            }
            System.out.println();
        }

    }
}
