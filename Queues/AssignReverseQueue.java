package queues;

import java.util.*;

public class AssignReverseQueue {
	public static void reverseQueue(Queue<Integer> q1) {
		if(q1.size()==0) return;
		int temp = q1.poll();
		reverseQueue(q1);
		q1.add(temp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		reverseQueue(q1);
		while(!q1.isEmpty()) {
			System.out.print(q1.poll()+" ");
		}
		
	}

}
