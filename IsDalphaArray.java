    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class IsDalphaArray {
    public static void main(String[] args) {
        int a[]={-69,8};
        int res=isDalphaArray(a);
        System.out.println(res);
    }
    

    static int isDalphaArray(int a[]) {
        boolean isEven = false, isOdd = false;
        for (int i = 0; i <a.length; i++) {
            if (a[i] % 2 == 0) {
                isEven = true;
              } else {
                isOdd = true;
            }
        }
        if (isEven && isOdd) 
            return 0;
         else 
            return 1;
        
    }
}
