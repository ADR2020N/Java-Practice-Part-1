

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author N.Adrien
 */
public class HasKSmallFactor {

    public static void main(String[] args) {
        int n = 20;
        int k =6;
        System.out.println(hasKSmallFactor(k, n));
    }

    static boolean hasKSmallFactor(int k, int n) {
        for (int i = 1; i < k; i++) {
            if (n % i == 0) 
            
            
            
                for (int j = 1; j <k; j++) {
                    if (n % j == 0)
                 
                       if (j * i == n){ 
                      System.out.println(j+" "+i);
                        return true; 
                       }
                    
                       // System.out.println(j);
                }
            
            
        }
        return false;
    }

}
