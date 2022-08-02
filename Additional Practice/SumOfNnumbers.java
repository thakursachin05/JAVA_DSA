import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int sum = 0;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
