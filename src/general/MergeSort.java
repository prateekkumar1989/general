package general;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	private int array[];
	private int size;
		
	public MergeSort(int[] input) {
		this.array = input;
		this.size = input.length;
	}

	public int[] sort() {
		
		merge_sort(0, size-1);
		return array;
	}

	private void merge_sort(int p, int r) {
		if(p < r) {
			int q = (p + r) / 2;
			//System.out.println("p = " + p + " q = " + q + " r = " + r);
			merge_sort(p, q);
			merge_sort(q+1, r);
			merge(p, q, r);
		}
	}

	private void merge(int p, int q, int r) {
		int n1 = q-p+1;
		int n2 = r-q;
		
		int L[] = new int[n1+1]; 
		int R[] = new int[n2+1];
		
		for(int i=0; i<n1; i++) L[i] = array[p+i]; 
		for(int j=0; j<n2; j++) R[j] = array[q+1+j];
		L[n1]=Integer.MAX_VALUE; R[n2]=Integer.MAX_VALUE;
		int i=0, j=0, k=0;
		//System.out.println("p = " + p + " q = " + q + " r = " + r);
		
		for(k=p; k <= r; k++) { 
			//System.out.println("k = " + k + " i = " + i + " j = " + j);
			
			if(L[i] <= R[j]) { 
				array[k] = L[i]; 
				i++; }
			else { 
				array[k] = R[j]; 
				j++; 
			}
		}		
		
	}
}
