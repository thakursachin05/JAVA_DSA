import java.util.*;
public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		s.close();
		boolean isALargest = (a>=b) && (a>=c);
		System.out.print(isALargest);
	}

}
