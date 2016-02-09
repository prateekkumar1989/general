package general;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class General {

	public static void main(String[] args) throws IOException {
		
		/*ReverseArray reversearray = new ReverseArray();
		reversearray.solve();
		
		CollectionsLauncher collectionslauncher = new CollectionsLauncher();
		collectionslauncher.launch();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println(a);
		
		Scanner sc = new Scanner(new FileInputStream("files/input.txt"));
		
		//Scanner sc = new Scanner(System.in);
		//List arraylist = new ArrayList();
		//while(sc.hasNextInt()) arraylist.add(sc.nextInt());
		
		//Integer[] array = new Integer[arraylist.size()];
		//array = (Integer[])arraylist.toArray(array);
		
		//for (Integer i : array) System.out.println(i.intValue());
		String str = new String();
		while(sc.hasNextInt()) str += sc.nextInt();
		
		char[] a = str.toCharArray();
		for(int i=0; i<a.length; i++) System.out.println(a[i]);
		
		GenericDemonstrator<Integer> genericdemonstrator = new GenericDemonstrator<Integer>(10);
		genericdemonstrator.add(1);
		genericdemonstrator.add(2);
		genericdemonstrator.add(3);
		
		System.out.println("Iterating");
		for(Integer gs : genericdemonstrator) {
			System.out.println(gs.intValue());
		}
		
		UniqueCharacters uniquecharacters = new UniqueCharacters();
		uniquecharacters.launch();
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.append(1);
		linkedlist.append(2);
		linkedlist.append(3);
		linkedlist.append(4);
		linkedlist.append(5);
		System.out.println(linkedlist.toString());
		linkedlist.delete(3);
		System.out.println(linkedlist.toString());
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Peeking: " + stack.peep());
		System.out.println(stack.toString());
		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());
		System.out.println(stack.toString());*/
		
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		System.out.println(queue.toString());
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println(queue.toString());
		
		
	}

	

}
