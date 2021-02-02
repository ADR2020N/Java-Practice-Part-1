/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class IsMagicArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = {21, 3, 7, 9, 11, 4, 6};

        int c = isMagicArray(a);
        System.out.println("Result:" + c);

    }

    static int isMagicArray(int[] a) {
        int sum = 0;
        boolean noPrime = true;

        for (int i = 0; i < a.length; i++) {

            if (isPrime(a[i])) {

                sum = sum + a[i];
                noPrime = false;
            }
        }

        if (a[0] == sum || (noPrime && a[0] == 0)) {
            return 1;
        } else {
            return 0;
        }

    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
}
