import java.util.Scanner;

public class MovingIntoFunction {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		print(arr);
	}

}
