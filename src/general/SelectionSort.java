package general;

public class SelectionSort {
	
	private int array[];
	private int size;
		
	public SelectionSort(int[] input) {
		this.array = input;
		this.size = input.length;
	}

	public int[] sort() {

		for(int i=0; i<size-1; i++) {
			
			int min = i;
			for(int j=i; j<size; j++) {
				if(array[j] < array[min]) min = j;
			}
			
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
		return array;
	}
	
	

}
