/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class isAllPossibilities {

    public static void main(String[] args) {
        int a[] = {8,3,4,6,7,5,0};
        int res = isAllPoss(a);
        System.out.println(res);
    }

    static int isAllPoss(int[] a) {
        boolean isAllposibilty;
        for (int i = 0; i < a.length; i++) {
         
            isAllposibilty = false;
            for (int j = 0; j < a.length; j++) { 
                if (a[j] == i) {
                    isAllposibilty = true;
                    break;
                }
            }
            if (!isAllposibilty) {
                return 0;
            }
        }
        return 1;        
    }
}

/*int isAllposibilty=0;
        for (int i = 0; i < a.length ; i++) {
              for(int j=i;j<a.length;j++){
                   if(a[j]>=0)
                       isAllposibilty=1;
              }     
        }
        if (isAllposibilty == 1){
            return 1;
        } else {
            return 0;
        }
    }*/
