
public class isNormalFactor {

    public static void main(String[] args) {
        int s = 33;
        int rs = isNormal(s);
        System.out.println(rs);
    }

    static int isNormal(int n) {
        for (int i = 2; i < n; i++) {
            System.out.println(n);
            if (n % i == 0) {
                if (i % 2 == 1) {
                    return 0;
                }
            }
        }
        return 1;
    }
    /*static int isNormal(int n) {
        int isNormal = 0;
        int m = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                return 1;
            }
            if (n % i == 0) {
                m = i;
            }
            if (m % 2 == 0) {
                isNormal = 1;
            } else if ((m == 6 || m == 9 || m == 10)) {
                isNormal = 0;
            }
        }
        if (isNormal == 1){
            return 1;
        } else {
            return 0;
        }

    }*/
}
