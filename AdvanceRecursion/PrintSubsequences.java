package AdvanceRecursion;

public class PrintSubsequences {
	public static void printSubsequence(String s,String outputSofar) {
		if(s.length() == 0) {
			System.out.print(outputSofar + " ");
			return;
		}

		printSubsequence(s.substring(1),outputSofar+s.charAt(0));
		printSubsequence(s.substring(1),outputSofar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubsequence("abc","");
	}

}
