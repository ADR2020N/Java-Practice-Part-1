

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class CountDigit {
    public static void main(String[] args) {
          int a =3331;
          int b=3;
     
        int res =countDigit(a,b);
        System.out.println(res);
    }
    static int countDigit(int n,int digit){
      int count=0;
           int t=0;
      if(n<0 || digit<0)
          return -1;
      for(int i=1;i<=n;i++){
           t=n%10;
             n/=10;
        if(t==digit){
        count++;
       
     
       }
      
      }
     
        //System.out.println(count);
    return count;
}
}