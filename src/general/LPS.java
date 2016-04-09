package general; 
/*
	Solution to Longest Palindrome strings
	for application to MacLaren Applied Technologies in Singapore (Software Engineer)
	Author: Prateek Kumar <prateekk.in@gmail.com> +65 8450 9475 sg.linkedin.com/in/prateekkumarmanipal
	
	Instructions: This program can be run either in Eclipse (just insert package name; on top or on any online java compiler like ideone.com)
	Sample input: sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop
	Output: 
			Text: hijkllkjih, Index: 23, Length: 10
			Text: defggfed, Index: 13, Length: 8
			Text: abccba, Index: 5, Length: 6
			
	Notes: Its a DP solution that finds simple palindromes (consecutive identical letters or 3 letter ones) and expands outwards on both sides until it either finds 
	a larger palindrome or not. After this, the largest palindrome is deleted from input string and we run the program 2 more times to get a total of 3 largest palindrome.
	Its not the brute force solution which would be to find all substrings, check if they're palindromic and print the largest, but its less complex than the standard Manacher algorithm.
*/

import java.util.Scanner;


class LPS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		sc.close();
		
		string = findLongest(string);
		string = findLongest(string);
		string = findLongest(string);
	}


	private static String findLongest(String string) {
		
		if (string == null || string == " ") return null;
		
		slps longest = new slps(0, 0, 1);
		
	    for (int i = 0; i < string.length() - 1; i++) {
	    	
	    	slps l = new slps();
	    	
	    	if( string.charAt(i) == string.charAt(i+1) ) l = expandAround(string, i, i+1);
	    	if( i+2 < string.length() && string.charAt(i) == string.charAt(i+2) ) l = expandAround(string, i, i+2);
	    		
	    	if( l.length>longest.length ) longest = l;
	    	
	    }
	    
	    System.out.println("Text: " + string.substring(longest.begin, longest.end+1) + ", Index: " + longest.begin + ", Length: " + longest.length);
	    
	    return new String( string.substring(0, longest.begin) + string.substring(longest.end+1, string.length()) );
		
	}

	private static slps expandAround(String string, int begin, int end) {
		 
		slps pcount = new slps(begin, end, 0);
		
	    for (int i = begin, j = end; i >= 0 && j < string.length(); i--, j++) {
	        if (string.charAt(i) != string.charAt(j)) {
	            return pcount;
	        }
	         
	        pcount.begin = i;
	        pcount.end = j;
	        pcount.length = j-i+1;
	    }

	    return pcount;
	}

}

class slps {
	
	int begin; 
	int end;
	int length;
	
	public slps(int begin, int end, int length) { 
		this.begin = begin; 
		this.end = end; 
		this.length = length; 
	}

	public slps() {
		length = begin = end = 0;
	}
}
