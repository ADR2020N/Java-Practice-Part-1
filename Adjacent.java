/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class Adjacent {

    int largestAdjentSum(int[] a) {
        int[] sum = new int[a.length - 1];
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {
            sum[j] = a[i] + a[i + 1];
            j++;
        }
        int largest = sum[0];
        for (int k = 1; k < sum.length; k++) {
            if (largest < sum[k]) {
                largest = sum[k];
            }
        }
        return largest;

    }
}
