package String;

public class ReplaceCharRecursively {
	public static String replaceChar(String str,char a,char c) {
		if(str.length()==0) {
			return str;
		}
		String ans="";
		if(str.charAt(0)==a) {
			ans += c;
		}
//		if(str.charAt(0)!=a) {
//			ans+=str.charAt(0);
//		}
		else ans+=str.charAt(0);
		return ans+replaceChar(str.substring(1),a,c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="tttttttttatmt";
		System.out.print(replaceChar(str,'t','r'));
	}

}
