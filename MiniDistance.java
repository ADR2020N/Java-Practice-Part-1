

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author N.Adrien
 */
public class MiniDistance {

    //MinDistance
    public static void main(String[] args) {
        System.out.println("Result: " + minDistance(1001));
    }

    public static int minDistance(int n) {
        int minDistance = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (n % i == 0 && n % j == 0) {
                    if (i > j) {
                        int distance = i - j;
                        if (distance < minDistance) {
                            minDistance = distance;
                        }
                    }
                }
            }
        }
        return minDistance;
    }
}
