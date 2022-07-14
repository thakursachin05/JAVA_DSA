import java.util.Scanner;

public class fibonacci {

	
	public static int fib2(int n) {
		if(n==0 || n==1) return n;
		
		int []dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		// n==2
		
		for(int i=2;i<n+1;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
	public static int fibb(int n, int dp[]) {
		if(n==0 || n==1) return n;
		if(dp[n]!=-1) {
			return dp[n];
		}
		return dp[n] = fibb(n-1,dp)+fibb(n-2,dp);
	}
	
	public static int fib1(int n,int dp[]) {
		if(n==1 || n==0) {
			return n;
		}
		int ans1,ans2;
		if(dp[n-1]!=-1) {
			ans1 = dp[n-1];
		}else {
			ans1 = fib1(n-1,dp);
			dp[n-1]= ans1;
		}
		if(dp[n-2]!=-1) {
			ans2 = dp[n-2];
		}else {
			ans2 = fib1(n-2,dp);
			dp[n-2]= ans2;
		}
		
		int myAns = ans1+ans2;
		return myAns;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();;
		int[]  dp = new int[n+1];
		for(int i=0;i<n+1;i++) {
			dp[i]= -1;
		}
		int ans = fib2(n);
		System.out.println(ans);
	}

}
