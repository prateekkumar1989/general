package general;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolishNotation {
	
	Map<Character, Integer> precedence = new HashMap<Character, Integer>();
	java.util.Stack<Character> opStack;
	
	public PolishNotation() {
		
		precedence.put('^', 3);
		precedence.put('/', 2);
		precedence.put('*', 2);
		precedence.put('+', 1);
		precedence.put('-', 1);
	}
	
	public String infixToPrefix(String infix) {
		
		String Rinfix = new StringBuffer(infix).reverse().toString();
		String temp = infixToPostfix(Rinfix);
		return new StringBuffer(temp).reverse().toString();
		
	}

	public String infixToPostfix(String infix) {

		String postfix = "";
		opStack = new java.util.Stack<Character>();
		
		for(int i=0; i<infix.length(); ++i) {
			
			char cur = infix.charAt(i);
			
			if(isOperator(cur)) {
				
				while(!opStack.empty() && getPrecedence(opStack.peek()) >= getPrecedence(cur))	postfix += opStack.pop();
				opStack.push(cur);
			}
			else postfix += String.valueOf(cur);
			
		}
		
		while(!opStack.empty()) postfix += opStack.pop();
		return postfix;
	}
	
	boolean isOperator(char ch) {
		
		return precedence.containsKey(ch);
	}
	
	int getPrecedence(char ch) {
		
		return precedence.getOrDefault(ch, 0);
	}

	public String prefixToPostfix(String prefix) {
		
		String postfix = "";
		opStack = new java.util.Stack<Character>();
		
		for(int i=0; i<prefix.length(); ++i) {
			
			char cur = prefix.charAt(i);
			
			if(isOperator(cur)) opStack.push(cur);
			else {
				//number
				postfix += cur;
				while(!opStack.empty() && opStack.peek() == '~') {
					opStack.pop(); 
					postfix += opStack.pop();
				}
				opStack.push('~');
			}
			
		}

		return postfix;
	}

}
