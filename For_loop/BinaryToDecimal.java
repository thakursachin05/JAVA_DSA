package forloop;

import java.util.Scanner;
import java.lang.Math;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int dec=0;
			int count=0;
			while(n>0) {
				int rem = n%10;
				dec +=  rem*(int)Math.pow(2, count);
				count++;
				
				n/=10;
			}
			System.out.print(dec);
	}

}
