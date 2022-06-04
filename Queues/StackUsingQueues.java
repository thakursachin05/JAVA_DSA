package queues;
import java.util.*;

public class StackUsingQueues<T> {
	private Queue<T> q1 = new LinkedList<>();
	private Queue<T> q2 = new LinkedList<>();
	
	public StackUsingQueues() {
		q1 = null;
		q2 = null;
	}
	
	public int size() {
		return q1.size();
	}
	public boolean isEmpty() {
		return q1.size()==0;
	}
	public void push(T ele) {
		q1.add(ele);
	}
	public T pop() throws QueueEmptyException {
		if(q1.size()==0) throw new QueueEmptyException();
		while(q1.size()>1) {
			q2.add(q1.poll());
		}
		T ans = q1.poll();
		Queue<T> temp = q1;
		q1=q2;
		q2=temp;
		return ans;
	}
	public T top() throws QueueEmptyException {
		if(q1.size()==0) throw new QueueEmptyException();
		while(q1.size()>1) {
			q2.add(q1.poll());
		}
		T ans = q1.poll();
		q2.add(ans);
		Queue<T> temp = q1;
		q1=q2;
		q2=temp;
		return ans;
	}
}
