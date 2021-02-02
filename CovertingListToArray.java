/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author N.Adrien
 */
public class CovertingListToArray {
    public static void main(String[] args) {
         List<String>names=new ArrayList<>();
          names.add("Adrien");
          names.add("Peter");
          names.add("Aloys");
          names.add("Andre");
         
 String[] array = names.toArray(new String[names.size()]);    
 System.out.println("Printing Array: "+Arrays.toString(array));  
 System.out.println("Printing List: "+names);  
    }
    
}
