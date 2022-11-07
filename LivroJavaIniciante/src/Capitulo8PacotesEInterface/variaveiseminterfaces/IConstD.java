/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.variaveiseminterfaces;

/**
 *
 * @author eric
 */
class IConstD implements IConst {

    public static void main(String[] args) {
        int nums[] = new int[max];
        
        for (int i = min; i < nums.length; i++)//
        {
            if (nums[i] >= max) {
                System.out.println(ERRORMSG);
            } else {
                nums[i] = i;
                System.out.print(nums[i] + " ");
            }
        }

    }
}
