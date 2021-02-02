/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class Fill {
    public static void main(String[] args) {
        int a[]={1,2,3,5, 9, 12,-2,-1};
        int k=3,p=0;
        int n=10;
        System.out.println();
    }
    public static int[ ] fill(int[ ] arr, int k, int n){
      int []arr2=new int [n];
        for(int i=0;i<arr.length;i++){
         
            for(int j=0;j<arr[k];j++){
               int result=arr[i]+arr[j];
            }
        }
      return arr2;
    }
}
