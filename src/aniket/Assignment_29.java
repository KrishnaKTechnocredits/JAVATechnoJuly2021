package aniket;

public class Assignment_29 {
	boolean isPalindrome(String name) {
		boolean flag=true;
		String reverse ="";
		for(int index=name.length()-1;index>=0;index--) {
			char ch=name.charAt(index);
			reverse+=ch;		
		}
		if(name.equals(reverse))
		 System.out.println("String is palindrome");
		else {
			flag=false;
			System.out.println("String is not a palindrome");
			
		}
		return flag;
	}
	public static void main(String[] args) {
		
		String name="naman";
		System.out.println(new Assignment_29().isPalindrome(name));
	}
}
