/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class FilterArray2 {

    public static void main(String[] args) {
        int a[] = {2, 8, 7};
        int res = isFilter(a);
        System.out.println(res);
    }

    static int isFilter(int[] a) {
        boolean is9 = false, is11 = false, is7 = false, is13 = false;
        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 9:
                    is9 = true;
                    break;
                case 11:
                    is11 = true;
                    break;
                case 7:
                    is7 = true;
                    break;
                case 13:
                    is13 = true;
                    break;
                default:
                    break;
                    
            }

        }

        if (is9 && is11) {
            return 1;
        }

        if (is7 && !is13) {
            return 1;
        }

        return 0;
    }
}
