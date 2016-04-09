package general;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	
	private T data;
	private Node<T> parent;
	private List<Node<T>> link;		
	
	public Node(T data) {
		this.data = data;
		link = new ArrayList<Node<T>>();
		link.add(0, null);
	}
	
	public Node() {
		link = new ArrayList<Node<T>>();
		link.add(0, null);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getParent() {
		return parent;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}

	public List<Node<T>> getLink() {
		return link;
	}

	public void setLink(List<Node<T>> link) {
		this.link = link;
	}
	
	/*int data = 0;
	Node link = null;
	*/ 
	
}
