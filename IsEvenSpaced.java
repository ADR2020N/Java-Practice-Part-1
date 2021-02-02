/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author N.Adrien
 */
public class IsEvenSpaced {

    public static void main(String[] args) {
        int a[] = {2,6,7};
        int res = isEvenSpaced(a);
        System.out.println(res);
    }

    static int isEvenSpaced(int a[]) {
        int largest =a[0], smollest =a[0];
        if (a.length < 2) 
            return 0;
        
        for (int i = 0; i < a.length; i++) {
            if (largest < a[i]) {
                    largest = a[i];

                }
                if (smollest>a[i]) {
                    smollest = a[i];
                }
            }
        
        if ((largest - smollest) % 2 == 0) {
            return 1;
        }
        return 0;
    }
}
