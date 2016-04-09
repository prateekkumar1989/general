package general;

public class BinarySearch {
	
	int input[];

	public BinarySearch(int input[]) {
		this.input = input;
	}

	public int find(int key, int start, int end) {

		if(start > end) return -1;
		
		int mid = (start + end)/2;
		if(input[mid] > key) 
			return find(key, start, mid-1);
		else 
			if(input[mid] < key) 
				return find(key, mid+1, end);		
			else return mid;
	}
	

}
