package forloop;

import java.util.Scanner;

public class SumorProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int c = s.nextInt();
			
			int product=1;
			int sum=0;
			for(int i=1;i<=n;i++) {
				sum+=i;
				product*=i;
			}
			if(c==1) System.out.print(sum);
			else if(c==2) System.out.print(product);
			else System.out.print(-1);
	}

}
