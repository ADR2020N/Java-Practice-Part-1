/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class AverageInArray {
    
    public double avg(int[]b,int len){
        
   //b={23,4,4,5,7,77};
        int sum=0;
        for(int i=0;i<b.length;i++){
              sum=sum+b[i];

        }
        double average=sum/b.length;
        //System.out.println(average);
        return average;
    }
   
}
