package general;

import java.util.*;

public class CollectionsLauncher {

	
	List list; //These are interfaces which some of the classes implement
	Arrays array; //has asList and sort on array
	Collections collection; //has sort on list
	
	ArrayList arraylist; //dynamic array
	LinkedList linkedlist;
	
	Deque deque;
	Iterator itr;
	
	public CollectionsLauncher() {
		
		arraylist = new ArrayList();
		linkedlist = new LinkedList();
		
		deque = new ArrayDeque();
	}

	public void launch() {
		
		list = arraylist;
		list.add(1); list.add(2); list.add("not type safe");  
		System.out.println(list);
		
		itr = list.iterator();
		while(itr.hasNext())	System.out.println(itr.next());
		
	}

}
