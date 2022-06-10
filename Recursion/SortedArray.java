
public class SortedArray {
	public static boolean checkSorted(int input[]) {
		if(input.length <=1) {
			return true;
		}
		int smallInput[] = new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallInput[i-1] = input[i];
		}
		boolean smallAns = checkSorted(smallInput);
		if(!smallAns) {
			return false;
		}
		if(input[0]<=input[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkSorted_2(int input[]) {
		if(input.length <=1) {
			return true;
		}
		if(input[0]>input[1]) {
			return false;
		}
		int smallInput[] = new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallInput[i-1] = input[i];
		}
		boolean smallAns = checkSorted_2(smallInput);
		return smallAns;
	}
	
	
	private static boolean checkSortedBetter(int []input,int i) {
		if(i>=input.length-1) return true;
		if(input[i]>input[i+1]) return false;
		return checkSortedBetter(input ,i+1);
	}
	
	public static boolean checkSortedBetter(int []input) {
		return checkSortedBetter(input,0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,3,6,9};
		System.out.print(checkSortedBetter(input));
	}

}
