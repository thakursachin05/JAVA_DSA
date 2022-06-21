package stack;
import java.util.*;
public class reverseStack {
	public static void reverse(Stack<Integer> s1,Stack<Integer> s2) {
		if(s1.size()==0 || s1.size()==1) return;
		int temp = s1.pop();
		reverse(s1,s2);
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(temp);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		int arr[] = {5,4,3,2,1};
		for(int x : arr) {
			s1.push(x);
		}
//		reverse(s1,s2);
		while(!s1.isEmpty()) {
			System.out.print(s1.pop()+" ");
		}
	}

}
