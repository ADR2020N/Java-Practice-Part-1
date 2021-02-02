/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class DuplicateString {
    public static void main(String[] args) {
        String[] my_array={"abc","bcd","jude","bcd","aui","abc","gzw","grace"};
        for(int i=0;i<my_array.length-1;i++){
         for(int j=i+1;j<my_array.length;j++){
             if(my_array[i].equals(my_array[j])&&(i!=j)){
                  System.out.println("duplicate value is: "+my_array[i]);
             
             }
         }
        }
    }
    
}
