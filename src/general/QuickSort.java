package general;

public class QuickSort {

	private int array[];
	private int size;
		
	public QuickSort(int[] input) {
		this.array = input;
		this.size = input.length;
	}

	public int[] sort() {
		quicksort(0, size-1);
		return array;
	}

	private void quicksort(int p, int r) {
		
		if(p < r) {
			int q = partition(p, r);
			quicksort(p, q-1);
			quicksort(q+1, r);
		}
	}

	private int partition(int p, int r) {
		
		int pivot = array[r];
		int i=p-1;
		for(int j=p; j<=r-1; j++) {
			if(array[j]<pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[r];
		array[r] = temp;
		return (i+1);
	}
}
