package general;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueCharacters {
	
	HashMap hm;
	
	public UniqueCharacters() {
		hm = new HashMap();
	}

	public void launch() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] inputchars = input.toCharArray();
		Boolean hasunique = true; 
		
		for (char c : inputchars) {
			if(hm.containsKey(c)) {
				hasunique = false; 
				break;
			}
			else hm.put(c, c); 
		}
		System.out.println("Has unique characters: " + hasunique); 
		//given two strings, to check if str2 is a permutation of other, use this hashmap to check if each char in str2 returns true from containsKey
	}

}
