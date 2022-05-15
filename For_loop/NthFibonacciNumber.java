package forloop;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int result=1;
		 int last= 1;
		 int secondLast = 1;
		 for(int i=3;i<=n;i++) {
			
			secondLast = last;
			last = result;
			 
			result=last + secondLast;
		 }
		 System.out.print(result);
	}

}
