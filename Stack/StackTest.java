package stack;

public class StackTest {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		StackArray stack = new StackArray();
		int arr[] = {5,6,7,8,9};
		
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
//		stack.push(10);
//		System.out.println(stack.top());
//		stack.pop();
//		stack.size();
//		System.out.print(stack.isEmpty());
		
		
	}

}
