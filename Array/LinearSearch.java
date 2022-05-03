import java.util.Scanner;

public class LinearSearch {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int []arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
		
	}
	public static int linearSearch(int []arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		int x = 10;
		System.out.print(linearSearch(arr,x));
	}

}
