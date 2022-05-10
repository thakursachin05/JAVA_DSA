import java.util.Scanner;
public class Sorting2dArray {
	
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int rows = s.nextInt();
		System.out.println("Number of columns ");
		int cols = s.nextInt();
		int input[][] = new int[rows][cols];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j ++){
				System.out.println("Enter element at "+i+" row "+j+" column");
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void print(int[][] input){
		int rows = input.length;
		int cols = input[0].length;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int largestColumnSum(int input[][]) {
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<input[0].length;i++) {
			int sum=0;
			for(int j=0;j<input.length;j++) {
				sum+=input[j][i];
			}
			if(largest<sum) {
				largest=sum;
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = takeInput();
		print(arr);
		System.out.println("Largest col sum "+ largestColumnSum(arr));
	}

}
