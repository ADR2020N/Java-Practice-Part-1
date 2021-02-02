/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class IsEvenTest {

    public static void main(String[] args) {
        int i = 24276;
        int res = isEvens(i);
        System.out.println(res);
    }

    static int isEvens(int n) {
        boolean isEven = false;
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                n /= 10;
                if (n==0) {
                isEven=true;
            }   
            }
           
            
        }
        if(isEven)
        {
         return  1;
        }else
        return 0;

    }
}
