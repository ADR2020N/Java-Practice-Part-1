/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package Examen;

//import java.util.ArrayList;
import java.util.*;




/**
 *
 * @author N.Adrien
 */
public class ArrayListExample {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>();
          names.add("Adrien");
          names.add("Peter");
          names.add("Aloys");
          names.add("Andre");
          
//          for(String i:names){
//              System.out.print(" "+i);
//          }
   Iterator<String>list=names.iterator();
      while(list.hasNext())
            System.out.print(" "+list.next());
    }
}
