package forloop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			/* int i=1;
			int sum=0;
			while(i<=n) {
				sum+=i;
				i++;
			}
			System.out.print(sum);
			*/
			int sum=0;
			for(int i=1;i<=n;i++) {
				sum += i;
			}
			for(int i=1,j=1;i<=n;i++,j++) {
				sum += i;
			}
			System.out.println(sum);
			
	}

}
