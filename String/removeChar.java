package String;

public class removeChar {
	
	public static String removeX(String str) {
		if(str.length()==0) {
			return str;
		}
		String ans = "";
		if(str.charAt(0) != 'x') {
			ans = ans + str.charAt(0);
		}
		String smallAns = ans + removeX(str.substring(1));
		return smallAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xfgf xx";
		System.out.print(removeX(str));
	}

}
