
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class countNumberOfOnes {
    public static void main(String[] args) {
       int a=15;
       int r= countOnes(a);
        System.out.println(r);
       
        
    }
   static int countOnes(int n){
    //int no = 12345;
    int count=0;
    while(n>0){
        count+=n%2; //count=count+n
        n/=2; // n=n/2;
    }
    return count;
    }
}
