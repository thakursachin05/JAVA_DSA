package stack;

public class stackLLTest {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
		int arr[] = {5,6,7,8,9};
		
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

}
