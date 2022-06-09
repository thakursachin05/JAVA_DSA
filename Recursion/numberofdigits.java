
public class numberofdigits {
	public static int digit(int n) {
		if(n==0) return 0;
		return 1+digit(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(digit(571544554));
	}

}
