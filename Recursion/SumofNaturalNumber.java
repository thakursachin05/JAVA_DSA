
public class SumofNaturalNumber {
	public static int Sum(int n) {
		if(n==0) return 0;
		return n+Sum(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Sum(4));
	}

}
