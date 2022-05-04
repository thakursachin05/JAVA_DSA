package Sorting;

public class InsertionSort {
	
	public static void insertionSort(int []arr) {
		for(int i=1;i<arr.length;i++) {
			 int j = i-1;
			 int temp = arr[i];
			 while(j>=0 && arr[j]>temp) {
				 arr[j+1] = arr[j];
				 j--;
			 }
			 arr[j+1] = temp;
		}
	}
	public static void print(int []arr) {
		int size = arr.length;
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,4,643,2,0};
		insertionSort(arr);
		print(arr);
		

	}

}
