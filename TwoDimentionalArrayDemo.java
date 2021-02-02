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
public class TwoDimentionalArrayDemo {
    public static void main(String[] args) {
        int a[][]={
            {2,3,5},
            {3,5,6,20,60},
            {6,9,1}
            };
        int sum=0;
        int min=a[0][0];
        int max=a[0][0];
        for(int i=0;i<a.length;i++){
          for(int j=0;j<a[i].length;j++){
              if(a[i][j]<min){
               min=a[i][j];
              }
              if(a[i][j]>max){
                max=a[i][j];
              }
              sum+=a[i][j];
              System.out.print(" "+a[i][j]);
              
          }
         System.out.println();
                 
        }
        System.out.println("Minimum  "+min);
        System.out.println("Maximum  "+max);
        System.out.println("Sum is  "+sum);
        
    }
    
}
