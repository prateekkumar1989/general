package general;

public class RotateArray {
	
	private int array[];
	private int head, tail;
	private int max;
	
	public RotateArray(int max) {
		this.max = max;
		array = new int[max];
		head = 0;
		tail = max-1;
	}
	
	int convert(int i) {
		return Math.floorMod(head + i, max);
	}
	
	int get(int i) {
		if(i<0 || i>max) return -1;
		return array[convert(i)];
	}
	
	boolean put(int i, int data) {
		
		array[convert(i)] = data;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<max; i++) sb.append(array[convert(i)] + " ");
		return sb.toString();
	}

	public void rotate(int i) {
		head = convert(i);
	}

}
