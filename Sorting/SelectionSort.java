package Sorting;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex!=i) {
				
				arr[minIndex] = arr[i];
				arr[i]=min;
			}
			
			
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
		selectionSort(arr);
		print(arr);
		
		
	}

}
