import java.util.Scanner;

public class ReturnArraySum {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int []arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
		
	}
	
	public static void print(int []arr) {
		int size = arr.length;
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int largestOfArray(int []arr) {
		int size = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int sumOfArray(int []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		System.out.print(sumOfArray(arr));
	}

}
