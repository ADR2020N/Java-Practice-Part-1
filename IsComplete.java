public class IsComplete {

    public static void main(String[] args) {
        int i[] = {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7};//2, 3, 2, 4, 5, 11, 8, 7};
        int res = isComplete(i);
        System.out.println(res);
    }

    static int isComplete(int[] a) {
        int min = a[0];
        int max = a[0];
        int isCo = 0;
       
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (max < a[i]) {
                        max = a[i];
                    
                } else if (min > a[i]) {
                        min = a[i];
                    
                } else if(min == max){
                    isCo = 0;
                }
            } else {
                return 0;
            }
        
        }
        return 1;
    }
}