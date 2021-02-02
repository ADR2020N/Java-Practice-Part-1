/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class IsaQuare {
    public static void main(String[] args) {
        IsaQuare is= new IsaQuare();
       int x= is.isSquare(22);
       if(x==1){
           System.out.println("Square");
       }else{
           System.out.println("Not");
       }
    }
    int isSquare(int n){
      int count=0;
     for(int i=0;i<n;i++){
       if(i*i==n){
       return 1;
       }
       if(i*i>n){
       return 0;
       }
      }
        return 0;
    }
    
}
