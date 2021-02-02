
public class IsPrimeProduct {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 22;

        int c = isPrimeProduct(a);
        System.out.println("Result:" + c);

    }

    static int isPrimeProduct(int n) {

        for (int i = 0; i < n; i++) {

            if (isPrime(i)) {
                for (int j = 0; j < n; j++) {
                    if (isPrime(j)) {
                        if (n == i * j) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    static boolean isPrime(int number) {

        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
