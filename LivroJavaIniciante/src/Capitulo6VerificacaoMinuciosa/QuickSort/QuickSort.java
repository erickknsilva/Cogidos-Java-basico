/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo6VerificacaoMinuciosa.QuickSort;

/**
 *
 * @author eric
 */
public class QuickSort {

    //defina uma chamada ao método real de classificaçao rapida
    static void qsorts(int items[]) {
        qs(items, 0, items.length-1);
    }

    //Uma versao Recursiva da classificação rápida para caracteres.
    private static void qs(int items[], int left, int right) {
        int i, j;
        int x, y;

        i = left;
        j = right;

        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) {
                i++;
            }
            while ((x < items[j]) && (j > left)) {
                j--;
            }
            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) {
            qs(items, left, j);
        }
        if (i < right) {
            qs(items, i, right);
        }
    }

}
