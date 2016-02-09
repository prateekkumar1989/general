package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Reverse an Array without iteration/loops
public class ReverseArray {

	public void solve() {
		
		List array = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for (int i=0; i<n; i++) array.add(sc.nextInt());
		array = reverse(array, array.size());
		for (int i=0; i<n; i++) System.out.print(array.get(i) + " ");
		
	}

	private List reverse(List list, int size) {
		int first, last;
		List atemp = new ArrayList();
		
		if(size == 1) atemp.add(list.get(0));
		else {
			first = (int) list.get(0);
			last = (int) list.get(size-1);
			
			if(size == 2) {
				atemp.add(last);
				atemp.add(first);
			}
			else {
				atemp.add(last);
				atemp.addAll(reverse(list.subList(1, size-1), size-2)); 
				atemp.add(first);
			}
		}
		
		return atemp;
		
	}

}
