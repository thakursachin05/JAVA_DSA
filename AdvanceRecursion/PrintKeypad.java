package AdvanceRecursion;

public class PrintKeypad {
	public static String[] reqStrings(int n) {
		if(n==2) {
			String result[] = {"a","b","c"};
 			return result;
		}
		if(n==3) {
			String result[] = {"d","e","f"};
 			return result;
		}

		if(n==4) {
			String result[] = {"g","h","i"};
 			return result;
		}

		if(n==5) {
			String result[] = {"j","k","l"};
 			return result;
		}

		if(n==6) {
			String result[] = {"m","n","o"};
 			return result;
		}

		if(n==7) {
			String result[] = {"p","q","r","s"};
 			return result;
		}

		if(n==8) {
			String result[] = {"t","u","v"};
 			return result;
		}
		if(n==9) {
			String result[] = {"w","x","y","z"};
 			return result;
		}
		else {
			String result[]= {};
			return result;
		}

	}
	
	public static void printKeypad(int n,String output) {
		if(n==0) {
			System.out.println(output);
			return;
		}
		String[] ans = reqStrings(n%10);
		
		for(int i=0;i<ans.length;i++) {	
			printKeypad(n/10, ans[i]+output);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKeypad(722446,"");
	}

}
