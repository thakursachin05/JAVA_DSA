package forloop;

import java.util.Scanner;

public class TermOfAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			int x = s.nextInt();
			int count=0;
			for(int i=1;count!=x;i++) {
				if((3*i+2)%4!=0) {
					System.out.print(3*i+2 + " ");
					count++;
				}
			}
	}

}
