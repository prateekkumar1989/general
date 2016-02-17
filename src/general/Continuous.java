package general;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Continuous {
	
	char[] input;
	
	public Continuous(String string) {
		input = string.toCharArray();
		System.out.println(string);
	}

	public void solve() {
		int longest = 0, starting = 0, ending = 0;
		int length=0, start=0, end=0;
		
		for(int i=0; i<input.length; i++) {
			
			Boolean works = true;
			length=0; start=i; end=0;
			
			for(int j=i; j<input.length-1; j++) {
				if(input[j] >= input[j+1]) {
					works = false;
					break;
				}
				length++;
				end++;
			}
			
			if(length > longest) {
				longest=length; starting = start; ending = start+end;
			}
			
		}
		
		System.out.println("Longest: " + ++longest + " start: " + starting + " end: " + ending);
		for(int i=starting; i<=ending; i++) System.out.print(input[i]);
	}


}
