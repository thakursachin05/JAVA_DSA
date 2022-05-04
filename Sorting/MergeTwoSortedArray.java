package Sorting;

public class MergeTwoSortedArray {
	public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        
        int i=0;
        int j=0;
        int n = arr1.length;
        int m = arr2.length;
        int []arr = new int[n+m];
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            arr[k]=arr1[i];
            i++;
            k++;
        }
         while(j<m){
            arr[k]=arr2[j];
            j++;
            k++;
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
		
		int arr1[] = {1,3,5,7};
		int arr2[] = {2,4,6,8};
		
		print(merge(arr1,arr2));
		
		

	}

}
