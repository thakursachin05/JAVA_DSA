package String;

public class RemoveDuplicates {
	public static String removeDup(String str) {
		if(str.length()<=1) return str;
//		String ans = removeDup(str.substring(1));
		if(str.charAt(0)==str.charAt(1)) {
			return removeDup(str.substring(1));
		}
		else {
			
//			String finalAns = str.charAt(0) + removeDup(str.substring(1));
			return str.charAt(0) + removeDup(str.substring(1));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xxxyyyzwwzzz";
		System.out.print(removeDup(str));
	}

}
