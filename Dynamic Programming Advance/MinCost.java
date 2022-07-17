package dp2;

public class MinCost {
	public static int minCostR(int [][]cost,int i,int j, int [][]dp) {
		int n = cost.length;
		int m = cost[0].length;
		//special case
		if(i==n-1 && j==m-1) {
			return cost[i][j];
		}
		
		//base case
		if(i>=n || j>=m) {
			return Integer.MAX_VALUE;
		}
		if(dp[i][j] != Integer.MIN_VALUE) {
			return dp[i][j];
		}
		int ans1 = minCostR(cost,i+1,j,dp);
		int ans2 = minCostR(cost,i,j+1,dp);
		int ans3 = minCostR(cost,i+1,j+1,dp);
		
		int myAns = cost[i][j] + Math.min(ans2, Math.min(ans1, ans3));
		return dp[i][j]=myAns;
	}
	public static int minCost(int[][] cost,int i,int j) {
		int n = cost.length;
		int m = cost[0].length;
		//special case
		if(i==n-1 && j==m-1) {
			return cost[i][j];
		}
		
		//base case
		if(i>=n || j>=m) {
			return Integer.MAX_VALUE;
		}
		int ans1 = minCost(cost,i+1,j);
		int ans2 = minCost(cost,i,j+1);
		int ans3 = minCost(cost,i+1,j+1);
		
		int myAns = cost[i][j] + Math.min(ans2, Math.min(ans1, ans3));
		return myAns;
	}
	
	public static int minCostI(int[][] cost) {
		int n = cost.length;
		int m = cost[0].length;
		
		int [][]dp = new int[n+1][m+1];
		
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<m+1;j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i = n-1;i>=0;i--) {
			for(int j=m-1;j>=0;j--) {
				if(i==n-1 && j==m-1) {
					dp[i][j] = cost[i][j];
					continue;
				}
				int ans1 = dp[i][j+1];
				int ans2 = dp[i+1][j];
				int ans3 = dp[i+1][j+1];
				
				dp[i][j] = cost[i][j] + Math.min(ans2, Math.min(ans1, ans3));				
			}
		}
		return dp[0][0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] cost =  {{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
		int dp[][] = new int[cost.length+1][cost[0].length+1];  
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = Integer.MIN_VALUE;
			}
		}
		// int ans = minCostR(cost,0,0,dp);
		int ans1 = minCostI(cost);
		System.out.print(ans1);
	}

}
