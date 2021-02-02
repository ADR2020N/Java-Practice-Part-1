/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class IsComplet {

    public static void main(String[] args) {
        int i[] = {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7};
        int res = isComplete(i);
        System.out.println(res);
    }

    public static int isComplete(int[] a) {
        int isInertial = 1;
        int[] oddValues = new int[a.length];
        int oddindex = -1;
        int[] evenValues = new int[a.length];
        int evenindex = -1;
        int minValue = 0;

        for (int i = 0; i < a.length; i++) {
// get the max  value 
            if (a[i] < minValue) {
                minValue = a[i];
            }
// check for odd and  even; 
            if (a[i] % 2 == 0) {
                evenindex++;
                evenValues[evenindex] = a[i];
            } else {
                oddindex++;
                oddValues[oddindex]
                        = a[i];
            }
        }
        System.out.println(minValue);
//a- check if contains at least one odd value  
        if (oddindex < 0) {
            return 0;
        }
        
//b- check if the maximum value in the array is even  
        if (minValue % 2 != 0) {
            return 0;
        }
        int oddvalue = 0, evenvalue = 0;
//c- check if every odd value is greater than every even value that is not the maximum value.
        for (int i = 0; i <= oddindex && isInertial == 1; i++) {
            oddvalue = oddValues[i];
            for (int j = 0; j <= evenindex && isInertial == 1; j++) {
                evenvalue = evenValues[j];
                if (evenvalue != minValue) {
                    if (evenvalue > oddvalue) {
                        isInertial = 0;
                    }
//exit theloop  
                }
            }
        }

        return isInertial;
    }

}
