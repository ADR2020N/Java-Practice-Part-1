/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class CommonElement {

    public void comElent() {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 10};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                
                if (array1[i] == array2[j]) {
                    System.out.println("Common element is : " + (array1[i]));
                    
                }
            }
        }

    }

    public static void main(String[] args) {
        CommonElement cm = new CommonElement();
        cm.comElent();
    }

}
