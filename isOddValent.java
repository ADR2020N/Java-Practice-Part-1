/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class isOddValent {

    public static void main(String[] args) {
        int b[] = {2,2, 2, 4, 4};
        int res = isOddValent(b);
        System.out.println(res);
    }

    static int isOddValent(int[] a) {
        boolean isOddValent = false;
        boolean isOdd = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                isOdd = true;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    isOddValent = true;
                    break;
                }
            }
            if (isOddValent && isOdd ) {
                return 1;
            }
        }
        return 0;
    }

}
