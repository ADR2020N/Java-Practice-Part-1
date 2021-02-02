
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author N.Adrien
 */
public class IsWave {

    public static void main(String[] args) {
        int a[] = {2, 6, 3, 4};
        int res = IsWave(a);
        System.out.println(res);
    }

    static int IsWave(int[] a) {
        int countOdd = 0,countEven=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0){
                countEven++;
            }
              if (a[i] % 2 != 0) {
                countOdd++;
            }
            
        }
        if (countOdd >2 || countEven>2) {
            return 0;
        } else {
            return 1;
        }
    }

}
