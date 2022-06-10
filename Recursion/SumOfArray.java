
public class SumOfArray {
	public static int SumArray(int []arr,int i) {
		if(i==arr.length) return 0;
		return arr[i]+SumArray(arr,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,7,5,5,4,-54};
		System.out.print(SumArray(arr,0));
	}

}
