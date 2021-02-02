    
public class FineArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] a = {8,9,15};

        int c = isFineArray(a);

        System.out.println("Result:" + c);
    }

       static int isFineArray(int[] a) {
        boolean hTwin;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                hTwin = false;
                for (int j =0; j < a.length; j++) {
                    if(isPrime(a[j] ))
                    if ((a[i] - 2 == a[j]) || (a[i] + 2 == a[j])) {
                        hTwin = true;
                    }
                }
                if (!hTwin) 
                      return 0;  
            }
        }
        return 1;
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
