package alpha.DP;
public class Fib_DP__2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int [] f= new int[n+1];
		System.out.println(fib(n , f) );
	}
	
	public static int fib(int n ,int f[]) {
		if(n==0 || n== 1) return n;
		
		return fib(n-1 ,f)+fib(n-2, f);
		
	}
}
