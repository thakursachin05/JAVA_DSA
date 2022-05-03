import java.util.Scanner;

public class Increament {

	
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
		public static void increamentArr(int []arr) {
			arr = new int[5];
			for(int i=0;i<arr.length;i++) {
				
					arr[i]++;
				
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int arr[] = {1,2,3,4,5};
			increamentArr(arr);
			print(arr);
	}

}
