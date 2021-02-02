/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class isNice {
    public static void main(String[] args) {
         int i[] = {3, 4, 5, 7};
        int res = isNise(i);
        System.out.println(res);
    }
    
    static int isNise(int a[]){
        boolean isNice=false;
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
              if((a[i]+1 == a[j]) || (a[i]-1 == a[j])) 
                isNice=true;
             
           }
            if(!isNice)
           return 0;
       }
    return  1;
       }
   } 
