
public class SumOfDigit {
 
  public static void main(String[] args) {
		int n=1246;
		int m=14;
		 int rs=isDigitSum(n,m);
		 System.out.print(rs);

	}
    
	static int isDigitSum(int n,int m) {
		int sum=0,t;
		if((n<0)||(m<0))
			return -1;
		
		while(n>0) {
			t=n%10;
			sum+=t;
			n/=10;
		}
		if(sum<m) {
			return 1;
		}else {
			return 0;
		}
		}
}
