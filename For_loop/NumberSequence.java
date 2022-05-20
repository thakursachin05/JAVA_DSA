package forloop;

import java.util.Scanner;

public class NumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int prev = s.nextInt();
			boolean result=true;
			boolean isDec = true;
			for(int i=1;i<n;i++) {
				int x = s.nextInt();
				if(prev==x) {
					result=false;
				}
				else if(prev>x) {
					if(!isDec) {
						result=false;
					}
					isDec = true;
				}
				else {
					isDec = false;
				}
				prev=x;
			
			}
			System.out.print(result);
	}

}
