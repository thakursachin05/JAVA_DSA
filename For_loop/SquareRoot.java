package forloop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int i=1;
			while(i*i<=n) {
				i++;
			}
			System.out.println(i-1);
	}

}
