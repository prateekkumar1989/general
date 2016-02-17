package general;

public class InsertionSort {
	
	private int array[];
	private int size;
		
	public InsertionSort(int[] input) {
		this.array = input;
		this.size = input.length;
	}

	public int[] sort() {
		
		for(int i=1; i<size; i++) {
			int j, key = array[i];
			for(j=i-1; j>=0 && array[j]>key; j--) array[j+1] = array[j];	
			array[j+1] = key;
		}
		
		return array;
	}

}
