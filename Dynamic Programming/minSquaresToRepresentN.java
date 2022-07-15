
public class minSquaresToRepresentN {

	public static int minSquares(int n,int dp[]) {
		if(n==0) return 0;
		if(dp[n]!=-1) {
			return dp[n];
		}
		int ans = Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int currans= minSquares(n-(i*i),dp);
			ans = Math.min(ans,currans);
		}
		return dp[n] = 1+ans;
	}
	
	public static int minSq(int n) {
		int []dp = new int[n+1];
		dp[0] = 0;
		for(int i=1;i<n+1;i++) {
			
			int minAns= Integer.MAX_VALUE;
			for(int j=1;j*j<=i;j++) {
				int currAns = dp[i-(j*j)];
				if(minAns > currAns) {
					minAns = currAns;
				}
			}
			dp[i] = 1+ minAns;
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 105;
		int dp[] = new int[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i] = -1;
		}
		System.out.print(minSquares(n,dp));
		System.out.print(minSq(n));
	}

}
