package general;

public class BubbleSort {
	
	private int array[];
	private int size;
		
	public BubbleSort(int[] input) {
		this.array = input;
		this.size = input.length;
	}

	public int[] sort() {
		
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		return array;
	}

}
