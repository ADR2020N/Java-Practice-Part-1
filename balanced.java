public class balanced {
    public static void main(String[] args) {
        int s[]={5, 2, -2};
        int res=isBalanced(s);
        System.out.println(res);
    }
    
    static int isBalanced(int a[]){
       boolean isbal=false;
        for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
             if(a[j]*-1==a[i]){
             isbal=true;
            // break;
             }
           }
             if(!isbal)
               return 0;
        }
       return 1;  
    }
       
}
