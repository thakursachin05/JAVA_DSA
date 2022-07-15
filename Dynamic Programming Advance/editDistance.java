package dp2;

public class editDistance {

	public static int EditDistance(String str1,String str2,int i,int j) {
		if(str1.length()==i) {
			return 0;
		}
		if(str2.length()==j) {
			return str1.length();
		}
//		if(i==str1.length() || j==str2.length()) {
//			return ;
//		}
		int myAns;
		if(str1.charAt(i)==str2.charAt(j)) {
			int ans = EditDistance(str1,str2,i+1,j+1);
			myAns = ans;
		}
		else {
			int ans1 = EditDistance(str1,str2,i+1,j);
			int ans2 = EditDistance(str1,str2,i,j+1);
			int ans3 = EditDistance(str1,str2,i+1,j+1);
			myAns = 1+ Math.min(ans2, Math.min(ans1, ans3));
		}
		return myAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "dc";
		System.out.print(EditDistance(str1,str2,0,0));
	}

}
