
public class minSteps1 {

	public static int minStepsTo1(int n,int dp[]) {
		if(n==1) return 0;
		if(dp[n]!=-1) {
			return dp[n];
		}
		int ans1=minStepsTo1(n-1,dp);
		int ans2 = Integer.MAX_VALUE;
		int ans3 = Integer.MAX_VALUE;
		if(n%2==0) {
			ans2 = minStepsTo1(n/2,dp);
		}
		if(n%3==0) {
			ans3 = minStepsTo1(n/3,dp);
		}
		return dp[n] = 1+Math.min(ans1, Math.min(ans2, ans3));
	}
	
	public static int minStepsTo1(int n) {
		if(n==1) return 0;
		
		int dp[] = new int[n+1];
		
		dp[1]=0;
		
		for(int i=2;i<n+1;i++) {
			int ans1 = dp[i-1];
			int ans2 = Integer.MAX_VALUE;
			int ans3 = Integer.MAX_VALUE;
			if(i%2==0) {
				ans2 = dp[i/2];
			}
			if(i%3==0) {
				ans3 = dp[i/3];
			}
			dp[i] = 1 + Math.min(ans1, Math.min(ans2, ans3));
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int dp[] = new int[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i] = -1;
		}
		int ans = minStepsTo1(n,dp);
		System.out.print(minStepsTo1(n));
	}

}
