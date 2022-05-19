import java.util.*;
public class ArrayUse {
	
	public static int[][] takeInput(int n,int m){
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]= s.nextInt();
			}
		}
		
		return arr;
	}
	public static void print(int n,int m,int arr[][]){
	
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr2d[][] = new int[3][4];
//		System.out.println(arr2d[1][2]);
//		arr2d[2][0]=15;
//		System.out.println(arr2d[2][0]);
//		int arr2[][]= {{1,2,3},{4,5,6}};
		int arr[][] = takeInput(3,3);
		print(3,3,arr);
		
		
		
	}

}
