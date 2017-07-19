package general;

import java.util.ArrayList;
import java.util.List;


/* https://stackoverflow.com/questions/29910312/algorithm-to-get-all-the-combinations-of-size-n-from-an-array-java */
public class Combinations {

	int[] input;
	int k;
	List<int[]> subsets;
	int[] s;
	
	public Combinations(int[] input, int k) {
		
		this.input = input;
		this.k = k;
		subsets = new ArrayList<>();
		s = new int[k];
	}
	
	public List<int[]> getnCk() {
		
		if (k <= input.length) {
		    // first index sequence: 0, 1, 2, ...
		    for (int i = 0; (s[i] = i) < k - 1; i++);  
		    subsets.add(getSubset(input, s));
		    for(;;) {
		        int i;
		        // find position of item that can be incremented
		        for (i = k - 1; i >= 0 && s[i] == input.length - k + i; i--); 
		        if (i < 0) {
		            break;
		        }
		        s[i]++;                    // increment this item
		        for (++i; i < k; i++) {    // fill up remaining items
		            s[i] = s[i - 1] + 1; 
		        }
		        subsets.add(getSubset(input, s));
		    }
		}		
		
		return subsets;
	}
	
	// generate actual subset by index sequence
	int[] getSubset(int[] input, int[] subset) {
		
	    int[] result = new int[subset.length]; 
	    for (int i = 0; i < subset.length; i++) 
	        result[i] = input[subset[i]];
	    return result;
	}
}
