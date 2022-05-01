import java.util.Scanner;
public class SimpleInterestCalculator {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
//			String str = "abcd";
//			String str = s.nextLine();
			String str = s.next();
			System.out.println(str);
			
			char c = str.charAt(0);
			int p = s.nextInt();
			int r = s.nextInt();
			int t = s.nextInt();
			
//			long l = s.nextLong();
//			float f = s.nextFloat();
//			double d = s.nextDouble();
			
			
			int si = (p*r*t)/100;
			
			System.out.println(si);
		}
}
