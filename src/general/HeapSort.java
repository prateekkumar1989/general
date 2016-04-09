package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapSort {

	private List<Integer> array;
	private int length;
	private int heap_size;

	public HeapSort(int[] input) {
		array = new ArrayList<Integer>();
		for(int i=0; i<input.length; i++) array.add(input[i]);
		length = heap_size = array.size()-1;
		build_max_heap();
	}
	
	Integer parent(int i) {
		return i/2;
	}
	
	Integer left(int i) {
		return 2*i;
	}
	
	Integer right(int i) {
		return 2*i + 1;
	}
	
	void max_heapify(int i) {
		int l = left(i);
		int r = right(i);
		int largest = 0;
		
		if(l<=heap_size && array.get(l)>array.get(i)) largest = l;
		else largest = i;
		if(r<=heap_size && array.get(r)>array.get(largest)) largest = r;
		if(largest != i) {
			int temp = array.get(largest);
			array.set(largest, array.get(i));
			array.set(i, temp);
			max_heapify(largest);
		}
		
	}

	void build_max_heap() {
		for(int i = length/2; i>=0; i--) max_heapify(i);
	}

	public List<Integer> sort() {
		
		for(int i = length; i>=1; i--) {
			int temp = array.get(0);
			array.set(0, array.get(i));
			array.set(i, temp);
			
			heap_size--;
			max_heapify(0);
		}
		length = heap_size = array.size()-1;
		return array;
	}
	
	int heap_extract_max() {
		if(heap_size<0) return -1;
		int max = array.get(0);
		array.set(0, array.get(heap_size));
		heap_size--;
		max_heapify(0);
		return max;
	}
}
