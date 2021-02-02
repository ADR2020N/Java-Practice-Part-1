

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class IsHollow {
    public static void main(String[] args) {
         int a[] = {1,2,4,0,0,0,3,4};
        int res = isHollow(a);
        System.out.println(res);
    }
    static int  isHollow(int [] a){
      int count=0;
      if(a.length%2==0)
          return 0;
        for(int i=0;i<a.length;i++){
         if( i!=a.length/2 && a[a.length/2]!=0){
            return 0;
         }else
             count ++;
        }
        if(count>=3){
         return 1;
        }else
            return 0;
    }
}
