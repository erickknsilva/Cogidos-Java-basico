

package Arrays;

/**
 *
 * @author eric
 */
public class Bolha {

    public static void main(String[] args) {

        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, t, size;
        size = 9; // numeros de elementos a serem classificados

        System.out.println("Original array is: ");
        for (int i = 0; i <= size; i++) {
            System.out.print(nums[i] + " "); //imprimir todos valores dentro de array
        }
        System.out.println();
        //classificação por bolha.
        
        for (a = 0; a < 9; a++) { //contador de 0 ate 9
            for (b = 9 - 1; b > a; b--) { // decrementa de 10 a 1, depois de 10 a 2, depois 10 a 3 etc... 
                if (nums[b - 1] > nums[b]) {// se fora de ordem
                    //trocar os elementos
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        System.out.print("\nSorted array is:\n");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}
