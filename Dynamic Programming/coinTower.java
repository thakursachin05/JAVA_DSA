
public class coinTower {
	public static void CoinTower(int n,int x,int y) {
		int dp[] = new int[n+1];
//		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2;i<n+1;i++) {
			int ans1=0,ans2=0;
			if(i-x >= 0) {
				ans1 = dp[i-x];
			}
			if(i-y>=0) {
				ans2 = dp[i-y];
			}
			dp[i] = Math.max(ans2, Math.max(ans1,ans2));
		}
		if(dp[n] == 0) System.out.print("Beerus");
		else System.out.print("whis");
	}
	
	public static String findWinner(int n, int x, int y) {
		if(x>y) {
			int temp = x;
			x=y;
			y=temp;
		}
		boolean[] dp = new boolean[n+1];
		for(int i=1;i<=n;i++) {
			if(i==1 || i==x || i==y) {
				dp[i] = true;
			}
			else if(x<y) {
				dp[i] = !dp[i-1];
			}
			else if(i<y) {
				dp[i] = !(dp[i-x] && dp[i-1]);
			}
			else {
				dp[i] = !(dp[i-x] && dp[i-y] && dp[i-1]);
			}
		}
		boolean result = dp[n];
		
		if(result) {
			return "Beerus";
		}
		else {
			return "whis";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CoinTower(4,2,3);
		System.out.print(findWinner(4,2,3));
	}

}
