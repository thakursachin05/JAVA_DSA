
public class CheckNumberinArray {
	public static boolean checkNum(int []arr,int i,int num) {
		if(i==arr.length) return false;
		if(num==arr[i]) return true;
		return checkNum(arr,i+1,num);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,23,56,6,5,55,6};
		System.out.print(checkNum(arr,0,64));
	}

}
