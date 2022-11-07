/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author eric
 */
public class MinMax2 {
    public static void main(String[] args) {
        int min, max;
        
        /*os valores sao atribuidos sequencialmente da direita para esquerda
        de acordo com a orde do indice java.*/
        int nums[] = {1, -23, 3, 4, 5, 6, 7, 8, 9, 10}; 
        System.out.println(nums[1]);
        
        min = max = nums[0];
        for(int i = 0; i < 10; i++){ // incrementa i de um em 1 até chegar a 9
            if(nums[i] > max) max = nums[i]; //atribuir o valor maior em max
            if(nums[i] < min) min = nums[i]; //atribuir o valor menor em min
        }
        System.out.println("Minimo = " + min + " e maximo = " + max);
    }
}
