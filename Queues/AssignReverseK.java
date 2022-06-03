package queues;

import java.util.*;
public class AssignReverseK {
	public static void reverseK(Queue<Integer> q1,int k) {
		if(q1.size()==0) return;
	
		Stack<Integer> s1 = new Stack<>();
		for(int i=0;i<k;i++) {
			s1.push(q1.poll());
		}

		while(!s1.isEmpty()) {
			q1.add(s1.pop());
		}
		for(int i=0;i<q1.size()-k;i++) {
			q1.add(q1.poll());
		}
//		q1 = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		reverseK(q1,3);
		while(!q1.isEmpty()) {
			System.out.print(q1.poll()+" ");
		}
	}

}
