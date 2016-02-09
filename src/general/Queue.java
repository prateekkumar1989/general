package general;

public class Queue<T> {
	private Node<T> first, last;

	public Queue() {
		first = last = null;
	}
	
	public void enqueue(T data) {
		Node<T> temp = new Node<T>(data);
		if(last == null) first = last = temp;
		else {
			last.getLink().set(0, temp);
			last = temp;
		}
	}

	public T dequeue() {
		if(first == null) return null;
		T data = first.getData();
		first = first.getLink().get(0);
		return data;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("Queue from first to last:");
		Node<T> cur = first;
		while(cur != null) {
			sb.append(" " + cur.getData().toString());
			cur = cur.getLink().get(0);
		}
		return sb.toString();
	}
}
