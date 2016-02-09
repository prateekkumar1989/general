package general;

public class Stack<T> {
	
	private Node<T> top;

	public Stack() {
		top = null;
	}
	
	public void push(T data) {
		Node<T> temp = new Node<T>(data);
		if(top == null) top = temp;
		else {
			temp.getLink().set(0, top);
			top = temp;
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("Stack from top:");
		Node<T> cur = top;
		while(cur != null) {
			sb.append(" " + cur.getData().toString());
			cur = cur.getLink().get(0);
		}
		return sb.toString();
	}

	public T pop() {
		if(top == null) return null;
		T data = top.getData();
		top = top.getLink().get(0);
		return data;
	}
	
	public T peep() {
		return top.getData();
	}
}
