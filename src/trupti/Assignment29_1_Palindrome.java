package trupti;

import java.util.Arrays;

public class Assignment29_1_Palindrome {
	
	String isPalindrome(String input) {
		String input1=input.toLowerCase();
		char[] ch=input1.toCharArray();
		String output="";
		for(int index=ch.length-1; index>=0; index--) {
			output+=ch[index];
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		Assignment29_1_Palindrome p= new Assignment29_1_Palindrome();
		String input="aabbaa";
		String output1=p.isPalindrome(input);
		if(input.equals(output1)) {
			System.out.println(input+ " is Palindrome");
		}else {
			System.out.println(input+ " is not Palindrome");
		}
	}
}
