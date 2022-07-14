
public class lootHouses {

	public static int LootHouse(int arr[],int i, int n,int dp[]) {
		if(i+1 == n  || i+2 == n) {
			return arr[n-1];
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		int Sum = arr[i] + LootHouse(arr,i+2,n,dp);
		return dp[n] = Math.max(LootHouse(arr,i+1,n,dp), Sum);
	}
	
	public static int LootHouseAdvanced(int arr[],int n) {
		int dp[] = new int[n];
		dp[0]= arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		
		for(int i = 2;i<n;i++) {
			int sum = arr[i] + dp[i-2];
			dp[i] = Math.max(dp[i-1], sum);
		}
		return dp[n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int dp[] = new int[n+1];
		for(int i=0;i<n+1;i++) {
			dp[i] = -1;
		}
		int arr[] = {10, 2, 30, 20, 3, 50};
		System.out.print(LootHouseAdvanced(arr,n));
	}

}
