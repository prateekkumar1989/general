package general;

import java.util.HashMap;

public class Hash2D {

	private HashMap<Integer, HashMap> row;

	public Hash2D() {
		row = new HashMap<Integer, HashMap>();
	}
	
	void insert(int r, int c, int data) {
		
		if(!row.containsKey(r)) {
			row.put(r, new HashMap());
			row.get(r).put(c, data);
		}
		else {
			row.get(r).put(c, data);
		}
	}
	
	int get(int r, int c) {
		
		if(!row.containsKey(r)) return -1;
		else return (int) row.get(r).get(c);
		
	}
	
	
}
