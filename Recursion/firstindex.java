
public class firstindex {
	private static int first(int []input,int i,int num) {
		if(i<0) return -1;
		if(input[i]==num) return i;
		return first(input,i+1,num);
	}
	private static int last(int []input,int i,int num) {
//		if(i==input.length-1 && input[i]==num) return i;
		if(i==input.length) return -1;
		int index = last(input,i+1,num);
		if(index!=-1) return index;
		if(input[i]==num) return i;
		else return -1; 
//		return index;
	}
	public static int indexl(int []input,int num) {
		return last(input,0,num);
	}
	public static int indexf(int []input,int num) {
		return first(input,0,num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,23,56,6,5,55,6,45,45,4,5,4,5,4};
		System.out.print(indexl(arr,45));
	}

}
