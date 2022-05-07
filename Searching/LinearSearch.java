
public class LinearSearch {
	
    public static int linearSearch(int[] arr, int x) {
    	//Your code goes here
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x) return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
    	int []arr = {1,2,4,5,6,78};
    	int index = linearSearch(arr,6);
    	System.out.println(index);
    }
}
