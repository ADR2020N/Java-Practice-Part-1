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
public class IsSub {
    public static void main(String[] args) {
          int a[] = {13,2,6,7,9};
        int res = isSub(a);
        System.out.println(res);  
    }
    static int isSub(int [] a){
        int sum=0;
        boolean isSub;
       for(int i=0;i<a.length;i++){
           isSub=false;
           for(int j=i+1;j<a.length;j++){
              sum+=a[j];
              if(sum<a[i]){ 
              isSub=true;
              //break;
              }
           }
           if(!isSub)
               return 0;  
       }
        return 1;
    }
  
}
