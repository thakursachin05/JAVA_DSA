package dp2;

public class knapSack {
	
	public static int knapsack(int []wt,int []val,int W,int i) {
		if(i==val.length) {
			return 0;
		}
		int ans;
		if(wt[i] <= W) {
			//including
			int ans1 = val[i] + knapsack(wt,val,W-wt[i],i+1);
			//exculding
			int ans2 = knapsack(wt,val,W-wt[i],i+1);
			ans = Math.max(ans1, ans2);
		}else {
			ans = knapsack(wt,val,W,i+1);
		}
		return ans;
	}
	public static int knapsackI(int []wt, int []val,int W) {
		
		int n = val.length;
		int [][]dp = new int[n+1][W+1];
		
		for(int i=n-1;i>=0;i--) {
			for(int w=0;w<=W;w++) {
				int ans;
				if(wt[i] <= w) {
					int ans1 = dp[i+1][w-wt[i]] + val[i]; 
					int ans2 = dp[i+1][w];
					ans = Math.max(ans1, ans2);
				}
				else {
					ans = dp[i+1][w];
				}
				dp[i][w] = ans;
			}
		}
		return dp[0][W];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = {200,300,100};
		int wt[] = {20,25,30};
		
		int W = 50;
		
		int ans = knapsackI(wt,val,W);
		System.out.print(ans);
	}

}
