package queues;

public class QueueArrayTest {

	public static void main(String[] args) throws QueueEmptyException, QueueFullException {
		// TODO Auto-generated method stub
		QueueUsingStack<Integer> queue = new QueueUsingStack<Integer>();
		int arr[] = {1,4,5,546,32,45,54};
		for(int x : arr) {
			queue.enqueue(x);
		}
		
		while(!queue.isEmpty()) {
			System.out.print(queue.dequeue()+" ");
		}
	}

}
