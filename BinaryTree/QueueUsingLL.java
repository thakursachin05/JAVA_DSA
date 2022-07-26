package BinaryTree;



public class QueueUsingLL<T> {

	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size=0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void enqueue(T ele) {
		Node<T> newNode = new Node<>(ele);
		size++;
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	public T front() throws QueueEmptyException {
		if(front == null) throw new QueueEmptyException();
		return front.data;
	}
	public T dequeue() throws QueueEmptyException {
		if(front==null) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(front==null) {
			rear = null;
		}
		size--;
		return temp;
	}

}
