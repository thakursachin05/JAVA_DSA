
public class byteDance {

	public static int ByteDance(int n,int dp[]) {
		if(n<=1) return n;
		if(dp[n]!=-1) return dp[n];
		int ans = ByteDance(n/2,dp) + ByteDance(n/3,dp) + ByteDance(n/4,dp);
		return dp[n] = Math.max(ans, n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int dp[] = new int[n+1];
		for(int i=0;i<n+1;i++) {
			dp[i] = -1;
		}
		System.out.print(ByteDance(12,dp));

	}

}
