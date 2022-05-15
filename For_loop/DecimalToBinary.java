package forloop;

import java.util.Scanner;
import java.lang.Math;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			long binary=0;
			int count=0;
			while(n>0) {
				int rem = n%2;
				
				
				binary = binary*10 + rem;
				if(rem==0 & binary==0) count++;
				n=n/2;
			}
			long rev=0;
			while(binary>0) {
				long rem = binary%10;
				rev = rev*10 + rem;
				binary /=10;
			}
			while(count>0) {
				rev*=10;
				count--;
			}
			
			System.out.println(rev);
	}

}
