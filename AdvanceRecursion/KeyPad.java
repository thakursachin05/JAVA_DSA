 package AdvanceRecursion;

public class KeyPad {
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
	
	public static String[] keypad(int n) {
		if(n==0 || n==1) {
			String result[] = {""};
			return result;
		}
		
		int number = n%10;
		String []smallAns = reqStrings(number);
		String[] ans = keypad(n/10);
		int size = smallAns.length;
		int N = ans.length;
		String[] finalAns = new String[size*N];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			for(int j=0;j<ans.length;j++) {
				
				finalAns[k] = ans[j] + smallAns[i];
				k++;
			}
		}
		
		
		return finalAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = keypad(726);
		for(int t=0;t<arr.length;t++) {
			System.out.println(arr[t]+" ");
		}
	}

}
