/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class IsBanced14 {

    public static void main(String[] args) {
        int a[] = {16, 6, 2, 3};
        int rs = isBalanced(a);
        System.out.println(rs);
    }

    static int isBalanced(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 != 0) 
                return 0;
            
            if (i % 2 != 0 && a[i] % 2 == 0) 
                return 0;
            
        }

        return 1;
    }
}
