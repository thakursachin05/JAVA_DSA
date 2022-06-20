package stack;

import java.util.*;
public class BalencedParathesis {
	public static boolean balenced(String s) {
		Stack<Character> st = new Stack<>();
		if(s.charAt(0)==')') return false;
		st.push(s.charAt(0));
		int i=1;
		while(i<s.length()) {
			if(s.charAt(i)=='(') {
				st.push(s.charAt(i));
			}
			else {
				if(!st.isEmpty()) {
					st.pop();
				}
				else return false;
			}
			i++;
		}
		if(st.size()!=0) return false;
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "()()(())";
		System.out.print(balenced(s));
	}

}
