package queues;

import java.util.*;

public class queueCollection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue= new LinkedList<>();
		queue.add(10);
		queue.add(20);
		System.out.print(queue.poll());
		System.out.print(queue.poll());
		System.out.print(queue.poll());
	}

}
