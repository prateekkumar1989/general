package general;

import java.util.List;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class General {

	public static void main(String[] args) throws Throwable {
		
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
		System.out.println(stack.toString());
		
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
		
		Continuous continuous = new Continuous(args[0]);
		continuous.solve();
		
		PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());
		pq.offer(3);
		pq.offer(2);
		pq.offer(1);
		
		while(pq.size()>0) System.out.println(pq.poll());*/
		
		/*int input[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int array[]; 
		
		BubbleSort bubblesort = new BubbleSort(input);
		array = bubblesort.sort();
		System.out.println(Arrays.toString(array));
		
		SelectionSort selectionsort = new SelectionSort(input);
		array = selectionsort.sort();
		System.out.println(Arrays.toString(array));
		
		InsertionSort insertionsort = new InsertionSort(input);
		array = insertionsort.sort();
		System.out.println(Arrays.toString(array));
		
		MergeSort mergesort = new MergeSort(input);
		array = mergesort.sort();
		System.out.println(Arrays.toString(array));
		
		General general = new General();
		general.finalize();
		
		BST bst1 = new BST();
		bst1.add(4);
		bst1.add(2);
		bst1.add(1);
		bst1.add(3);
		bst1.add(5);
		bst1.add(6);
		bst1.add(7);
		
		//bst1.display(bst1.root); System.out.println();
		bst1.inorder(bst1.root); System.out.println();
		bst1.preorder(bst1.root); System.out.println();
		//bst1.postorder(bst1.root); System.out.println();
		
		BST bst2 = new BST();
		bst2.add(4);
		bst2.add(2);
		bst2.add(1);
		bst2.add(3);
		bst2.add(5);
		bst2.add(6);
		bst2.add(7);
		
		bst2.inorder(bst2.root); System.out.println();
		bst2.preorder(bst2.root); System.out.println();
		
		if(new BST().identicalTrees(bst2.root, bst2.root)) System.out.println("Equal trees");
		else System.out.println("Different trees");*/
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize");
	}

}
