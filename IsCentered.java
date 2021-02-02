/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class IsCentered {
    public static void main(String[] args) {
        int b[] = {3, 2, 1, 4, 1};
        int rs = isCentered(b);
        System.out.println(rs);
    }
    static int isCentered(int[] a) {
        if(a.length / 2==0)
            return 0;
        for (int i = 0; i < a.length; i++) {
            if((i!=a.length/2) && (a[i]<=a[a.length/2]))
             return 0;
            
        }
            return 1;
        }
}
