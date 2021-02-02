/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.*;

/**
 *
 * @author N.Adrien
 */
public class ConertingArrayToAlist {
    public static void main(String[] args) {
        String[]names={"Yvonne","Muhire","Olga","Kenny","Ineza"};
         List<String> nameList=new ArrayList<>();
           for(String i:names){
               nameList.add(i);
          
           }
              System.out.print(" "+nameList);
    }
}
