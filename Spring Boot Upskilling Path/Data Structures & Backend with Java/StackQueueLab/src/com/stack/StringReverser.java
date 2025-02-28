package com.stack;

import java.util.Stack;

public class StringReverser {
	public String reverse(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch: str.toCharArray()) 
			stack.push(ch);
		
		String revesed = "";
		while(!stack.empty())
			revesed += stack.pop();
		
		return revesed;
	}
		
	public static void main(String[] args) {
		String str = "abcd";
		StringReverser reverse = new StringReverser();
		String result = reverse.reverse(str);
		System.out.println("Original String : "+result);
		System.out.println("Reverse String : "+result);
	}
}
