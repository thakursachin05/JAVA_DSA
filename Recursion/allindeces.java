
public class allindeces {
	public static int[] allIndeces(int []input,int i,int num) {
		if(i==input.length) {
			int []arr = new int[0];
			return arr;
		}
		int smallOutput[]=allIndeces(input,i+1,num);
			
		if(input[i]==num) {
			int output[] = new int[smallOutput.length+1];
			output[0]=i;
			for(int k=0;k<smallOutput.length;k++) {
				output[k+1] = smallOutput[k];
			}
			return output;
		}
		else {
			return smallOutput;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,23,56,6,5,55,6,45,45,4,5,4,5,4};
		int []result = allIndeces(arr,0,4);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i] + " ");
		}
	}

}
