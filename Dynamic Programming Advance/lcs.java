package dp2;

public class lcs {

	public static int Lcs(String  str1,String str2,int i,int j) {
		if(i>=str1.length() || j>=str2.length()) {
			return 0;
		}
			
			int myAns;
			if(str1.charAt(i) == str2.charAt(j)) {
				int smallAns = Lcs(str1,str2,i+1,j+1);
				myAns = 1 + smallAns;
			}
			else {
				int ans1 = Lcs(str1,str2,i+1,j);
				int ans2 = Lcs(str1,str2,i,j+1);
				myAns = Math.max(ans1,ans2);
			}
			return myAns;
	}
	
	public static int LcsR(String  str1,String str2,int i,int j,int [][]dp) {
		if(i>=str1.length() || j>=str2.length()) {
			return 0;
		}
		if(dp[i][j]!= -1) {
			return dp[i][j];
		}
			
			int myAns;
			if(str1.charAt(i) == str2.charAt(j)) {
				int smallAns = Lcs(str1,str2,i+1,j+1);
				myAns = 1 + smallAns;
			}
			else {
				int ans1 = Lcs(str1,str2,i+1,j);
				int ans2 = Lcs(str1,str2,i,j+1);
				myAns = Math.max(ans1,ans2);
			}
			return dp[i][j]=myAns;
	}
	
	public static int LcsI(String  str1,String str2) {

			int n = str1.length();
			int m = str2.length();
			
			int [][]dp = new int[n+1][m+1];
			for(int i=0;i<dp.length;i++) {
				for(int j=0;j<dp[0].length;j++) {
					dp[i][j] =0;
				}
			}
			
			for(int i=n-1;i>=0;i--) {
				for(int j=m-1;j>=0;j--) {
					int ans;
					if(str1.charAt(i)==str2.charAt(j)) {
						ans = 1 + dp[i+1][j+1];
					}else {
						int ans1 = dp[i][j+1];
						int ans2 = dp[i+1][j];
						ans = Math.max(ans1, ans2);
					}
					dp[i][j] = ans;
				}
			}
			return dp[0][0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "bedgmtc";
		String str2 = "abdfgltc";
		
		int dp[][] = new int[str1.length()][str2.length()];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] =-1;
			}
		}
		int ans = Lcs(str1,str2,0,0);
		int ans2 = LcsR(str1,str2,0,0,dp);
		int ans3 = LcsI(str1,str2);
		System.out.println(ans + " " + ans2 + " " + ans3);
	}

}
