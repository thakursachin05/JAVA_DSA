import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int j = 1;
			char startingChar = (char)('A'+i-1);
			while(j<=i) {
//				int c = 'A' + j -1;
//				char ch = (char)c;
//				System.out.print(ch);
				System.out.print((char)('A'+i-1));
				startingChar = (char)(startingChar+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
