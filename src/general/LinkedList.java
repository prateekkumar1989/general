package general;

import java.util.Iterator;

public class LinkedList<T> {

	private Node<T> head;
	
	public LinkedList() {
		head = null;
	}
	
	void append(T data) {
		
		Node<T> temp = new Node<T>(data);
		
		if(head == null) head = temp;
		else {
			Node<T> cur = head;
			while(cur.getLink().get(0) != null) {
				cur = cur.getLink().get(0);
			}
			cur.getLink().set(0, temp);
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("Contents:");
		Node<T> cur = head;
		while(cur != null) {
			sb.append(" " + cur.getData().toString());
			cur = cur.getLink().get(0);
		}
		return sb.toString();
	}

	public void delete(T data) {
		Node<T> cur = head;
		Node<T> prev = head;
		if(cur == null) return;
		if(head.getData().equals(data)) {
			head = head.getLink().get(0);
			return;
		}
		Boolean found = false;
		while(cur != null) {
			if(cur.getData().equals(data)) {
				found = true; 
				break;
			}
			prev = cur;
			cur = cur.getLink().get(0);
		}
		if(!found) return;
		prev.getLink().set(0, cur.getLink().get(0));
	}
	
	/*private Node head = null; 
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("Contents: ");
		Node cur = head;
		while(cur != null) { 
			sb.append(cur.data + " ");
			cur = cur.link;
		}
		return sb.toString();
	}

	public void append(int data) {
		Node temp = new Node(); 
		temp.data = data;
		
		if(head == null) head = temp;
		else {
			Node cur = head;
			while(cur.link != null) cur = cur.link;
			cur.link = temp;
		}
	}*/
	
	
	

}
