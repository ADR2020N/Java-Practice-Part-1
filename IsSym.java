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
public class IsSym {
    public static void main(String[] args) {
         int a[] = {2,6,7,9};
        int res = isSym(a);
        System.out.println(res);
    }
    static int isSym(int [] a){
        if(a.length<1)
            return 0;
        for(int i=0;i<a.length;i++){
            if(a[0]%2!=0 && a[a.length-1]%2==0)
                return 0;
            if(a[0]%2==0 && a[a.length-1]%2!=0)
                return 0;
        }
        
    return 1;
    }
}
