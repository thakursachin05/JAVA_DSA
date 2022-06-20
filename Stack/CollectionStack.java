package stack;

import java.util.Stack;
public class CollectionStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		int arr[] = {1,2,34,5,5};
		for(int x : arr) {
			stack.push(x);
		}
		while(!stack.isEmpty()) {
			
			System.out.println(stack.pop());
		}
//		stack.push(10);
//		System.out.println(stack.size());
//		System.out.println(stack.peek());
//		System.out.println(stack.isEmpty());
//		
		
	}

}
