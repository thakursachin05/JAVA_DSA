package queues;

import java.util.*;

public class QueueUsingStack<T> {

	Stack<T> s1;
	Stack<T> s2;
	
	public QueueUsingStack() {
		s1 = new Stack<>();
		s2 = new Stack<>();
		
	}
	public int size() {
		return s1.size();
	}
	public boolean isEmpty() {
		return s1.size()==0;
	}
	public void enqueue(T ele) {
		s1.push(ele);
	}
	public T front() throws QueueEmptyException {
		if(s1.isEmpty()) throw new QueueEmptyException();
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		T temp = s2.peek();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return temp;
	}
	public T dequeue() throws QueueEmptyException {
		if(s1.isEmpty()) throw new QueueEmptyException();
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		T temp = s2.peek();
		s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return temp;
	}

}
