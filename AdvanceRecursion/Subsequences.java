package AdvanceRecursion;

public class Subsequences {
	public static String[] findSubsequence(String str) {
		if(str.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String smallAns[] = findSubsequence(str.substring(1));
		String ans[] = new String[2*smallAns.length];
		for(int i=0;i<smallAns.length;i++) {
			ans[i]=smallAns[i];
		}
		for(int i=0;i<smallAns.length;i++) {
			ans[i+smallAns.length]=str.charAt(0)+smallAns[i];
		}
		return ans;
		
	}
	public static String[] findSubsequence1(String str) {
		if(str.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String smallAns[] = findSubsequence(str.substring(0,str.length()-1));
		String ans[] = new String[2*smallAns.length];
		for(int i=0;i<smallAns.length;i++) {
			ans[i]=smallAns[i];
		}
		for(int i=0;i<smallAns.length;i++) {
			ans[i+smallAns.length]=smallAns[i]+str.charAt(str.length()-1);
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		String ans[] = findSubsequence1(str);
		for(int i=0;i<ans.length;i++) {
			
			System.out.println(ans[i]+" ");
		}
	}

}
